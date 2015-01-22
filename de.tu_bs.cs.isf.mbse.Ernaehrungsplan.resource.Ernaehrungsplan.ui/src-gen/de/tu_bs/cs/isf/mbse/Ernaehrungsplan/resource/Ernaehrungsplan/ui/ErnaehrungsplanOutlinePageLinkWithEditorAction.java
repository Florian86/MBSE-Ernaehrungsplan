/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui;

import org.eclipse.jface.action.IAction;

public class ErnaehrungsplanOutlinePageLinkWithEditorAction extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.AbstractErnaehrungsplanOutlinePageAction {
	
	public ErnaehrungsplanOutlinePageLinkWithEditorAction(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ui.ErnaehrungsplanOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
