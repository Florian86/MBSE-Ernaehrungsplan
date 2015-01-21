/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class EpProposalPostProcessor {
	
	public List<ep.resource.ep.ui.EpCompletionProposal> process(List<ep.resource.ep.ui.EpCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
