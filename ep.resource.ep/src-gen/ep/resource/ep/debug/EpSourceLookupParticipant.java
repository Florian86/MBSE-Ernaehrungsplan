/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

public class EpSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof ep.resource.ep.debug.EpStackFrame) {
			ep.resource.ep.debug.EpStackFrame frame = (ep.resource.ep.debug.EpStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
