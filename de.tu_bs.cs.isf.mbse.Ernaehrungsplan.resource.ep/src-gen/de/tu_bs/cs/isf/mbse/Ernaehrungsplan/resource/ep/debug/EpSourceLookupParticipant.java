/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;

public class EpSourceLookupParticipant extends AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpStackFrame) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpStackFrame frame = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
