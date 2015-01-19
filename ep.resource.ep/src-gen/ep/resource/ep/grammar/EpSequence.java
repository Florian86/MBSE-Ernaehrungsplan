/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

public class EpSequence extends ep.resource.ep.grammar.EpSyntaxElement {
	
	public EpSequence(ep.resource.ep.grammar.EpCardinality cardinality, ep.resource.ep.grammar.EpSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return ep.resource.ep.util.EpStringUtil.explode(getChildren(), " ");
	}
	
}
