/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

public class EpOutlinePageTypeSortingAction extends ep.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageTypeSortingAction(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
