/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;


public class EpCompound extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement {
	
	public EpCompound(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice choice, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality, new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
