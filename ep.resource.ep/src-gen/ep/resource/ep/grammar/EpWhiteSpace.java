/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

public class EpWhiteSpace extends ep.resource.ep.grammar.EpFormattingElement {
	
	private final int amount;
	
	public EpWhiteSpace(int amount, ep.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
