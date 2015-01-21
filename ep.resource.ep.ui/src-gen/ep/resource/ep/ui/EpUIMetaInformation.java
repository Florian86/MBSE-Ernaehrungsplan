/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

import org.eclipse.core.resources.IResource;

public class EpUIMetaInformation extends ep.resource.ep.mopp.EpMetaInformation {
	
	public ep.resource.ep.IEpHoverTextProvider getHoverTextProvider() {
		return new ep.resource.ep.ui.EpHoverTextProvider();
	}
	
	public ep.resource.ep.ui.EpImageProvider getImageProvider() {
		return ep.resource.ep.ui.EpImageProvider.INSTANCE;
	}
	
	public ep.resource.ep.ui.EpColorManager createColorManager() {
		return new ep.resource.ep.ui.EpColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(ep.resource.ep.IEpTextResource,
	 * ep.resource.ep.ui.EpColorManager) instead.
	 */
	public ep.resource.ep.ui.EpTokenScanner createTokenScanner(ep.resource.ep.ui.EpColorManager colorManager) {
		return (ep.resource.ep.ui.EpTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public ep.resource.ep.ui.IEpTokenScanner createTokenScanner(ep.resource.ep.IEpTextResource resource, ep.resource.ep.ui.EpColorManager colorManager) {
		return new ep.resource.ep.ui.EpTokenScanner(resource, colorManager);
	}
	
	public ep.resource.ep.ui.EpCodeCompletionHelper createCodeCompletionHelper() {
		return new ep.resource.ep.ui.EpCodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new ep.resource.ep.ui.debug.EpLineBreakpointAdapter();
	}
	
}
