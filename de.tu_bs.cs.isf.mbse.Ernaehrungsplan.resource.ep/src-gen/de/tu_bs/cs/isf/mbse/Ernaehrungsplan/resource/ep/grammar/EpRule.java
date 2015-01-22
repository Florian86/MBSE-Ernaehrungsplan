/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class EpRule extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement {
	
	private final EClass metaclass;
	
	public EpRule(EClass metaclass, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice choice, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality) {
		super(cardinality, new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getDefinition() {
		return (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice) getChildren()[0];
	}
	
}

