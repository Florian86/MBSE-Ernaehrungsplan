/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ErnaehrungsplanResourceFactory implements Resource.Factory {
	
	public ErnaehrungsplanResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource(uri);
	}
	
}
