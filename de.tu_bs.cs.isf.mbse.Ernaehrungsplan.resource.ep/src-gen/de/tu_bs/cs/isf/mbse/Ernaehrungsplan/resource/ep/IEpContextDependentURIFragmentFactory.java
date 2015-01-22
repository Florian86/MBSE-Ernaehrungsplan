/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <p>
 * An interface for factories to create instances of
 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpContextDependentURIFragment.
 * </p>
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public interface IEpContextDependentURIFragmentFactory<ContainerType extends EObject, ReferenceType extends EObject> {
	
	/**
	 * <p>
	 * Create a new instance of the
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpContextDependentURIFragment
	 * interface.
	 * </p>
	 * 
	 * @param identifier the identifier that references an Object
	 * @param container the object that contains the reference
	 * @param reference the reference itself
	 * @param positionInReference the position of the identifier (if the reference is
	 * multiple)
	 * @param proxy the proxy that will be resolved later to the actual EObject
	 * 
	 * @return the new instance of
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpContextDependentURIFragment
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpContextDependentURIFragment<?> create(String identifier, ContainerType container, EReference reference, int positionInReference, EObject proxy);
}
