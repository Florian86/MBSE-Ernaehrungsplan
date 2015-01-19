/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

public class EpResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public EpResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new ep.resource.ep.mopp.EpResource(uri);
	}
	
}
