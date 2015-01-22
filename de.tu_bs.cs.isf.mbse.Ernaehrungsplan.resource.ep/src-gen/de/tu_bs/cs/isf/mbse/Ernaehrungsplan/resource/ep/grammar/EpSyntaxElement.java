/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class EpSyntaxElement {
	
	private EpSyntaxElement[] children;
	private EpSyntaxElement parent;
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality;
	
	public EpSyntaxElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality, EpSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (EpSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(EpSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public EpSyntaxElement getParent() {
		return parent;
	}
	
	public EpSyntaxElement[] getChildren() {
		if (children == null) {
			return new EpSyntaxElement[0];
		}
		return children;
	}
	
	public EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality getCardinality() {
		return cardinality;
	}
	
}
