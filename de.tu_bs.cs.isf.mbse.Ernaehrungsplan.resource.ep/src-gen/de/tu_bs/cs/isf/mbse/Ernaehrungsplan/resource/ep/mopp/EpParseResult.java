/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class EpParseResult implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpParseResult {
	
	private EObject root;
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap locationMap;
	
	private Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>> commands = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>>();
	
	public EpParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
