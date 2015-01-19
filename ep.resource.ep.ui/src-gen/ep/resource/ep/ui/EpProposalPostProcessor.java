/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class EpProposalPostProcessor {
	
	public java.util.List<ep.resource.ep.ui.EpCompletionProposal> process(java.util.List<ep.resource.ep.ui.EpCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
