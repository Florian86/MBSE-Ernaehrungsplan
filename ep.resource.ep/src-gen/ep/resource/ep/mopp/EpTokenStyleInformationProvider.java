/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;


public class EpTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public ep.resource.ep.IEpTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("Ernaehrungsplan".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Person".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Hauptbestandteil".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Beilage".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Sauce".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Gericht".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("kommentar".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("istSalat".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ja".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("nein".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("besteht aus".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("eplan".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("person".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("gerichte".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("zutat".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new ep.resource.ep.mopp.EpTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
