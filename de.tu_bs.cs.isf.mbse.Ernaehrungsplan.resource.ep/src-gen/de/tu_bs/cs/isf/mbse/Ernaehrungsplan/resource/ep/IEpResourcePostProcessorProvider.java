/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;


/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IEpResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpResourcePostProcessor getResourcePostProcessor();
	
}
