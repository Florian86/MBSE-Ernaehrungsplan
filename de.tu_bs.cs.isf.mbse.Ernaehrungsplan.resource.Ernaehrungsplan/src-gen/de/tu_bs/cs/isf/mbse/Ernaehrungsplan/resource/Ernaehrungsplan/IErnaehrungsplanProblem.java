/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan;

import java.util.Collection;

public interface IErnaehrungsplanProblem {
	public String getMessage();
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemSeverity getSeverity();
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemType getType();
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanQuickFix> getQuickFixes();
}
