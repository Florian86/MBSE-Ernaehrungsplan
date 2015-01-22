/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan;


/**
 * <p>
 * A mapping from an identifier to an EObject.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IErnaehrungsplanElementMapping<ReferenceType> extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
