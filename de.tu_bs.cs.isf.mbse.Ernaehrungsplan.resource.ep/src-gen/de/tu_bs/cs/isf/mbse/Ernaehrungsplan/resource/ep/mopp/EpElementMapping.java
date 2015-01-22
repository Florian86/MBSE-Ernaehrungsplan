/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;


/**
 * <p>
 * A basic implementation of the
 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpElementMapping interface.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class EpElementMapping<ReferenceType> implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public EpElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
