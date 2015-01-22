/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EpReferenceResolverSwitch implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.ErnaehrungsplanPersonenReferenceResolver ernaehrungsplanPersonenReferenceResolver = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.ErnaehrungsplanPersonenReferenceResolver();
	protected de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.ErnaehrungsplanGerichteReferenceResolver ernaehrungsplanGerichteReferenceResolver = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.ErnaehrungsplanGerichteReferenceResolver();
	protected de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.Gericht2ZutatZutatReferenceResolver gericht2ZutatZutatReferenceResolver = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.Gericht2ZutatZutatReferenceResolver();
	protected de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.Gericht2ZutatGerichtReferenceResolver gericht2ZutatGerichtReferenceResolver = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.analysis.Gericht2ZutatGerichtReferenceResolver();
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person> getErnaehrungsplanPersonenReferenceResolver() {
		return getResolverChain(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan_Personen(), ernaehrungsplanPersonenReferenceResolver);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht> getErnaehrungsplanGerichteReferenceResolver() {
		return getResolverChain(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan_Gerichte(), ernaehrungsplanGerichteReferenceResolver);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat> getGericht2ZutatZutatReferenceResolver() {
		return getResolverChain(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat_Zutat(), gericht2ZutatZutatReferenceResolver);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht> getGericht2ZutatGerichtReferenceResolver() {
		return getResolverChain(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat_Gericht(), gericht2ZutatGerichtReferenceResolver);
	}
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		ernaehrungsplanPersonenReferenceResolver.setOptions(options);
		ernaehrungsplanGerichteReferenceResolver.setOptions(options);
		gericht2ZutatZutatReferenceResolver.setOptions(options);
		gericht2ZutatGerichtReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan().isInstance(container)) {
			EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person> frr = new EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("personen")) {
				ernaehrungsplanPersonenReferenceResolver.resolve(identifier, (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan) container, (EReference) feature, position, true, frr);
			}
		}
		if (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan().isInstance(container)) {
			EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht> frr = new EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("gerichte")) {
				ernaehrungsplanGerichteReferenceResolver.resolve(identifier, (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan) container, (EReference) feature, position, true, frr);
			}
		}
		if (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat().isInstance(container)) {
			EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat> frr = new EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("zutat")) {
				gericht2ZutatZutatReferenceResolver.resolve(identifier, (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat) container, (EReference) feature, position, true, frr);
			}
		}
		if (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat().isInstance(container)) {
			EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht> frr = new EpFuzzyResolveResult<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("gericht")) {
				gericht2ZutatGerichtReferenceResolver.resolve(identifier, (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan_Personen()) {
			return getResolverChain(reference, ernaehrungsplanPersonenReferenceResolver);
		}
		if (reference == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan_Gerichte()) {
			return getResolverChain(reference, ernaehrungsplanGerichteReferenceResolver);
		}
		if (reference == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat_Zutat()) {
			return getResolverChain(reference, gericht2ZutatZutatReferenceResolver);
		}
		if (reference == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat_Gericht()) {
			return getResolverChain(reference, gericht2ZutatGerichtReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpRuntimeUtil().logWarning("Found value with invalid type for option " + de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver replacingResolver = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver) resolverValue;
			if (replacingResolver instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceCache) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver nextResolver = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver) next;
					if (nextResolver instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpRuntimeUtil().logWarning("Found value with invalid type in value map for option " + de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpRuntimeUtil().logWarning("Found value with invalid type in value map for option " + de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
