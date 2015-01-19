/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

public interface IEpProblem {
	public String getMessage();
	public ep.resource.ep.EpEProblemSeverity getSeverity();
	public ep.resource.ep.EpEProblemType getType();
	public java.util.Collection<ep.resource.ep.IEpQuickFix> getQuickFixes();
}
