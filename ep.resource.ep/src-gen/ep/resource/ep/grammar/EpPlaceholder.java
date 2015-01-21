/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent placeholders in a grammar.
 */
public class EpPlaceholder extends ep.resource.ep.grammar.EpTerminal {
	
	private final String tokenName;
	
	public EpPlaceholder(EStructuralFeature feature, String tokenName, ep.resource.ep.grammar.EpCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
