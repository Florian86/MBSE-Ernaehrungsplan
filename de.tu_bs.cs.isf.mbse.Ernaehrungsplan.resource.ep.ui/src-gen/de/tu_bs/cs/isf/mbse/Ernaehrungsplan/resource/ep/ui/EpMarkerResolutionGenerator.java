/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolution2;
import org.eclipse.ui.IMarkerResolutionGenerator;

public class EpMarkerResolutionGenerator implements IMarkerResolutionGenerator {
	
	public IMarkerResolution[] getResolutions(IMarker marker) {
		try {
			if (!hasQuickFixes(marker)) {
				return new IMarkerResolution[] {};
			}
			IResource resource = marker.getResource();
			if (resource instanceof IFile) {
				// load model
				final IFile file = (IFile) resource;
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				ResourceSet rs = new ResourceSetImpl();
				rs.getLoadOptions().put(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS, "true");
				Resource emfResource = rs.getResource(uri, true);
				if (emfResource instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource customResource = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource) emfResource;
					EcoreUtil.resolveAll(customResource);
					Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> quickFixes = getQuickFixes(customResource, marker);
					List<IMarkerResolution2> resolutions = new ArrayList<IMarkerResolution2>();
					for (final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix quickFix : quickFixes) {
						resolutions.add(new IMarkerResolution2() {
							
							public void run(IMarker marker) {
								String newText = quickFix.apply(null);
								// set new text as content for resource
								try {
									file.setContents(new ByteArrayInputStream(newText.getBytes()), true, true, null);
								} catch (CoreException e) {
									de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpUIPlugin.logError("Exception while applying quick fix", e);
								}
							}
							
							public String getLabel() {
								return quickFix.getDisplayString();
							}
							
							public Image getImage() {
								return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpUIMetaInformation().getImageProvider().getImage(quickFix.getImageKey());
							}
							
							public String getDescription() {
								return null;
							}
							
						});
					}
					return resolutions.toArray(new IMarkerResolution[resolutions.size()]);
				}
			}
		} catch (Exception e) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpUIPlugin.logError("Exception while computing quick fix resolutions", e);
		}
		return new IMarkerResolution[] {};
	}
	
	public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> getQuickFixes(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, IMarker marker) {
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> foundQuickFixes = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix>();
		try {
			String quickFixContexts = getQuickFixContextString(marker);
			if (quickFixContexts != null) {
				String[] quickFixContextParts = quickFixContexts.split("\\|");
				for (String quickFixContext : quickFixContextParts) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix quickFix = resource.getQuickFix(quickFixContext);
					if (quickFix != null) {
						foundQuickFixes.add(quickFix);
					}
				}
			}
		} catch (CoreException ce) {
			if (ce.getMessage().matches("Marker.*not found.")) {
				// ignore
				System.out.println("getQuickFixes() marker not found: " + ce.getMessage());
			} else {
				ce.printStackTrace();
			}
		}
		return foundQuickFixes;
	}
	
	private String getQuickFixContextString(IMarker marker) throws CoreException {
		Object quickFixValue = marker.getAttribute(IMarker.SOURCE_ID);
		if (quickFixValue != null && quickFixValue instanceof String) {
			return (String) quickFixValue;
		}
		return null;
	}
	private boolean hasQuickFixes(IMarker marker) throws CoreException {
		return getQuickFixContextString(marker) != null;
	}
}
