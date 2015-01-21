/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;

import java.util.Collection;

public interface IEpProblem {
	public String getMessage();
	public ep.resource.ep.EpEProblemSeverity getSeverity();
	public ep.resource.ep.EpEProblemType getType();
	public Collection<ep.resource.ep.IEpQuickFix> getQuickFixes();
}
