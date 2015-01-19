/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IEpResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public ep.resource.ep.IEpResourcePostProcessor getResourcePostProcessor();
	
}
