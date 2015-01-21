/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class EpResourceFactory implements Resource.Factory {
	
	public EpResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new ep.resource.ep.mopp.EpResource(uri);
	}
	
}
