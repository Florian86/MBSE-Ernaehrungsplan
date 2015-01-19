/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

public class EpBracketInformationProvider {
	
	public class BracketPair implements ep.resource.ep.IEpBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<ep.resource.ep.IEpBracketPair> getBracketPairs() {
		java.util.Collection<ep.resource.ep.IEpBracketPair> result = new java.util.ArrayList<ep.resource.ep.IEpBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
