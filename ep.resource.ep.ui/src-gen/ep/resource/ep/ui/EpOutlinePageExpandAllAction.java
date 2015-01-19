/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

public class EpOutlinePageExpandAllAction extends ep.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageExpandAllAction(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
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
