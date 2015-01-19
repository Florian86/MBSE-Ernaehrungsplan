/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

public class EpOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
