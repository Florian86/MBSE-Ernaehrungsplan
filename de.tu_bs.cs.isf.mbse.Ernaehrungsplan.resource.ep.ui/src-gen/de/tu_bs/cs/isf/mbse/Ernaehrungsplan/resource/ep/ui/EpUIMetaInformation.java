/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.core.resources.IResource;

public class EpUIMetaInformation extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMetaInformation {
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpHoverTextProvider getHoverTextProvider() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpHoverTextProvider();
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpImageProvider getImageProvider() {
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpImageProvider.INSTANCE;
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpColorManager createColorManager() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResou
	 * rce, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpColorManager)
	 * instead.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpTokenScanner createTokenScanner(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpColorManager colorManager) {
		return (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.IEpTokenScanner createTokenScanner(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpColorManager colorManager) {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpTokenScanner(resource, colorManager);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCodeCompletionHelper createCodeCompletionHelper() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.debug.EpLineBreakpointAdapter();
	}
	
}
