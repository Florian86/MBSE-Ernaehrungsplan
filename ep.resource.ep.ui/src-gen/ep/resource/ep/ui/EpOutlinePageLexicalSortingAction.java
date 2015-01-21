/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

import org.eclipse.jface.action.IAction;

public class EpOutlinePageLexicalSortingAction extends ep.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageLexicalSortingAction(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
