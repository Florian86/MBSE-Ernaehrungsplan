/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

public class EpCompound extends ep.resource.ep.grammar.EpSyntaxElement {
	
	public EpCompound(ep.resource.ep.grammar.EpChoice choice, ep.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality, new ep.resource.ep.grammar.EpSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
