/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.analysis;

public class ErnaehrungsplanGerichteReferenceResolver implements ep.resource.ep.IEpReferenceResolver<ep.Ernaehrungsplan, ep.Gericht> {
	
	private ep.resource.ep.analysis.EpDefaultResolverDelegate<ep.Ernaehrungsplan, ep.Gericht> delegate = new ep.resource.ep.analysis.EpDefaultResolverDelegate<ep.Ernaehrungsplan, ep.Gericht>();
	
	public void resolve(String identifier, ep.Ernaehrungsplan container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ep.resource.ep.IEpReferenceResolveResult<ep.Gericht> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ep.Gericht element, ep.Ernaehrungsplan container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
