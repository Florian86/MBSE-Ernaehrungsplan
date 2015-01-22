/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;

import java.util.Map;

/**
 * Implementors of this interface can be configured by a map of options (or
 * parameters).
 */
public interface IEpConfigurable {
	
	/**
	 * Passes the options given by the map to the configurable object.
	 */
	public void setOptions(Map<?,?> options);
}
