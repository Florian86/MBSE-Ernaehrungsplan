/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolveResult
 * interface that collects mappings in a list.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class EpReferenceResolveResult<ReferenceType> implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolveResult<ReferenceType> {
	
	private Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private Set<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> quickFixes;
	
	public EpReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix>();
		}
		return Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
