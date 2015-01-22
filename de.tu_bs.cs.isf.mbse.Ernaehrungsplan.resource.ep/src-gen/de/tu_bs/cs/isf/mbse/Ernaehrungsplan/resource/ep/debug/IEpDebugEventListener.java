/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug;


public interface IEpDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage message);
}
