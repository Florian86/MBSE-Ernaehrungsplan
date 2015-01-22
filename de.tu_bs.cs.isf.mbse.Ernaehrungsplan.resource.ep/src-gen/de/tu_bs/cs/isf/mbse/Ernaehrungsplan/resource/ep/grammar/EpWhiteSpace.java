/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;


public class EpWhiteSpace extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpFormattingElement {
	
	private final int amount;
	
	public EpWhiteSpace(int amount, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality) {
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
