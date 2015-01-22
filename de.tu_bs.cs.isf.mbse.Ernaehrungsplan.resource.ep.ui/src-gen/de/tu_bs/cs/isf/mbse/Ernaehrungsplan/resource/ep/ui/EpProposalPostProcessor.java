/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class EpProposalPostProcessor {
	
	public List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> process(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
