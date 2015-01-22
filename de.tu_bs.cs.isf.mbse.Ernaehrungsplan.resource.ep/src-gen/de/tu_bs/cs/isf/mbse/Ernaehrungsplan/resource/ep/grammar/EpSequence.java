/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;


public class EpSequence extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement {
	
	public EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.explode(getChildren(), " ");
	}
	
}
