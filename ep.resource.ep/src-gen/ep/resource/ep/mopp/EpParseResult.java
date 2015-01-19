/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

public class EpParseResult implements ep.resource.ep.IEpParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> commands = new java.util.ArrayList<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>>();
	
	public EpParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
