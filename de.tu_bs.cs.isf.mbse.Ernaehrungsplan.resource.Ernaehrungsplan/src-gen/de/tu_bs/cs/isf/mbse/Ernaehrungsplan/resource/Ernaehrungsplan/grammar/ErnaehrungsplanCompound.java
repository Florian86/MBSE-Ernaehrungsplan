/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar;


public class ErnaehrungsplanCompound extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanSyntaxElement {
	
	public ErnaehrungsplanCompound(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanChoice choice, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanCardinality cardinality) {
		super(cardinality, new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
