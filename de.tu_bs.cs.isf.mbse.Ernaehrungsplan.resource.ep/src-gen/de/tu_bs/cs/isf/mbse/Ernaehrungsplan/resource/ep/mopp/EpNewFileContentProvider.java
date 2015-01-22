/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class EpNewFileContentProvider {
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpMetaInformation getMetaInformation() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new EClass[] {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(EClass[] startClasses, EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(EClass eClass, EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		EObject root = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (IOException e) {
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpRuntimeUtil().logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextPrinter getPrinter(OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource());
	}
	
}
