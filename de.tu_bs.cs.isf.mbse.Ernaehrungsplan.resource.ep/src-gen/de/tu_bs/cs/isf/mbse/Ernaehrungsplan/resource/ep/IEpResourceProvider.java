/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;


/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IEpResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource getResource();
	
}
