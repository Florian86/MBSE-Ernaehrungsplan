/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class EpAbstractExpectedElement implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]>> followers = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]>>();
	
	public EpAbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement follower, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[] path) {
		followers.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]>(follower, path));
	}
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
