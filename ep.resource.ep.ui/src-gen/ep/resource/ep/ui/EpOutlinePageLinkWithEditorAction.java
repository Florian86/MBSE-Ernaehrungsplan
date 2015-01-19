/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

public class EpOutlinePageLinkWithEditorAction extends ep.resource.ep.ui.AbstractEpOutlinePageAction {
	
	public EpOutlinePageLinkWithEditorAction(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
