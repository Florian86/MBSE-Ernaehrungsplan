/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import org.eclipse.emf.ecore.EClass;

public class EpSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			ep.MetamodelPackage.eINSTANCE.getEpElement(),
			ep.MetamodelPackage.eINSTANCE.getPerson(),
			ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(),
			ep.MetamodelPackage.eINSTANCE.getBeilage(),
			ep.MetamodelPackage.eINSTANCE.getSauce(),
			ep.MetamodelPackage.eINSTANCE.getGericht(),
			ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(),
			ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			ep.MetamodelPackage.eINSTANCE.getEpElement(),
		};
	}
	
}
