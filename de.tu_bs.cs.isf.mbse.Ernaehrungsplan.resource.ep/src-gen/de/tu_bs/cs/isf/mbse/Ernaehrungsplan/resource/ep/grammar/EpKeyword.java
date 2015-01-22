/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;


/**
 * A class to represent a keyword in the grammar.
 */
public class EpKeyword extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement {
	
	private final String value;
	
	public EpKeyword(String value, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality) {
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
