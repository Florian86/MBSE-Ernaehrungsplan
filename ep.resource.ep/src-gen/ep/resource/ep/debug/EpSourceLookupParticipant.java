/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;

public class EpSourceLookupParticipant extends AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof ep.resource.ep.debug.EpStackFrame) {
			ep.resource.ep.debug.EpStackFrame frame = (ep.resource.ep.debug.EpStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
