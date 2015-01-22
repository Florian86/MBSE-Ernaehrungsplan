/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

public abstract class ErnaehrungsplanDebugElement extends DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public ErnaehrungsplanDebugElement(IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanPlugin.DEBUG_MODEL_ID;
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
