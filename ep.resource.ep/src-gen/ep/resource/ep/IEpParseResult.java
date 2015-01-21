/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IEpParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> getPostParseCommands();
	
	/**
	 * Returns a map that can be used to retrieve the position of objects in the
	 * parsed text.
	 */
	public ep.resource.ep.IEpLocationMap getLocationMap();
	
}
