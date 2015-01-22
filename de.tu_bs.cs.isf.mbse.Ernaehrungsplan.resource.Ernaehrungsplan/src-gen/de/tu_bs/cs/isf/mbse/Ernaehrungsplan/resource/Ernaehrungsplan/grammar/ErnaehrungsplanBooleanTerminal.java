/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class ErnaehrungsplanBooleanTerminal extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public ErnaehrungsplanBooleanTerminal(EStructuralFeature attribute, String trueLiteral, String falseLiteral, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public EAttribute getAttribute() {
		return (EAttribute) getFeature();
	}
	
}
