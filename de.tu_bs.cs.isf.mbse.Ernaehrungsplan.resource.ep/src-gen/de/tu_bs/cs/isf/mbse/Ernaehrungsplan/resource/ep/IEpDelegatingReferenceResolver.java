/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * </p>
 * 
 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions
 */
public interface IEpDelegatingReferenceResolver<ContainerType extends EObject, ReferenceType extends EObject> extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
