/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;


/**
 * <p>
 * A mapping from an identifier to an EObject.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IEpElementMapping<ReferenceType> extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
