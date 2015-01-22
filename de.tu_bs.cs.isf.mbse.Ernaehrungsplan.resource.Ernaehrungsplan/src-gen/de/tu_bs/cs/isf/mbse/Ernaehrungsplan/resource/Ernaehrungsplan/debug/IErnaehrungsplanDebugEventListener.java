/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug;


public interface IErnaehrungsplanDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage message);
}
