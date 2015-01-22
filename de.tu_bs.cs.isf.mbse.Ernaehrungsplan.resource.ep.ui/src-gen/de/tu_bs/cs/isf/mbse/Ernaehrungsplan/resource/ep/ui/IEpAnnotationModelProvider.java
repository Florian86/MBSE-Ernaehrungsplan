/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.text.source.IAnnotationModel;

/**
 * A provider for annotation models.
 */
public interface IEpAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public IAnnotationModel getAnnotationModel();
	
}
