/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;

import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IEpExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement follower, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]>> getFollowers();
	
}
