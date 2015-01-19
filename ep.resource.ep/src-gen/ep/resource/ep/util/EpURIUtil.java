/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.util;

public class EpURIUtil {
	
	public boolean isInBinFolder(org.eclipse.emf.common.util.URI uri) {
		String[] segments = uri.segments();
		for (String segment : segments) {
			if ("bin".equals(segment)) {
				return true;
			}
		}
		return false;
	}
	
}
