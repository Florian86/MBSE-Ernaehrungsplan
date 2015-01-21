/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

import java.util.List;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

public class EpStackFrame extends ep.resource.ep.debug.EpDebugElement implements IStackFrame {
	
	private ep.resource.ep.debug.EpDebugTarget target;
	private String name;
	private int id;
	private String resourceURI;
	private int line;
	private int charStart;
	private int charEnd;
	
	public EpStackFrame(ep.resource.ep.debug.EpDebugTarget target, String data) {
		super(target);
		this.target = target;
		
		List<String> dataParts = ep.resource.ep.util.EpStringUtil.decode(data, ',');
		this.name = dataParts.get(0);
		this.id = Integer.parseInt(dataParts.get(1));
		this.resourceURI = dataParts.get(2);
		this.line = Integer.parseInt(dataParts.get(3));
		this.charStart = Integer.parseInt(dataParts.get(4));
		this.charEnd = Integer.parseInt(dataParts.get(5));
	}
	
	private ep.resource.ep.debug.EpDebugTarget getTarget() {
		return target;
	}
	
	public int getLineNumber() throws DebugException {
		return this.line;
	}
	
	public int getCharStart() throws DebugException {
		return charStart;
	}
	
	public int getCharEnd() throws DebugException {
		return charEnd;
	}
	
	public String getName() throws DebugException {
		return this.name;
	}
	
	public IRegisterGroup[] getRegisterGroups() throws DebugException {
		return new IRegisterGroup[0];
	}
	
	public IThread getThread() {
		return target.getThread();
	}
	
	public IVariable[] getVariables() throws DebugException {
		// get root (top level) variables
		IVariable[] variables = getTarget().getDebugProxy().getStackVariables(Integer.toString(id));
		return variables;
	}
	
	public boolean hasRegisterGroups() throws DebugException {
		return false;
	}
	
	public boolean hasVariables() throws DebugException {
		return false;
	}
	
	public boolean canStepInto() {
		return getThread().canStepInto();
	}
	
	public boolean canStepOver() {
		return getThread().canStepOver();
	}
	
	public boolean canStepReturn() {
		return getThread().canStepReturn();
	}
	
	public boolean isStepping() {
		return getThread().isStepping();
	}
	
	public void stepInto() throws DebugException {
		getThread().stepInto();
	}
	
	public void stepOver() throws DebugException {
		getThread().stepOver();
	}
	
	public void stepReturn() throws DebugException {
		getThread().stepReturn();
	}
	
	public boolean canResume() {
		return getThread().canResume();
	}
	
	public boolean canSuspend() {
		return getThread().canSuspend();
	}
	
	public boolean isSuspended() {
		return getThread().isSuspended();
	}
	
	public void resume() throws DebugException {
		getThread().resume();
	}
	
	public void suspend() throws DebugException {
		getThread().suspend();
	}
	
	public boolean canTerminate() {
		return getThread().canTerminate();
	}
	
	public boolean isTerminated() {
		return getThread().isTerminated();
	}
	
	public void terminate() throws DebugException {
		getThread().terminate();
	}
	
	public String getResourceURI() {
		return this.resourceURI;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result		+ ((resourceURI == null) ? 0 : resourceURI.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)		return true;
		if (obj == null)		return false;
		if (getClass() != obj.getClass())		return false;
		ep.resource.ep.debug.EpStackFrame other = (ep.resource.ep.debug.EpStackFrame) obj;
		if (name == null) {
			if (other.name != null)			return false;
		} else if (!name.equals(other.name))		return false;
		if (resourceURI == null) {
			if (other.resourceURI != null)			return false;
		} else if (!resourceURI.equals(other.resourceURI))		return false;
		return true;
	}
	
}
