/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;

public class ErnaehrungsplanPersonenReferenceResolver implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person> {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.EpDefaultResolverDelegate<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person> delegate = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.EpDefaultResolverDelegate<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person>();
	
	public void resolve(String identifier, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan container, EReference reference, int position, boolean resolveFuzzy, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan container, EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}