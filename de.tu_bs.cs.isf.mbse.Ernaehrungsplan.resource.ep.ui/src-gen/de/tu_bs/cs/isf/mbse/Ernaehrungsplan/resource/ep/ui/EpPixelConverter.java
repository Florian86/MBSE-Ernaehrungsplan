/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Control;

/**
 * A utility class for pixel conversion.
 */
public class EpPixelConverter {
	
	private FontMetrics fFontMetrics;
	
	public EpPixelConverter(Control control) {
		GC gc = new GC(control);
		gc.setFont(control.getFont());
		fFontMetrics = gc.getFontMetrics();
		gc.dispose();
	}
	
	public int convertHeightInCharsToPixels(int chars) {
		return Dialog.convertHeightInCharsToPixels(fFontMetrics, chars);
	}
	
	public int convertHorizontalDLUsToPixels(int dlus) {
		return Dialog.convertHorizontalDLUsToPixels(fFontMetrics, dlus);
	}
	
	public int convertVerticalDLUsToPixels(int dlus) {
		return Dialog.convertVerticalDLUsToPixels(fFontMetrics, dlus);
	}
	
	public int convertWidthInCharsToPixels(int chars) {
		return Dialog.convertWidthInCharsToPixels(fFontMetrics, chars);
	}
	
}
