/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

/**
 * A class to display the information of an element. Most of the code is taken
 * from <code>org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover</code>.
 */
public class EpTextHover implements org.eclipse.jface.text.ITextHover, org.eclipse.jface.text.ITextHoverExtension, org.eclipse.jface.text.ITextHoverExtension2 {
	
	private static final String FONT = org.eclipse.jface.resource.JFaceResources.DIALOG_FONT;
	
	private ep.resource.ep.IEpResourceProvider resourceProvider;
	private ep.resource.ep.IEpHoverTextProvider hoverTextProvider;
	/**
	 * The style sheet (css).
	 */
	private static String styleSheet;
	
	/**
	 * The hover control creator.
	 */
	private org.eclipse.jface.text.IInformationControlCreator hoverControlCreator;
	
	/**
	 * The presentation control creator.
	 */
	private org.eclipse.jface.text.IInformationControlCreator presenterControlCreator;
	
	/**
	 * A simple default implementation of a {@link
	 * org.eclipse.jface.viewers.ISelectionProvider}. It stores the selection and
	 * notifies all selection change listeners when the selection is set.
	 */
	public static class SimpleSelectionProvider implements org.eclipse.jface.viewers.ISelectionProvider {
		
		private final org.eclipse.core.runtime.ListenerList selectionChangedListeners;
		private org.eclipse.jface.viewers.ISelection selection;
		
		public SimpleSelectionProvider() {
			selectionChangedListeners = new org.eclipse.core.runtime.ListenerList();
		}
		
		public org.eclipse.jface.viewers.ISelection getSelection() {
			return selection;
		}
		
		public void setSelection(org.eclipse.jface.viewers.ISelection selection) {
			this.selection = selection;
			
			Object[] listeners = selectionChangedListeners.getListeners();
			for (int i = 0; i < listeners.length; i++) {
				((org.eclipse.jface.viewers.ISelectionChangedListener) listeners[i]).selectionChanged(new org.eclipse.jface.viewers.SelectionChangedEvent(this, selection));
			}
		}
		
		public void removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener listener) {
			selectionChangedListeners.remove(listener);
		}
		
		public void addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener listener) {
			selectionChangedListeners.add(listener);
		}
		
	}
	
	/**
	 * This action will be activated if the button in the hover window is pushed to
	 * jump to the declaration.
	 */
	public static class OpenDeclarationAction extends org.eclipse.jface.action.Action {
		
		private final ep.resource.ep.ui.EpBrowserInformationControl infoControl;
		
		/**
		 * Creates the action to jump to the declaration.
		 * 
		 * @param infoControl the info control holds the hover information and the target
		 * element
		 */
		public OpenDeclarationAction(ep.resource.ep.ui.EpBrowserInformationControl infoControl) {
			this.infoControl = infoControl;
			setText("Open Declaration");
			org.eclipse.ui.ISharedImages images = org.eclipse.ui.PlatformUI.getWorkbench().getSharedImages();
			setImageDescriptor(images.getImageDescriptor(org.eclipse.ui.ISharedImages.IMG_ETOOL_HOME_NAV));
		}
		
		/**
		 * Creates, sets, activates a hyperlink.
		 */
		public void run() {
			ep.resource.ep.ui.EpDocBrowserInformationControlInput infoInput = (ep.resource.ep.ui.EpDocBrowserInformationControlInput) infoControl.getInput();
			infoControl.notifyDelayedInputChange(null);
			infoControl.dispose();
			if (infoInput.getInputElement() instanceof org.eclipse.emf.ecore.EObject) {
				org.eclipse.emf.ecore.EObject decEO = (org.eclipse.emf.ecore.EObject) infoInput.getInputElement();
				if (decEO != null && decEO.eResource() != null) {
					ep.resource.ep.ui.EpHyperlink hyperlink = new ep.resource.ep.ui.EpHyperlink(null, decEO, infoInput.getTokenText());
					hyperlink.open();
				}
			}
		}
	}
	
	/**
	 * Presenter control creator. Creates a hover control after focus.
	 */
	public static final class PresenterControlCreator extends org.eclipse.jface.text.AbstractReusableInformationControlCreator {
		
		public org.eclipse.jface.text.IInformationControl doCreateInformationControl(org.eclipse.swt.widgets.Shell parent) {
			if (ep.resource.ep.ui.EpBrowserInformationControl.isAvailable(parent)) {
				org.eclipse.jface.action.ToolBarManager tbm = new org.eclipse.jface.action.ToolBarManager(org.eclipse.swt.SWT.FLAT);
				ep.resource.ep.ui.EpBrowserInformationControl iControl = new ep.resource.ep.ui.EpBrowserInformationControl(parent, FONT, tbm);
				final OpenDeclarationAction openDeclarationAction = new OpenDeclarationAction(iControl);
				tbm.add(openDeclarationAction);
				final SimpleSelectionProvider selectionProvider = new SimpleSelectionProvider();
				
				org.eclipse.jface.text.IInputChangedListener inputChangeListener = new org.eclipse.jface.text.IInputChangedListener() {
					public void inputChanged(Object newInput) {
						if (newInput == null) {
							selectionProvider.setSelection(new org.eclipse.jface.viewers.StructuredSelection());
						} else if (newInput instanceof ep.resource.ep.ui.EpDocBrowserInformationControlInput) {
							ep.resource.ep.ui.EpDocBrowserInformationControlInput input = (ep.resource.ep.ui.EpDocBrowserInformationControlInput) newInput;
							Object inputElement = input.getInputElement();
							selectionProvider.setSelection(new org.eclipse.jface.viewers.StructuredSelection(inputElement));
							// If there is an element of type EObject in the input element, the button to open
							// the declaration will be set enable
							boolean isEObjectInput = inputElement instanceof org.eclipse.emf.ecore.EObject;
							openDeclarationAction.setEnabled(isEObjectInput);
							if (isEObjectInput) {
								String simpleName = inputElement.getClass().getSimpleName();
								simpleName = simpleName.substring(0, simpleName.length() - 4);
								openDeclarationAction.setText("Open " + simpleName);
							} else							openDeclarationAction.setText("Open Declaration");
						}
					}
				};
				iControl.addInputChangeListener(inputChangeListener);
				
				tbm.update(true);
				return iControl;
			} else {
				return new org.eclipse.jface.text.DefaultInformationControl(parent, true);
			}
		}
	}
	
	/**
	 * Hover control creator. Creates a hover control before focus.
	 */
	public static final class HoverControlCreator extends org.eclipse.jface.text.AbstractReusableInformationControlCreator {
		
		/**
		 * The information presenter control creator.
		 */
		private final org.eclipse.jface.text.IInformationControlCreator fInformationPresenterControlCreator;
		
		/**
		 * 
		 * @param informationPresenterControlCreator control creator for enriched hover
		 */
		public HoverControlCreator(org.eclipse.jface.text.IInformationControlCreator informationPresenterControlCreator) {
			fInformationPresenterControlCreator = informationPresenterControlCreator;
		}
		
		public org.eclipse.jface.text.IInformationControl doCreateInformationControl(org.eclipse.swt.widgets.Shell parent) {
			String tooltipAffordanceString = org.eclipse.ui.editors.text.EditorsUI.getTooltipAffordanceString();
			if (ep.resource.ep.ui.EpBrowserInformationControl.isAvailable(parent)) {
				ep.resource.ep.ui.EpBrowserInformationControl iControl = new ep.resource.ep.ui.EpBrowserInformationControl(parent, FONT, tooltipAffordanceString) {
					public org.eclipse.jface.text.IInformationControlCreator getInformationPresenterControlCreator() {
						return fInformationPresenterControlCreator;
					}
				};
				return iControl;
			} else {
				return new org.eclipse.jface.text.DefaultInformationControl(parent, tooltipAffordanceString);
			}
		}
		
		public boolean canReuse(org.eclipse.jface.text.IInformationControl control) {
			if (!super.canReuse(control)) {
				return false;
			}
			
			if (control instanceof org.eclipse.jface.text.IInformationControlExtension4) {
				String tooltipAffordanceString = org.eclipse.ui.editors.text.EditorsUI.getTooltipAffordanceString();
				((org.eclipse.jface.text.IInformationControlExtension4) control).setStatusText(tooltipAffordanceString);
			}
			
			return true;
		}
	}
	
	/**
	 * Creates a new TextHover to collect the information about the hovered element.
	 */
	public EpTextHover(ep.resource.ep.IEpResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
		this.hoverTextProvider = new ep.resource.ep.ui.EpUIMetaInformation().getHoverTextProvider();
	}
	
	// The warning about overriding or implementing a deprecated API cannot be avoided
	// because the SourceViewerConfiguration class depends on ITextHover.
	public String getHoverInfo(org.eclipse.jface.text.ITextViewer textViewer, org.eclipse.jface.text.IRegion hoverRegion) {
		Object hoverInfo = getHoverInfo2(textViewer, hoverRegion);
		if (hoverInfo == null) {
			return null;
		}
		return ((ep.resource.ep.ui.EpDocBrowserInformationControlInput) hoverInfo).getHtml();
	}
	
	public org.eclipse.jface.text.IRegion getHoverRegion(org.eclipse.jface.text.ITextViewer textViewer, int offset) {
		org.eclipse.swt.graphics.Point selection = textViewer.getSelectedRange();
		if (selection.x <= offset && offset < selection.x + selection.y) {
			return new org.eclipse.jface.text.Region(selection.x, selection.y);
		}
		return new org.eclipse.jface.text.Region(offset, 0);
	}
	
	public org.eclipse.jface.text.IInformationControlCreator getHoverControlCreator() {
		if (hoverControlCreator == null) {
			hoverControlCreator = new HoverControlCreator(getInformationPresenterControlCreator());
		}
		return hoverControlCreator;
	}
	
	public org.eclipse.jface.text.IInformationControlCreator getInformationPresenterControlCreator() {
		if (presenterControlCreator == null) {
			presenterControlCreator = new PresenterControlCreator();
		}
		return presenterControlCreator;
	}
	
	public Object getHoverInfo2(org.eclipse.jface.text.ITextViewer textViewer, org.eclipse.jface.text.IRegion hoverRegion) {
		return hoverTextProvider == null ? null : internalGetHoverInfo(textViewer, hoverRegion);
	}
	
	private ep.resource.ep.ui.EpDocBrowserInformationControlInput internalGetHoverInfo(org.eclipse.jface.text.ITextViewer textViewer, org.eclipse.jface.text.IRegion hoverRegion) {
		ep.resource.ep.IEpTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return null;
		}
		ep.resource.ep.IEpLocationMap locationMap = textResource.getLocationMap();
		java.util.List<org.eclipse.emf.ecore.EObject> elementsAtOffset = locationMap.getElementsAt(hoverRegion.getOffset());
		if (elementsAtOffset == null || elementsAtOffset.size() == 0) {
			return null;
		}
		return getHoverInfo(elementsAtOffset, textViewer, null);
	}
	
	/**
	 * Computes the hover info.
	 * 
	 * @param elements the resolved elements
	 * @param constantValue a constant value iff result contains exactly 1 constant
	 * field, or <code>null</code>
	 * @param previousInput the previous input, or <code>null</code>
	 * 
	 * @return the HTML hover info for the given element(s) or <code>null</code> if no
	 * information is available
	 */
	private ep.resource.ep.ui.EpDocBrowserInformationControlInput getHoverInfo(java.util.List<org.eclipse.emf.ecore.EObject> elements, org.eclipse.jface.text.ITextViewer textViewer, ep.resource.ep.ui.EpDocBrowserInformationControlInput previousInput) {
		StringBuffer buffer = new StringBuffer();
		org.eclipse.emf.ecore.EObject proxyObject = getFirstProxy(elements);
		org.eclipse.emf.ecore.EObject containerObject = getFirstNonProxy(elements);
		org.eclipse.emf.ecore.EObject declarationObject = null;
		// get the token text, which is hovered. It is needed to jump to the declaration.
		String tokenText = "";
		if (proxyObject != null) {
			ep.resource.ep.IEpTextResource textResource = resourceProvider.getResource();
			ep.resource.ep.IEpLocationMap locationMap = textResource.getLocationMap();
			int offset = locationMap.getCharStart(proxyObject);
			int length = locationMap.getCharEnd(proxyObject) + 1 - offset;
			try {
				tokenText = textViewer.getDocument().get(offset, length);
			} catch (org.eclipse.jface.text.BadLocationException e) {
			}
			declarationObject = org.eclipse.emf.ecore.util.EcoreUtil.resolve(proxyObject, resourceProvider.getResource());
			if (declarationObject != null) {
				ep.resource.ep.ui.EpHTMLPrinter.addParagraph(buffer, hoverTextProvider.getHoverText(containerObject, declarationObject));
			}
		} else {
			ep.resource.ep.ui.EpHTMLPrinter.addParagraph(buffer, hoverTextProvider.getHoverText(elements.get(0)));
		}
		if (buffer.length() > 0) {
			ep.resource.ep.ui.EpHTMLPrinter.insertPageProlog(buffer, 0, ep.resource.ep.ui.EpTextHover.getStyleSheet());
			ep.resource.ep.ui.EpHTMLPrinter.addPageEpilog(buffer);
			return new ep.resource.ep.ui.EpDocBrowserInformationControlInput(previousInput, declarationObject, resourceProvider.getResource(), buffer.toString(), tokenText);
		}
		return null;
	}
	
	/**
	 * Sets the style sheet font.
	 * 
	 * @return the hover style sheet
	 */
	private static String getStyleSheet() {
		if (styleSheet == null) {
			styleSheet = loadStyleSheet();
		}
		String css = styleSheet;
		// Sets background color for the hover text window
		css += "body {background-color:#FFFFE1;}\n";
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.resource.JFaceResources.getFontRegistry().getFontData(FONT)[0];
		css = ep.resource.ep.ui.EpHTMLPrinter.convertTopLevelFont(css, fontData);
		
		return css;
	}
	
	/**
	 * Loads and returns the hover style sheet.
	 * 
	 * @return the style sheet, or <code>null</code> if unable to load
	 */
	private static String loadStyleSheet() {
		org.osgi.framework.Bundle bundle = org.eclipse.core.runtime.Platform.getBundle(ep.resource.ep.ui.EpUIPlugin.PLUGIN_ID);
		java.net.URL styleSheetURL = bundle.getEntry("/css/hover_style.css");
		if (styleSheetURL != null) {
			try {
				return ep.resource.ep.util.EpStreamUtil.getContent(styleSheetURL.openStream());
			} catch (java.io.IOException ex) {
				ex.printStackTrace();
			}
		}
		return "";
	}
	
	private static org.eclipse.emf.ecore.EObject getFirstProxy(java.util.List<org.eclipse.emf.ecore.EObject> elements) {
		return getFirstObject(elements, true);
	}
	
	private static org.eclipse.emf.ecore.EObject getFirstNonProxy(java.util.List<org.eclipse.emf.ecore.EObject> elements) {
		return getFirstObject(elements, false);
	}
	
	private static org.eclipse.emf.ecore.EObject getFirstObject(java.util.List<org.eclipse.emf.ecore.EObject> elements, boolean proxy) {
		for (org.eclipse.emf.ecore.EObject object : elements) {
			if (proxy == object.eIsProxy()) {
				return object;
			}
		}
		return null;
	}
	
}
