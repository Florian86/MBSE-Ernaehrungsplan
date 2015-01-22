/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class EpExpectedEnumerationTerminal extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpAbstractExpectedElement {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal enumerationTerminal;
	
	public EpExpectedEnumerationTerminal(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		Set<String> tokenNames = new LinkedHashSet<String>();
		Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
	
	/**
	 * Returns the expected enumeration terminal.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement getSymtaxElement() {
		return enumerationTerminal;
	}
	
	public String toString() {
		return "EnumTerminal \"" + getEnumerationTerminal() + "\"";
	}
	
}
