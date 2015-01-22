/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import org.eclipse.emf.ecore.EClass;

public class EpSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getPerson(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getHauptbestandteil(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getBeilage(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getSauce(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan(),
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(),
		};
	}
	
}
