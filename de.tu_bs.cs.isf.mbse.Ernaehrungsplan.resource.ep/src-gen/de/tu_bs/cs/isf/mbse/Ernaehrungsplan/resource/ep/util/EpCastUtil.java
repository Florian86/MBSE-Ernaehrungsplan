/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util;


/**
 * Utility class that provides a method to cast objects to type parameterized
 * classes without a warning.
 */
public class EpCastUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T cast(Object temp) {
		return (T) temp;
	}
}
