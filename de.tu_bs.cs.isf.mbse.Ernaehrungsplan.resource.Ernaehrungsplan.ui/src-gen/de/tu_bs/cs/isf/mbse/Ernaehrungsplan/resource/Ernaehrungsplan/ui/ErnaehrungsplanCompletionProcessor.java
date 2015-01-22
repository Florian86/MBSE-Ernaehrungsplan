/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class ErnaehrungsplanCompletionProcessor implements IContentAssistProcessor {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanResourceProvider resourceProvider;
	
	public ErnaehrungsplanCompletionProcessor(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		return computeCompletionProposals(textResource, content, offset);
	}
	
	public ICompletionProposal[] computeCompletionProposals(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource textResource, String text, int offset) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCodeCompletionHelper helper = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCodeCompletionHelper();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, text, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanProposalPostProcessor proposalPostProcessor = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanProposalPostProcessor();
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal> computedProposalList = Arrays.asList(computedProposals);
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = Collections.emptyList();
		}
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal> finalProposalList = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal>();
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal proposal : extendedProposalList) {
			if (proposal.isMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		ICompletionProposal[] result = new ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = (proposal.getDisplayString()==null)?proposalString:proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			Image image = proposal.getImage();
			IContextInformation info;
			info = new ContextInformation(image, displayString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			result[i++] = new CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		IPreferenceStore preferenceStore = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanUIPlugin.getDefault().getPreferenceStore();
		boolean enabled = preferenceStore.getBoolean(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED);
		String triggerString = preferenceStore.getString(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS);
		if(enabled && triggerString != null && triggerString.length() > 0){
			char[] triggers = new char[triggerString.length()];
			for (int i = 0; i < triggerString.length(); i++) {
				triggers[i] = triggerString.charAt(i);
			}
			return triggers;
		}
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
