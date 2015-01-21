/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class EpTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * ep.resource.ep.util.EpResourceUtil.
 */
public class EpTextResourceUtil {
	
	/**
	 * Use ep.resource.ep.util.EpResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static ep.resource.ep.mopp.EpResource getResource(IFile file) {
		return new ep.resource.ep.util.EpEclipseProxy().getResource(file);
	}
	
	/**
	 * Use ep.resource.ep.util.EpResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static ep.resource.ep.mopp.EpResource getResource(File file, Map<?,?> options) {
		return ep.resource.ep.util.EpResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use ep.resource.ep.util.EpResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static ep.resource.ep.mopp.EpResource getResource(URI uri) {
		return ep.resource.ep.util.EpResourceUtil.getResource(uri);
	}
	
	/**
	 * Use ep.resource.ep.util.EpResourceUtil.getResource() instead.
	 */
	@Deprecated
	public static ep.resource.ep.mopp.EpResource getResource(URI uri, Map<?,?> options) {
		return ep.resource.ep.util.EpResourceUtil.getResource(uri, options);
	}
	
}
