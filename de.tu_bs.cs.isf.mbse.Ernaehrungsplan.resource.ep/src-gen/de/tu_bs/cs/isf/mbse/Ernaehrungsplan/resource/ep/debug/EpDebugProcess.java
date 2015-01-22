/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;

public class EpDebugProcess extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugElement implements IProcess, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.IEpDebugEventListener {
	
	private ILaunch launch;
	
	private boolean terminated = false;
	
	public EpDebugProcess(ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public ILaunch getLaunch() {
		return launch;
	}
	
	public IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws DebugException {
		return 0;
	}
	
	public void handleMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage message) {
		if (message.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
