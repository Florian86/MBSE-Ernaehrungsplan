/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;

public class FeatureTypeReferenceResolver implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanReferenceResolver<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type> {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.analysis.ErnaehrungsplanDefaultResolverDelegate<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type> delegate = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.analysis.ErnaehrungsplanDefaultResolverDelegate<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type>();
	
	public void resolve(String identifier, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature container, EReference reference, int position, boolean resolveFuzzy, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanReferenceResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature container, EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
