/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.action.IAction;

public class EpOutlinePageExpandAllAction extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageExpandAllAction(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
