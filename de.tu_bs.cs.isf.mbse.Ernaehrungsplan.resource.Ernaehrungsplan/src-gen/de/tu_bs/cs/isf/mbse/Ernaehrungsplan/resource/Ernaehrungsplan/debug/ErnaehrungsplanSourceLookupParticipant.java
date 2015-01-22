/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;

public class ErnaehrungsplanSourceLookupParticipant extends AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanStackFrame) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanStackFrame frame = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
