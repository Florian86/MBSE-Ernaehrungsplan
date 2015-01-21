/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

public abstract class EpDebugElement extends DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public EpDebugElement(IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return ep.resource.ep.mopp.EpPlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * <p>
	 * Returns the breakpoint manager.
	 * </p>
	 * 
	 * @return the breakpoint manager
	 */
	protected IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}
	
}
