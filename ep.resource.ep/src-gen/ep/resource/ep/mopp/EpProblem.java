/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

public class EpProblem implements ep.resource.ep.IEpProblem {
	
	private String message;
	private ep.resource.ep.EpEProblemType type;
	private ep.resource.ep.EpEProblemSeverity severity;
	private java.util.Collection<ep.resource.ep.IEpQuickFix> quickFixes;
	
	public EpProblem(String message, ep.resource.ep.EpEProblemType type, ep.resource.ep.EpEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<ep.resource.ep.IEpQuickFix>emptySet());
	}
	
	public EpProblem(String message, ep.resource.ep.EpEProblemType type, ep.resource.ep.EpEProblemSeverity severity, ep.resource.ep.IEpQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public EpProblem(String message, ep.resource.ep.EpEProblemType type, ep.resource.ep.EpEProblemSeverity severity, java.util.Collection<ep.resource.ep.IEpQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<ep.resource.ep.IEpQuickFix>();
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
	
	public java.util.Collection<ep.resource.ep.IEpQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
