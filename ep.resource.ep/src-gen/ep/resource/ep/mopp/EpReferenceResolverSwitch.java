/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EpReferenceResolverSwitch implements ep.resource.ep.IEpReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected ep.resource.ep.analysis.ErnaehrungsplanPersonenReferenceResolver ernaehrungsplanPersonenReferenceResolver = new ep.resource.ep.analysis.ErnaehrungsplanPersonenReferenceResolver();
	protected ep.resource.ep.analysis.ErnaehrungsplanGerichteReferenceResolver ernaehrungsplanGerichteReferenceResolver = new ep.resource.ep.analysis.ErnaehrungsplanGerichteReferenceResolver();
	protected ep.resource.ep.analysis.Gericht2ZutatZutatReferenceResolver gericht2ZutatZutatReferenceResolver = new ep.resource.ep.analysis.Gericht2ZutatZutatReferenceResolver();
	protected ep.resource.ep.analysis.Gericht2ZutatGerichtReferenceResolver gericht2ZutatGerichtReferenceResolver = new ep.resource.ep.analysis.Gericht2ZutatGerichtReferenceResolver();
	
	public ep.resource.ep.IEpReferenceResolver<ep.Ernaehrungsplan, ep.Person> getErnaehrungsplanPersonenReferenceResolver() {
		return getResolverChain(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan_Personen(), ernaehrungsplanPersonenReferenceResolver);
	}
	
	public ep.resource.ep.IEpReferenceResolver<ep.Ernaehrungsplan, ep.Gericht> getErnaehrungsplanGerichteReferenceResolver() {
		return getResolverChain(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan_Gerichte(), ernaehrungsplanGerichteReferenceResolver);
	}
	
	public ep.resource.ep.IEpReferenceResolver<ep.Gericht2Zutat, ep.Zutat> getGericht2ZutatZutatReferenceResolver() {
		return getResolverChain(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat_Zutat(), gericht2ZutatZutatReferenceResolver);
	}
	
	public ep.resource.ep.IEpReferenceResolver<ep.Gericht2Zutat, ep.Gericht> getGericht2ZutatGerichtReferenceResolver() {
		return getResolverChain(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat_Gericht(), gericht2ZutatGerichtReferenceResolver);
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
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, ep.resource.ep.IEpReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().isInstance(container)) {
			EpFuzzyResolveResult<ep.Person> frr = new EpFuzzyResolveResult<ep.Person>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("personen")) {
				ernaehrungsplanPersonenReferenceResolver.resolve(identifier, (ep.Ernaehrungsplan) container, (EReference) feature, position, true, frr);
			}
		}
		if (ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().isInstance(container)) {
			EpFuzzyResolveResult<ep.Gericht> frr = new EpFuzzyResolveResult<ep.Gericht>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("gerichte")) {
				ernaehrungsplanGerichteReferenceResolver.resolve(identifier, (ep.Ernaehrungsplan) container, (EReference) feature, position, true, frr);
			}
		}
		if (ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().isInstance(container)) {
			EpFuzzyResolveResult<ep.Zutat> frr = new EpFuzzyResolveResult<ep.Zutat>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("zutat")) {
				gericht2ZutatZutatReferenceResolver.resolve(identifier, (ep.Gericht2Zutat) container, (EReference) feature, position, true, frr);
			}
		}
		if (ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().isInstance(container)) {
			EpFuzzyResolveResult<ep.Gericht> frr = new EpFuzzyResolveResult<ep.Gericht>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("gericht")) {
				gericht2ZutatGerichtReferenceResolver.resolve(identifier, (ep.Gericht2Zutat) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public ep.resource.ep.IEpReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan_Personen()) {
			return getResolverChain(reference, ernaehrungsplanPersonenReferenceResolver);
		}
		if (reference == ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan_Gerichte()) {
			return getResolverChain(reference, ernaehrungsplanGerichteReferenceResolver);
		}
		if (reference == ep.MetamodelPackage.eINSTANCE.getGericht2Zutat_Zutat()) {
			return getResolverChain(reference, gericht2ZutatZutatReferenceResolver);
		}
		if (reference == ep.MetamodelPackage.eINSTANCE.getGericht2Zutat_Gericht()) {
			return getResolverChain(reference, gericht2ZutatGerichtReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> ep.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, ep.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(ep.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new ep.resource.ep.util.EpRuntimeUtil().logWarning("Found value with invalid type for option " + ep.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof ep.resource.ep.IEpReferenceResolver) {
			ep.resource.ep.IEpReferenceResolver replacingResolver = (ep.resource.ep.IEpReferenceResolver) resolverValue;
			if (replacingResolver instanceof ep.resource.ep.IEpDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((ep.resource.ep.IEpDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			ep.resource.ep.IEpReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof ep.resource.ep.IEpReferenceCache) {
					ep.resource.ep.IEpReferenceResolver nextResolver = (ep.resource.ep.IEpReferenceResolver) next;
					if (nextResolver instanceof ep.resource.ep.IEpDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((ep.resource.ep.IEpDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new ep.resource.ep.util.EpRuntimeUtil().logWarning("Found value with invalid type in value map for option " + ep.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + ep.resource.ep.IEpDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new ep.resource.ep.util.EpRuntimeUtil().logWarning("Found value with invalid type in value map for option " + ep.resource.ep.IEpOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + ep.resource.ep.IEpDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
