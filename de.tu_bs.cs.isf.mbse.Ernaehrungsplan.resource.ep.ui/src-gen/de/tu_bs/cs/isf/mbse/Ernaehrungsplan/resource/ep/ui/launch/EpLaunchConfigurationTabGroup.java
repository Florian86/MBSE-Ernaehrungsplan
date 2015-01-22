/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * A class that provides the tabs for the launch configuration.
 */
public class EpLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {
	
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		// Set the overrideLaunchConfigurationTabGroup option to false to implement this
		// method.
		setTabs(new ILaunchConfigurationTab[] {new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.launch.EpLaunchConfigurationMainTab()});
	}
	
}
