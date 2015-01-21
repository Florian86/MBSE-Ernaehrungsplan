/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class EpTokenScanner implements ep.resource.ep.ui.IEpTokenScanner {
	
	private ep.resource.ep.IEpTextScanner lexer;
	private ep.resource.ep.IEpTextToken currentToken;
	private List<ep.resource.ep.IEpTextToken> nextTokens;
	private int offset;
	private String languageId;
	private IPreferenceStore store;
	private ep.resource.ep.ui.EpColorManager colorManager;
	private ep.resource.ep.IEpTextResource resource;
	
	/**
	 * <p>
	 * Creates a new EpTokenScanner.
	 * </p>
	 * 
	 * @param resource The resource to scan
	 * @param colorManager A manager to obtain color objects
	 */
	public EpTokenScanner(ep.resource.ep.IEpTextResource resource, ep.resource.ep.ui.EpColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new ep.resource.ep.mopp.EpMetaInformation().createLexer();
		this.languageId = new ep.resource.ep.mopp.EpMetaInformation().getSyntaxName();
		ep.resource.ep.ui.EpUIPlugin plugin = ep.resource.ep.ui.EpUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new ArrayList<ep.resource.ep.IEpTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			ep.resource.ep.IEpTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			ep.resource.ep.IEpTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new Token(textAttribute);
	}
	
	public void setRange(IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public ep.resource.ep.IEpTokenStyle getStaticTokenStyle() {
		String tokenName = currentToken.getName();
		String enableKey = ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.ENABLE);
		if (store == null) {
			return null;
		}
		
		boolean enabled = store.getBoolean(enableKey);
		if (!enabled) {
			return null;
		}
		
		String colorKey = ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.COLOR);
		RGB foregroundRGB = PreferenceConverter.getColor(store, colorKey);
		RGB backgroundRGB = null;
		boolean bold = store.getBoolean(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.BOLD));
		boolean italic = store.getBoolean(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.ITALIC));
		boolean strikethrough = store.getBoolean(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
		boolean underline = store.getBoolean(ep.resource.ep.ui.EpSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ep.resource.ep.ui.EpSyntaxColoringHelper.StyleProperty.UNDERLINE));
		return new ep.resource.ep.mopp.EpTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
	}
	
	public ep.resource.ep.IEpTokenStyle getDynamicTokenStyle(ep.resource.ep.IEpTokenStyle staticStyle) {
		ep.resource.ep.mopp.EpDynamicTokenStyler dynamicTokenStyler = new ep.resource.ep.mopp.EpDynamicTokenStyler();
		dynamicTokenStyler.setOffset(offset);
		ep.resource.ep.IEpTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public TextAttribute getTextAttribute(ep.resource.ep.IEpTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		Color backgroundColor = null;
		if (backgroundColorArray != null) {
			RGB backgroundRGB = new RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | TextAttribute.UNDERLINE;
		}
		return new TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		List<ep.resource.ep.mopp.EpTaskItem> taskItems = new ep.resource.ep.mopp.EpTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		List<ep.resource.ep.IEpTextToken> newItems = new ArrayList<ep.resource.ep.IEpTextToken>();
		for (ep.resource.ep.mopp.EpTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new ep.resource.ep.mopp.EpTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new ep.resource.ep.mopp.EpTextToken(ep.resource.ep.mopp.EpTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item
			String textAfter = text.substring(offset - charStart);
			newItems.add(new ep.resource.ep.mopp.EpTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
