/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;

/**
 * Converts a tree of <code>EObject</code>s into a plain text.
 */
public interface IErnaehrungsplanTextPrinter extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanConfigurable {
	
	/**
	 * <p>
	 * Prints the given <code>EObject</code> and its content to the underlying output
	 * stream that was passed to this printer upon creation.
	 * </p>
	 * 
	 * @param element The element to print.
	 * 
	 * @throws IOException if printing to the underlying stream or device fails.
	 */
	public void print(EObject element) throws IOException;
	
	/**
	 * Sets the encoding used for printing.
	 */
	public void setEncoding(String encoding);
	
}