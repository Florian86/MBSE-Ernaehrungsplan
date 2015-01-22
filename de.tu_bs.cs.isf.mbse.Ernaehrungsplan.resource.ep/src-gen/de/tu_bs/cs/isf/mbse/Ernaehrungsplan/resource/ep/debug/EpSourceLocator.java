/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;

public class EpSourceLocator extends AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new ISourceLookupParticipant[]{new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpSourceLookupParticipant()});
	}
	
}
