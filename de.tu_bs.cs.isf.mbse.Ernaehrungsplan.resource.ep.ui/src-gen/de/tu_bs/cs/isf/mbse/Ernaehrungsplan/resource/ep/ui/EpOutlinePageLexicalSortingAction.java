/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import org.eclipse.jface.action.IAction;

public class EpOutlinePageLexicalSortingAction extends de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageLexicalSortingAction(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
