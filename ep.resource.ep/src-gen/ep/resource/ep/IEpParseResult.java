/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IEpParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> getPostParseCommands();
	
}
