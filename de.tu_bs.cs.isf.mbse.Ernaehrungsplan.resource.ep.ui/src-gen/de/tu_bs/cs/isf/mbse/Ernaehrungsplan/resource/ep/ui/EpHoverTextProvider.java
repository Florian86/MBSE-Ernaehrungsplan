/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.emf.ecore.EObject;

public class EpHoverTextProvider implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpHoverTextProvider {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpDefaultHoverTextProvider defaultProvider = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpDefaultHoverTextProvider();
	
	public String getHoverText(EObject container, EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
