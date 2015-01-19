/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

public class EpAntlrScanner implements ep.resource.ep.IEpTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public EpAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public ep.resource.ep.IEpTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		ep.resource.ep.IEpTextToken result = new ep.resource.ep.mopp.EpANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
