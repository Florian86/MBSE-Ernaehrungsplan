/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.action.IAction;

public class EpOutlinePageAutoExpandAction extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageAutoExpandAction(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
