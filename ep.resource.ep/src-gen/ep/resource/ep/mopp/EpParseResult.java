/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class EpParseResult implements ep.resource.ep.IEpParseResult {
	
	private EObject root;
	
	private ep.resource.ep.IEpLocationMap locationMap;
	
	private Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> commands = new ArrayList<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>>();
	
	public EpParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public ep.resource.ep.IEpLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(ep.resource.ep.IEpLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
