/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

/**
 * A class used to initialize default preference values.
 */
public class EpPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = ep.resource.ep.ui.EpUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(ep.resource.ep.ui.EpPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(ep.resource.ep.ui.EpPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = ep.resource.ep.ui.EpUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new ep.resource.ep.mopp.EpMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = ep.resource.ep.ui.EpUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new ep.resource.ep.mopp.EpMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, ep.resource.ep.IEpMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		ep.resource.ep.ui.EpBracketSet bracketSet = new ep.resource.ep.ui.EpBracketSet(null, null);
		final java.util.Collection<ep.resource.ep.IEpBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (ep.resource.ep.IEpBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + ep.resource.ep.ui.EpPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, ep.resource.ep.mopp.EpMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			ep.resource.ep.IEpTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
