/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;

import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.Token;

public class ErnaehrungsplanANTLRTextToken extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTextToken {
	
	private final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanMetaInformation metaInformation = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanMetaInformation();
	
	public ErnaehrungsplanANTLRTextToken(Token antlrToken) {
		super(getTokenName(metaInformation.getTokenNames(), antlrToken.getType()), antlrToken.getText(), ((CommonToken) antlrToken).getStartIndex(), ((CommonToken) antlrToken).getStopIndex() - ((CommonToken) antlrToken).getStartIndex() + 1, antlrToken.getLine(), antlrToken.getCharPositionInLine(), canBeUsedForSyntaxHighlighting(antlrToken.getType()));
	}
	
	public static String getTokenName(String[] tokenNames, int index) {
		if (tokenNames == null) {
			return null;
		}
		String tokenName = tokenNames[index];
		if (tokenName != null && tokenName.startsWith("'")) {
			tokenName = tokenName.substring(1, tokenName.length() - 1).trim();
		}
		return tokenName;
	}
	
	public static boolean canBeUsedForSyntaxHighlighting(int tokenType) {
		if (tokenType < 0) {
			return false;
		}
		if (tokenType == Token.UP) {
			return false;
		}
		if (tokenType == Token.DOWN) {
			return false;
		}
		if (tokenType == Token.EOR_TOKEN_TYPE) {
			return false;
		}
		if (tokenType == Token.INVALID_TOKEN_TYPE) {
			return false;
		}
		return true;
	}
	
}
