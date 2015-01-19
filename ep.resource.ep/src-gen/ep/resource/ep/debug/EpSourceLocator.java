/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

public class EpSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new ep.resource.ep.debug.EpSourceLookupParticipant()});
	}
	
}
