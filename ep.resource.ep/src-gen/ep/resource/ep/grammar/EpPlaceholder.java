/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class EpPlaceholder extends ep.resource.ep.grammar.EpTerminal {
	
	private final String tokenName;
	
	public EpPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, ep.resource.ep.grammar.EpCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
