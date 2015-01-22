/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel;

public class EpAnnotationModel extends ResourceMarkerAnnotationModel {
	
	public EpAnnotationModel(IResource resource) {
		super(resource);
	}
	
	protected MarkerAnnotation createMarkerAnnotation(IMarker marker) {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpMarkerAnnotation(marker);
	}
	
}
