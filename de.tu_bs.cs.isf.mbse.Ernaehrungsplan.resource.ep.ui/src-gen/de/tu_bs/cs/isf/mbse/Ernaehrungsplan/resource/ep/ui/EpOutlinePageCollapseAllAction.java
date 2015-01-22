/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.action.IAction;

public class EpOutlinePageCollapseAllAction extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageCollapseAllAction(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
