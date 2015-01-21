/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class EpProblem implements ep.resource.ep.IEpProblem {
	
	private String message;
	private ep.resource.ep.EpEProblemType type;
	private ep.resource.ep.EpEProblemSeverity severity;
	private Collection<ep.resource.ep.IEpQuickFix> quickFixes;
	
	public EpProblem(String message, ep.resource.ep.EpEProblemType type, ep.resource.ep.EpEProblemSeverity severity) {
		this(message, type, severity, Collections.<ep.resource.ep.IEpQuickFix>emptySet());
	}
	
	public EpProblem(String message, ep.resource.ep.EpEProblemType type, ep.resource.ep.EpEProblemSeverity severity, ep.resource.ep.IEpQuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public EpProblem(String message, ep.resource.ep.EpEProblemType type, ep.resource.ep.EpEProblemSeverity severity, Collection<ep.resource.ep.IEpQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<ep.resource.ep.IEpQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public ep.resource.ep.EpEProblemType getType() {
		return type;
	}
	
	public ep.resource.ep.EpEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<ep.resource.ep.IEpQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
