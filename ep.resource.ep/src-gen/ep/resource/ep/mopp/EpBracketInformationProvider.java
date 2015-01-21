/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class EpBracketInformationProvider {
	
	public Collection<ep.resource.ep.IEpBracketPair> getBracketPairs() {
		Collection<ep.resource.ep.IEpBracketPair> result = new ArrayList<ep.resource.ep.IEpBracketPair>();
		result.add(new ep.resource.ep.mopp.EpBracketPair("{", "}", true, true));
		result.add(new ep.resource.ep.mopp.EpBracketPair("(", ")", true, false));
		result.add(new ep.resource.ep.mopp.EpBracketPair("\"", "\"", false, false));
		return result;
	}
	
}
