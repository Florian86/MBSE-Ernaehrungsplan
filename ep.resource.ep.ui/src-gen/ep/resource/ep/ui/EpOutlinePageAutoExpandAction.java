/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

public class EpOutlinePageAutoExpandAction extends ep.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageAutoExpandAction(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
