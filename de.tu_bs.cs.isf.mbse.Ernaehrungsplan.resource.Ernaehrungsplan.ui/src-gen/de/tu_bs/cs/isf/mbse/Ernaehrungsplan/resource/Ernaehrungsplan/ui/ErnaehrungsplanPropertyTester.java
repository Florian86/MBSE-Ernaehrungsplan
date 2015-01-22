/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.part.FileEditorInput;

public class ErnaehrungsplanPropertyTester extends PropertyTester {
	
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof IResource) {
			IResource resource = (IResource) receiver;
			return hasMatchingURI(resource);
		} else if (receiver instanceof FileEditorInput) {
			FileEditorInput editorInput = (FileEditorInput) receiver;
			IFile file = editorInput.getFile();
			return hasMatchingURI(file);
		}
		return false;
	}
	
	private boolean hasMatchingURI(IResource resource) {
		String path = resource.getLocationURI().getPath();
		return path.endsWith("." + new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanMetaInformation().getSyntaxName());
	}
	
}
