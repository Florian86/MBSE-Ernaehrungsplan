/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

public interface IEpDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(ep.resource.ep.debug.EpDebugMessage message);
}
