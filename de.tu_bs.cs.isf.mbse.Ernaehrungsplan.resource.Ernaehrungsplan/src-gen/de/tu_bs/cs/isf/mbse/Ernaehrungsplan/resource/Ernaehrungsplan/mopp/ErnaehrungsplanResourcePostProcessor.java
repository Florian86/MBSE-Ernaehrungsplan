/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;


public class ErnaehrungsplanResourcePostProcessor implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanResourcePostProcessor {
	
	public void process(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
