/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;

import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ErnaehrungsplanBuilderAdapter extends IncrementalProjectBuilder {
	
	private static class ResourceCollector implements IResourceDeltaVisitor, IResourceVisitor {
		
		private Map<IResource, Boolean> resourceMap = new LinkedHashMap<IResource, Boolean>();
		
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			return doVisit(resource, delta.getKind() == IResourceDelta.REMOVED);
		}
		
		public boolean visit(IResource resource) throws CoreException {
			return doVisit(resource, false);
		}
		
		private boolean doVisit(IResource resource, boolean removed) throws CoreException {
			resourceMap.put(resource, removed);
			return true;
		}
		
		private Map<IResource, Boolean> getResourceMap() {
			return resourceMap;
		}
		
	}
	
	/**
	 * The ID of the default, generated builder.
	 */
	public final static String BUILDER_ID = "de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.builder";
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanBuilder defaultBuilder = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanBuilder();
	
	public IProject[] build(int kind, Map<String, String> args, final IProgressMonitor monitor) throws CoreException {
		// Collect resources that must be built
		ResourceCollector resourceCollector = new ResourceCollector();
		IResourceDelta delta = getDelta(getProject());
		if (delta != null) {
			// This is an incremental build
			delta.accept(resourceCollector);
		} else {
			// This is a full build
			getProject().accept(resourceCollector);
		}
		
		// This resource set is used during the whole build.
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<IResource, Boolean> resourceMap = resourceCollector.getResourceMap();
		monitor.beginTask(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanResourceBundle.BUILDER_ADAPTER_TASK_NAME, resourceMap.size() * 2);
		for (IResource resource : resourceMap.keySet()) {
			doVisit(resource, resourceMap.get(resource), monitor, resourceSet);
		}
		monitor.done();
		return null;
	}
	
	public void build(IFile resource, ResourceSet resourceSet, IProgressMonitor monitor) {
		URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanBuilder builder = getBuilder();
		if (builder.isBuildingNeeded(uri)) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource customResource = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanResource) resourceSet.getResource(uri, true);
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanMarkerHelper().removeAllMarkers(resource, getBuilderMarkerId());
			builder.build(customResource, monitor);
		}
	}
	
	/**
	 * Returns the builder that shall be used by this adapter. This allows subclasses
	 * to perform builds with different builders.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanBuilder getBuilder() {
		return defaultBuilder;
	}
	
	/**
	 * Returns the id for the markers that are created by this builder. This allows
	 * subclasses to produce different kinds of markers.
	 */
	public String getBuilderMarkerId() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanMarkerHelper().getMarkerID(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemType.BUILDER_ERROR);
	}
	
	/**
	 * Runs the task item builder to search for new task items in changed resources.
	 */
	public void runTaskItemBuilder(IFile resource, ResourceSet resourceSet, IProgressMonitor monitor) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTaskItemBuilder taskItemBuilder = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTaskItemBuilder();
		taskItemBuilder.build(resource, resourceSet, monitor);
	}
	
	protected boolean doVisit(IResource resource, boolean removed, IProgressMonitor monitor, ResourceSet resourceSet) throws CoreException {
		if (removed) {
			URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanBuilder builder = getBuilder();
			if (builder.isBuildingNeeded(uri)) {
				builder.handleDeletion(uri, monitor);
			}
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanMarkerHelper().removeAllMarkers(resource, getBuilderMarkerId());
			return false;
		}
		
		if (resource instanceof IFile && resource.getName().endsWith("." + new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanMetaInformation().getSyntaxName())) {
			// First, call the default generated builder that is usually customized to add
			// compilation-like behavior. The Builder may consume one tick from the progress
			// monitor.
			build((IFile) resource, resourceSet, monitor);
			// Second, call the task item builder that searches for task items in DSL
			// documents and creates task markers. The TaskItemBuilder may consume one tick
			// from the progress monitor.
			runTaskItemBuilder((IFile) resource, resourceSet, monitor);
			return false;
		}
		
		return true;
	}
	
}
