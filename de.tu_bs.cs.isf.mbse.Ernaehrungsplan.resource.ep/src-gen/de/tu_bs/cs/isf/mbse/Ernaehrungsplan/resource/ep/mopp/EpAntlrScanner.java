/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.Token;

public class EpAntlrScanner implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextScanner {
	
	private Lexer antlrLexer;
	
	public EpAntlrScanner(Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextToken result = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new ANTLRStringStream(text));
	}
	
}
