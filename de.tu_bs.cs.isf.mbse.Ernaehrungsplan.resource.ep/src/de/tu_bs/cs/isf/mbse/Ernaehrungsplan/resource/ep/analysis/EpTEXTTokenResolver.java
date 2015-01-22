/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EpTEXTTokenResolver implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.EpDefaultTokenResolver defaultTokenResolver = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.EpDefaultTokenResolver(true);
	
	public String deResolve(Object value, EStructuralFeature feature, EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, EStructuralFeature feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
