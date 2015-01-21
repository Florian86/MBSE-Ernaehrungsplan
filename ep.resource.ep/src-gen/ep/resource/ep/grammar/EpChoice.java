/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;


public class EpChoice extends ep.resource.ep.grammar.EpSyntaxElement {
	
	public EpChoice(ep.resource.ep.grammar.EpCardinality cardinality, ep.resource.ep.grammar.EpSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return ep.resource.ep.util.EpStringUtil.explode(getChildren(), "|");
	}
	
}
