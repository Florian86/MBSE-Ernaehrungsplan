/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar;


public class ErnaehrungsplanLineBreak extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanFormattingElement {
	
	private final int tabs;
	
	public ErnaehrungsplanLineBreak(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanCardinality cardinality, int tabs) {
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
