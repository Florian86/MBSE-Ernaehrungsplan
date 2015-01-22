/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.action.IAction;

public class EpOutlinePageLinkWithEditorAction extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageLinkWithEditorAction(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
