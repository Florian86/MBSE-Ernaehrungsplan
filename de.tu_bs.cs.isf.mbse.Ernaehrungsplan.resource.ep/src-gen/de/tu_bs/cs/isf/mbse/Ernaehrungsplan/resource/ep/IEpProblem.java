/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep;

import java.util.Collection;

public interface IEpProblem {
	public String getMessage();
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity getSeverity();
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType getType();
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> getQuickFixes();
}
