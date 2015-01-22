/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IErnaehrungsplanCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
