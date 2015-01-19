/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IEpResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public ep.resource.ep.IEpTextResource getResource();
	
}
