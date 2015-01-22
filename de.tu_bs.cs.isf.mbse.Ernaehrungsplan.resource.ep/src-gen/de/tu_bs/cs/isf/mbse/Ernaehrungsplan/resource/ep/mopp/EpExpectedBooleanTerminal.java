/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class EpExpectedBooleanTerminal extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpAbstractExpectedElement {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal booleanTerminal;
	
	public EpExpectedBooleanTerminal(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof EpExpectedBooleanTerminal) {
			return getFeature().equals(((EpExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		Set<String> tokenNames = new LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
