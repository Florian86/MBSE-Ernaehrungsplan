/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the ep.resource.ep.IEpURIMapping interface that can
 * map identifiers to URIs.
 * </p>
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * ep.resource.ep.IEpURIMapping.
 */
public class EpURIMapping<ReferenceType> implements ep.resource.ep.IEpURIMapping<ReferenceType> {
	
	private URI uri;
	private String identifier;
	private String warning;
	
	public EpURIMapping(String identifier, URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
