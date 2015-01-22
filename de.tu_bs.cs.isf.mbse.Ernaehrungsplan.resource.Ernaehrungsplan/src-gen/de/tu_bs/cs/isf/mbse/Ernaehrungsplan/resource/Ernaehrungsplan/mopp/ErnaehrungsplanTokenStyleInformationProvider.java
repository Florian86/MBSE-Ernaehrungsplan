/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;


public class ErnaehrungsplanTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("model".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("abstract".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("entity".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("datatype".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("att".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ref".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("cont".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
