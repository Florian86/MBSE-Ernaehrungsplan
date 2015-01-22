/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class EpBracketInformationProvider {
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpBracketPair> getBracketPairs() {
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpBracketPair> result = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpBracketPair>();
		result.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpBracketPair("{", "}", true, true));
		result.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpBracketPair("(", ")", true, false));
		result.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpBracketPair("\"", "\"", false, false));
		return result;
	}
	
}
