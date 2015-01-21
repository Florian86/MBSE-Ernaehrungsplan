/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

public interface IEpNameProvider {
	
	/**
	 * Returns a list of potential identifiers that may be used to reference the given
	 * element. This method can be used to customize the identification of elements.
	 */
	public List<String> getNames(EObject element);
	
}
