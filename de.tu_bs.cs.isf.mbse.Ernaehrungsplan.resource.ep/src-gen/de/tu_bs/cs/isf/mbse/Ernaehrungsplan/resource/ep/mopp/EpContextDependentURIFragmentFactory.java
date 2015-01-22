/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <p>
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * </p>
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class EpContextDependentURIFragmentFactory<ContainerType extends EObject, ReferenceType extends EObject>  implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public EpContextDependentURIFragmentFactory(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpContextDependentURIFragment<?> create(String identifier, ContainerType container, EReference reference, int positionInReference, EObject proxy) {
		
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
