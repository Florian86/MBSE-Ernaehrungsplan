/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IEpElementMapping<ReferenceType> extends ep.resource.ep.IEpReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
