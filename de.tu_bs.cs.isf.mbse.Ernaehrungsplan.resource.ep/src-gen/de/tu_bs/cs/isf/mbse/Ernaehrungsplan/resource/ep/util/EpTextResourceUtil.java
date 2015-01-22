/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class EpTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.
 */
public class EpTextResourceUtil {
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource getResource(IFile file) {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource getResource(File file, Map<?,?> options) {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource getResource(URI uri) {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource getResource(URI uri, Map<?,?> options) {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpResourceUtil.getResource(uri, options);
	}
	
}
