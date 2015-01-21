/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;


public class EpLineBreak extends ep.resource.ep.grammar.EpFormattingElement {
	
	private final int tabs;
	
	public EpLineBreak(ep.resource.ep.grammar.EpCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
