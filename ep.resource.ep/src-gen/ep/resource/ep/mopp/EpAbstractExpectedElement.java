/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class EpAbstractExpectedElement implements ep.resource.ep.IEpExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]>> followers = new LinkedHashSet<ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]>>();
	
	public EpAbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(ep.resource.ep.IEpExpectedElement follower, ep.resource.ep.mopp.EpContainedFeature[] path) {
		followers.add(new ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]>(follower, path));
	}
	
	public Collection<ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
