/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class EpOutlinePageActionProvider {
	
	public List<IAction> getActions(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new ep.resource.ep.ui.EpOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
