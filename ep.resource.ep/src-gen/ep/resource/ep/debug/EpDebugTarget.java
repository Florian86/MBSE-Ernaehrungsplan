/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;

public class EpDebugTarget extends ep.resource.ep.debug.EpDebugElement implements IDebugTarget, ep.resource.ep.debug.IEpDebugEventListener {
	
	/**
	 * associated system process
	 */
	private ep.resource.ep.debug.EpDebugProcess process;
	
	private Socket eventSocket;
	
	private BufferedReader eventReader;
	
	/**
	 * containing launch object
	 */
	private ILaunch launch;
	
	private IThread[] threads;
	
	private ep.resource.ep.debug.EpDebugThread thread;
	
	private boolean terminated = false;
	
	/**
	 * event dispatch job
	 */
	private DebugEventDispatcher eventDispatch;
	/**
	 * event listeners
	 */
	private List<ep.resource.ep.debug.IEpDebugEventListener> eventListeners = new ArrayList<ep.resource.ep.debug.IEpDebugEventListener>();
	
	private ep.resource.ep.debug.EpDebugProxy debugProxy;
	
	private class DebugEventDispatcher extends Job {
		
		private ep.resource.ep.debug.EpDebugCommunicationHelper communicationHelper = new ep.resource.ep.debug.EpDebugCommunicationHelper();
		
		public DebugEventDispatcher() {
			super(new ep.resource.ep.mopp.EpMetaInformation().getSyntaxName() + " Event Dispatch");
			setSystem(true);
		}
		
		protected IStatus run(IProgressMonitor monitor) {
			while (!isTerminated()) {
				ep.resource.ep.debug.EpDebugMessage message = communicationHelper.receive(eventReader);
				if (message != null) {
					notifyListeners(message);
				} else {
					terminated();
					break;
				}
			}
			return Status.OK_STATUS;
		}
		
		private void notifyListeners(ep.resource.ep.debug.EpDebugMessage message) {
			Object[] listeners = eventListeners.toArray();
			for (int i = 0; i < listeners.length; i++) {
				((ep.resource.ep.debug.IEpDebugEventListener) listeners[i]).handleMessage(message);
			}
		}
	}
	
	public EpDebugTarget(ep.resource.ep.debug.EpDebugProcess process, ILaunch launch, int requestPort, int eventPort) {
		super(launch.getDebugTarget());
		this.process = process;
		this.launch = launch;
		this.thread = new ep.resource.ep.debug.EpDebugThread(this);
		this.threads = new IThread[] {this.thread};
		
		// initialize debug proxy
		try {
			this.debugProxy = new ep.resource.ep.debug.EpDebugProxy(this, requestPort);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// initialize asynchronous event dispatcher
		try {
			// creating event client socket (trying to connect)...
			this.eventSocket = new Socket("localhost", eventPort);
			// creating event client socket - done (connected).
			this.eventReader = new BufferedReader(new InputStreamReader(this.eventSocket.getInputStream()));
		} catch (ConnectException e) {
			throw new RuntimeException("Can't create socket: " + e.getMessage());
		} catch (UnknownHostException e) {
			throw new RuntimeException("Can't create socket: " + e.getMessage());
		} catch (IOException e) {
			throw new RuntimeException("Can't create socket: " + e.getMessage());
		}
		
		this.eventDispatch = new DebugEventDispatcher();
		this.eventDispatch.schedule();
		
		addEventListener(this);
		addEventListener(this.thread);
		addEventListener(this.process);
		
		DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
	}
	
	/**
	 * <p>
	 * Registers the given event listener. The listener will be notified of events in
	 * the program being interpreted. Has no effect if the listener is already
	 * registered.
	 * </p>
	 * 
	 * @param listener event listener
	 */
	public void addEventListener(ep.resource.ep.debug.IEpDebugEventListener listener) {
		if (!eventListeners.contains(listener)) {
			eventListeners.add(listener);
		}
	}
	
	/**
	 * <p>
	 * Deregisters the given event listener. Has no effect if the listener is not
	 * currently registered.
	 * </p>
	 * 
	 * @param listener event listener
	 */
	public void removeEventListener(ep.resource.ep.debug.IEpDebugEventListener listener) {
		eventListeners.remove(listener);
	}
	
	public String getName() throws DebugException {
		return new ep.resource.ep.mopp.EpMetaInformation().getSyntaxName() + " model";
	}
	
	public IDebugTarget getDebugTarget() {
		return this;
	}
	
	public IProcess getProcess() {
		return process;
	}
	
	public IThread[] getThreads() throws DebugException {
		return threads;
	}
	
	public boolean hasThreads() throws DebugException {
		return true;
	}
	
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		return breakpoint.getModelIdentifier().equals(getModelIdentifier());
	}
	
	public ILaunch getLaunch() {
		return launch;
	}
	
	public boolean canTerminate() {
		return getProcess().canTerminate();
	}
	
	public boolean isTerminated() {
		return terminated || getProcess().isTerminated();
	}
	
	public void terminate() throws DebugException {
		getThread().terminate();
	}
	
	private synchronized void terminated() {
		terminated = true;
		threads = new IThread[0];
		fireTerminateEvent();
		removeEventListener(this);
		removeEventListener(this.thread);
		removeEventListener(this.process);
		DebugPlugin debugPlugin = DebugPlugin.getDefault();
		try {
			debugPlugin.getBreakpointManager().removeBreakpointListener(this);
		} catch (NullPointerException npe) {
			// this is a workaround for Eclipse bug 352315 (see
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=352315)
		}
		getDebugProxy().terminate();
	}
	
	public boolean canResume() {
		return getThread().canResume();
	}
	
	public boolean canSuspend() {
		return getThread().canSuspend() && !isTerminated();
	}
	
	public boolean isSuspended() {
		return getThread().isSuspended();
	}
	
	public void resume() throws DebugException {
		getThread().resume();
	}
	
	public IThread getThread() {
		return thread;
	}
	
	public void suspend() throws DebugException {
		getThread().suspend();
	}
	
	public void breakpointAdded(IBreakpoint breakpoint) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if ((breakpoint.isEnabled() && getBreakpointManager().isEnabled()) || !breakpoint.isRegistered()) {
					ep.resource.ep.debug.EpLineBreakpoint lineBreakpoint = (ep.resource.ep.debug.EpLineBreakpoint) breakpoint;
					lineBreakpoint.install(this);
				}
			} catch (CoreException e) {
			}
		}
	}
	
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if ((breakpoint.isEnabled() && getBreakpointManager().isEnabled()) || !breakpoint.isRegistered()) {
					ep.resource.ep.debug.EpLineBreakpoint lineBreakpoint = (ep.resource.ep.debug.EpLineBreakpoint) breakpoint;
					lineBreakpoint.remove(this);
				}
			} catch (CoreException e) {
			}
		}
	}
	
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
	}
	
	public boolean canDisconnect() {
		// not supported
		return false;
	}
	
	public void disconnect() throws DebugException {
	}
	
	public boolean isDisconnected() {
		return false;
	}
	
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
		return null;
	}
	
	public boolean supportsStorageRetrieval() {
		return false;
	}
	
	/**
	 * Notification we have connected to the VM and it has started. Resume the VM.
	 */
	private void started() {
		fireCreationEvent();
		installDeferredBreakpoints();
		try {
			resume();
		} catch (DebugException e) {
		}
	}
	
	/**
	 * Install breakpoints that are already registered with the breakpoint manager.
	 */
	private void installDeferredBreakpoints() {
		IBreakpoint[] breakpoints = getBreakpointManager().getBreakpoints(getModelIdentifier());
		for (int i = 0; i < breakpoints.length; i++) {
			breakpointAdded(breakpoints[i]);
		}
	}
	
	public void handleMessage(ep.resource.ep.debug.EpDebugMessage message) {
		try {
			if (message.hasType(ep.resource.ep.debug.EEpDebugMessageTypes.STARTED)) {
				started();
			} else if (message.hasType(ep.resource.ep.debug.EEpDebugMessageTypes.SUSPENDED)) {
				suspend();
			} else if (message.hasType(ep.resource.ep.debug.EEpDebugMessageTypes.TERMINATED)) {
				terminated();
			} else if (message.hasType(ep.resource.ep.debug.EEpDebugMessageTypes.RESUMED)) {
				// ignore, this event is handled by the debug thread
			} else {
				System.out.println("ERROR in " + this.getClass().getName() + ".handleMessage(): unknown event " + message);
			}
		} catch (DebugException e) {
			e.printStackTrace();
		}
	}
	
	public ep.resource.ep.debug.EpDebugProxy getDebugProxy() {
		return this.debugProxy;
	}
	
}
