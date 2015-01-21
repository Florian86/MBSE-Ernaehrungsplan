/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class EpRule extends ep.resource.ep.grammar.EpSyntaxElement {
	
	private final EClass metaclass;
	
	public EpRule(EClass metaclass, ep.resource.ep.grammar.EpChoice choice, ep.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality, new ep.resource.ep.grammar.EpSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public ep.resource.ep.grammar.EpChoice getDefinition() {
		return (ep.resource.ep.grammar.EpChoice) getChildren()[0];
	}
	
}

