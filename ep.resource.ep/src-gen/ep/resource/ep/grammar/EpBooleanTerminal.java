/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class EpBooleanTerminal extends ep.resource.ep.grammar.EpTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public EpBooleanTerminal(EStructuralFeature attribute, String trueLiteral, String falseLiteral, ep.resource.ep.grammar.EpCardinality cardinality, int mandatoryOccurrencesAfter) {
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
