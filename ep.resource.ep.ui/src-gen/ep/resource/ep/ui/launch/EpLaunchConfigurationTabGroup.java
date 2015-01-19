/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.ui.launch;

/**
 * A class that provides the tabs for the launch configuration.
 */
public class EpLaunchConfigurationTabGroup extends org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {
	
	public void createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog dialog, String mode) {
		// Set the overrideLaunchConfigurationTabGroup option to false to implement this
		// method.
		setTabs(new org.eclipse.debug.ui.ILaunchConfigurationTab[] {new ep.resource.ep.ui.launch.EpLaunchConfigurationMainTab()});
	}
	
}
