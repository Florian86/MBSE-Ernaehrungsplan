/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * A listener interface for classes that need notification when a background
 * parsing pass has completed.
 */
public interface IEpBackgroundParsingListener {
	
	/**
	 * <p>
	 * Signals that the given resource has been changed and the background parsing is
	 * completed.
	 * </p>
	 * 
	 * @param resource the resource that has changed
	 */
	public void parsingCompleted(Resource resource);
}
