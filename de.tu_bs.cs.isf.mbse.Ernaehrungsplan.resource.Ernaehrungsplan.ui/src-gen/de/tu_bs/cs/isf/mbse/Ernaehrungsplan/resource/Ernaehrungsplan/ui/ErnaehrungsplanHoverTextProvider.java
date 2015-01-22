/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui;

import org.eclipse.emf.ecore.EObject;

public class ErnaehrungsplanHoverTextProvider implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanHoverTextProvider {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanDefaultHoverTextProvider defaultProvider = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanDefaultHoverTextProvider();
	
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
