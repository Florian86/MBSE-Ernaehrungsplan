/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class EpMetaInformation implements ep.resource.ep.IEpMetaInformation {
	
	public String getSyntaxName() {
		return "ep";
	}
	
	public String getURI() {
		return "http://www.example.org/metamodel";
	}
	
	public ep.resource.ep.IEpTextScanner createLexer() {
		return new ep.resource.ep.mopp.EpAntlrScanner(new ep.resource.ep.mopp.EpLexer());
	}
	
	public ep.resource.ep.IEpTextParser createParser(InputStream inputStream, String encoding) {
		return new ep.resource.ep.mopp.EpParser().createInstance(inputStream, encoding);
	}
	
	public ep.resource.ep.IEpTextPrinter createPrinter(OutputStream outputStream, ep.resource.ep.IEpTextResource resource) {
		return new ep.resource.ep.mopp.EpPrinter2(outputStream, resource);
	}
	
	public EClass[] getClassesWithSyntax() {
		return new ep.resource.ep.mopp.EpSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public EClass[] getStartSymbols() {
		return new ep.resource.ep.mopp.EpSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public ep.resource.ep.IEpReferenceResolverSwitch getReferenceResolverSwitch() {
		return new ep.resource.ep.mopp.EpReferenceResolverSwitch();
	}
	
	public ep.resource.ep.IEpTokenResolverFactory getTokenResolverFactory() {
		return new ep.resource.ep.mopp.EpTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "de.tu_bs.cs.isf.mbse.ernaehrungsplan/src/metamodel/metamodel.cs";
	}
	
	public String[] getTokenNames() {
		return ep.resource.ep.mopp.EpParser.tokenNames;
	}
	
	public ep.resource.ep.IEpTokenStyle getDefaultTokenStyle(String tokenName) {
		return new ep.resource.ep.mopp.EpTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public Collection<ep.resource.ep.IEpBracketPair> getBracketPairs() {
		return new ep.resource.ep.mopp.EpBracketInformationProvider().getBracketPairs();
	}
	
	public EClass[] getFoldableClasses() {
		return new ep.resource.ep.mopp.EpFoldingInformationProvider().getFoldableClasses();
	}
	
	public Factory createResourceFactory() {
		return new ep.resource.ep.mopp.EpResourceFactory();
	}
	
	public ep.resource.ep.mopp.EpNewFileContentProvider getNewFileContentProvider() {
		return new ep.resource.ep.mopp.EpNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new ep.resource.ep.mopp.EpResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "ep.resource.ep.ui.launchConfigurationType";
	}
	
	public ep.resource.ep.IEpNameProvider createNameProvider() {
		return new ep.resource.ep.analysis.EpDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		ep.resource.ep.mopp.EpAntlrTokenHelper tokenHelper = new ep.resource.ep.mopp.EpAntlrTokenHelper();
		List<String> highlightableTokens = new ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(ep.resource.ep.mopp.EpTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
