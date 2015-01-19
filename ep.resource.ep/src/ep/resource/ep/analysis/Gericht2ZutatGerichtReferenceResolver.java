/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.analysis;

public class Gericht2ZutatGerichtReferenceResolver implements ep.resource.ep.IEpReferenceResolver<ep.Gericht2Zutat, ep.Gericht> {
	
	private ep.resource.ep.analysis.EpDefaultResolverDelegate<ep.Gericht2Zutat, ep.Gericht> delegate = new ep.resource.ep.analysis.EpDefaultResolverDelegate<ep.Gericht2Zutat, ep.Gericht>();
	
	public void resolve(String identifier, ep.Gericht2Zutat container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ep.resource.ep.IEpReferenceResolveResult<ep.Gericht> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ep.Gericht element, ep.Gericht2Zutat container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
