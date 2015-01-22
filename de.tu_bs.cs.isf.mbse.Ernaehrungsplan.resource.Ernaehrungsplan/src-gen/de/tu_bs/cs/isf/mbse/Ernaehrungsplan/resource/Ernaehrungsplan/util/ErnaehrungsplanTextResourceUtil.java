/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class ErnaehrungsplanTextResourceUtil can be used to perform common tasks on
 * text resources, such as loading and saving resources, as well as, checking them
 * for errors. This class is deprecated and has been replaced by
 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.Ernaehrungspl
 * anResourceUtil.
 */
public class ErnaehrungsplanTextResourceUtil {
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.Ernaehrungspl
	 * anResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource getResource(IFile file) {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.Ernaehrungspl
	 * anResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource getResource(File file, Map<?,?> options) {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.Ernaehrungspl
	 * anResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource getResource(URI uri) {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.Ernaehrungspl
	 * anResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource getResource(URI uri, Map<?,?> options) {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanResourceUtil.getResource(uri, options);
	}
	
}
