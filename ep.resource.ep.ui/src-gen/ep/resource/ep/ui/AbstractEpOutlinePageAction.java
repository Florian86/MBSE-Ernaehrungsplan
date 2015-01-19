/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui;

public abstract class AbstractEpOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer;
	
	public AbstractEpOutlinePageAction(ep.resource.ep.ui.EpOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = ep.resource.ep.ui.EpImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = ep.resource.ep.ui.EpUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			ep.resource.ep.ui.EpUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public ep.resource.ep.ui.EpOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public ep.resource.ep.ui.EpOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (ep.resource.ep.ui.EpOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
