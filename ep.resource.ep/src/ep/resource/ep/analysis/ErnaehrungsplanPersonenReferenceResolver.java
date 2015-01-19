/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.analysis;

public class ErnaehrungsplanPersonenReferenceResolver implements ep.resource.ep.IEpReferenceResolver<ep.Ernaehrungsplan, ep.Person> {
	
	private ep.resource.ep.analysis.EpDefaultResolverDelegate<ep.Ernaehrungsplan, ep.Person> delegate = new ep.resource.ep.analysis.EpDefaultResolverDelegate<ep.Ernaehrungsplan, ep.Person>();
	
	public void resolve(String identifier, ep.Ernaehrungsplan container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ep.resource.ep.IEpReferenceResolveResult<ep.Person> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ep.Person element, ep.Ernaehrungsplan container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
