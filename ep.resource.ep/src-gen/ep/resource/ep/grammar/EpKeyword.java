/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class EpKeyword extends ep.resource.ep.grammar.EpSyntaxElement {
	
	private final String value;
	
	public EpKeyword(String value, ep.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
