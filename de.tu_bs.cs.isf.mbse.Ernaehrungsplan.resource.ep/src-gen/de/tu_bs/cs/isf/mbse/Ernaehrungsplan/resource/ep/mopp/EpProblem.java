/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class EpProblem implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpProblem {
	
	private String message;
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType type;
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity severity;
	private Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> quickFixes;
	
	public EpProblem(String message, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType type, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity severity) {
		this(message, type, severity, Collections.<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix>emptySet());
	}
	
	public EpProblem(String message, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType type, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity severity, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public EpProblem(String message, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType type, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity severity, Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType getType() {
		return type;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
