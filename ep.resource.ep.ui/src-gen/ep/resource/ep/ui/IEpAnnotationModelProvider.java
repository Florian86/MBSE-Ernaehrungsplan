/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

/**
 * A provider for annotation models.
 */
public interface IEpAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel();
	
}
