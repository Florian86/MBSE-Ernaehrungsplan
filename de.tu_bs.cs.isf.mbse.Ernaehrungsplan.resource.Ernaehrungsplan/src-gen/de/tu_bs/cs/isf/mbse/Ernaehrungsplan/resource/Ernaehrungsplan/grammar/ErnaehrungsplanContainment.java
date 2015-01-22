/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ErnaehrungsplanContainment extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanTerminal {
	
	private final EClass[] allowedTypes;
	
	public ErnaehrungsplanContainment(EStructuralFeature feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanCardinality cardinality, EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanStringUtil.explode(allowedTypes, ", ", new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanFunction1<String, EClass>() {
				public String execute(EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
