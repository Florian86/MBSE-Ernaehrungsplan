/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class EpRule extends ep.resource.ep.grammar.EpSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public EpRule(org.eclipse.emf.ecore.EClass metaclass, ep.resource.ep.grammar.EpChoice choice, ep.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality, new ep.resource.ep.grammar.EpSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public ep.resource.ep.grammar.EpChoice getDefinition() {
		return (ep.resource.ep.grammar.EpChoice) getChildren()[0];
	}
	
}

