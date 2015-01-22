/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EpContainment extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpTerminal {
	
	private final EClass[] allowedTypes;
	
	public EpContainment(EStructuralFeature feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality cardinality, EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.explode(allowedTypes, ", ", new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpFunction1<String, EClass>() {
				public String execute(EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
