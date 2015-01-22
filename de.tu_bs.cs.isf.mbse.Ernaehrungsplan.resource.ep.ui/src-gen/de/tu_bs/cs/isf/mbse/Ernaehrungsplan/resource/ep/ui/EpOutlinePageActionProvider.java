/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class EpOutlinePageActionProvider {
	
	public List<IAction> getActions(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
