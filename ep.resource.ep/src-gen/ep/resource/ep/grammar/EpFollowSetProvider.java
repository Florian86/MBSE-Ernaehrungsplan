/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class EpFollowSetProvider {
	
	public final static ep.resource.ep.IEpExpectedElement TERMINALS[] = new ep.resource.ep.IEpExpectedElement[60];
	
	public final static EStructuralFeature[] FEATURES = new EStructuralFeature[5];
	
	public final static ep.resource.ep.mopp.EpContainedFeature[] LINKS = new ep.resource.ep.mopp.EpContainedFeature[34];
	
	public final static ep.resource.ep.mopp.EpContainedFeature[] EMPTY_LINK_ARRAY = new ep.resource.ep.mopp.EpContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_0);
		TERMINALS[1] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_1);
		TERMINALS[2] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_0);
		TERMINALS[3] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_0);
		TERMINALS[4] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_0);
		TERMINALS[5] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_0);
		TERMINALS[6] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_0);
		TERMINALS[7] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_0);
		TERMINALS[8] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_6);
		TERMINALS[9] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_1);
		TERMINALS[10] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_2);
		TERMINALS[11] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_3);
		TERMINALS[12] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_4);
		TERMINALS[13] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_5);
		TERMINALS[14] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_1);
		TERMINALS[15] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_2);
		TERMINALS[16] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_3);
		TERMINALS[17] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_4);
		TERMINALS[18] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_5);
		TERMINALS[19] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_1);
		TERMINALS[20] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_2);
		TERMINALS[21] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_3);
		TERMINALS[22] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_4);
		TERMINALS[23] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_5);
		TERMINALS[24] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_1);
		TERMINALS[25] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_2);
		TERMINALS[26] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_3);
		TERMINALS[27] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_4);
		TERMINALS[28] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_5);
		TERMINALS[29] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_1);
		TERMINALS[30] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_2);
		TERMINALS[31] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_3);
		TERMINALS[32] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_4);
		TERMINALS[33] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_5);
		TERMINALS[34] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_6);
		TERMINALS[35] = new ep.resource.ep.mopp.EpExpectedBooleanTerminal(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7);
		TERMINALS[36] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_8);
		TERMINALS[37] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_9);
		TERMINALS[38] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_0);
		TERMINALS[39] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_11);
		TERMINALS[40] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_12);
		TERMINALS[41] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_1);
		TERMINALS[42] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_2);
		TERMINALS[43] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_3);
		TERMINALS[44] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_4);
		TERMINALS[45] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_5);
		TERMINALS[46] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_6);
		TERMINALS[47] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_7);
		TERMINALS[48] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_8);
		TERMINALS[49] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9_0_0_0);
		TERMINALS[50] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_10);
		TERMINALS[51] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9_0_0_1);
		TERMINALS[52] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_11);
		TERMINALS[53] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_1);
		TERMINALS[54] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_2);
		TERMINALS[55] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_3);
		TERMINALS[56] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_4);
		TERMINALS[57] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_5);
		TERMINALS[58] = new ep.resource.ep.mopp.EpExpectedStructuralFeature(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_6);
		TERMINALS[59] = new ep.resource.ep.mopp.EpExpectedCsString(ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_7);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT);
		FEATURES[1] = ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT);
		FEATURES[2] = ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT);
		FEATURES[3] = ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__ZUTATEN);
		FEATURES[4] = ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getPerson(), FEATURES[0]);
		LINKS[1] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getPerson(), FEATURES[0]);
		LINKS[2] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]);
		LINKS[3] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]);
		LINKS[4] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]);
		LINKS[5] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]);
		LINKS[6] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]);
		LINKS[7] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]);
		LINKS[8] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]);
		LINKS[9] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]);
		LINKS[10] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), FEATURES[4]);
		LINKS[11] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), FEATURES[4]);
		LINKS[12] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getPerson(), FEATURES[0]);
		LINKS[13] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]);
		LINKS[14] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]);
		LINKS[15] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]);
		LINKS[16] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]);
		LINKS[17] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]);
		LINKS[18] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]);
		LINKS[19] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]);
		LINKS[20] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]);
		LINKS[21] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]);
		LINKS[22] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]);
		LINKS[23] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]);
		LINKS[24] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]);
		LINKS[25] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]);
		LINKS[26] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]);
		LINKS[27] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]);
		LINKS[28] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), FEATURES[3]);
		LINKS[29] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), FEATURES[3]);
		LINKS[30] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]);
		LINKS[31] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), FEATURES[4]);
		LINKS[32] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), FEATURES[4]);
		LINKS[33] = new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), FEATURES[3]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[2], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getPerson(), FEATURES[0]), });
		TERMINALS[2].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[9].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[10].addFollower(TERMINALS[11], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[12].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[2], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getPerson(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[3], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]), });
		TERMINALS[13].addFollower(TERMINALS[4], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]), });
		TERMINALS[13].addFollower(TERMINALS[5], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]), });
		TERMINALS[3].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[17].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[3], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]), });
		TERMINALS[18].addFollower(TERMINALS[4], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]), });
		TERMINALS[18].addFollower(TERMINALS[5], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]), });
		TERMINALS[18].addFollower(TERMINALS[6], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]), });
		TERMINALS[4].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[19].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[21], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[3], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]), });
		TERMINALS[23].addFollower(TERMINALS[4], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]), });
		TERMINALS[23].addFollower(TERMINALS[5], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]), });
		TERMINALS[23].addFollower(TERMINALS[6], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]), });
		TERMINALS[5].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[25], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[27], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[28], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[28], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[3], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), FEATURES[1]), });
		TERMINALS[28].addFollower(TERMINALS[4], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getBeilage(), FEATURES[1]), });
		TERMINALS[28].addFollower(TERMINALS[5], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getSauce(), FEATURES[1]), });
		TERMINALS[28].addFollower(TERMINALS[6], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]), });
		TERMINALS[6].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[29].addFollower(TERMINALS[30], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[31], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[32], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[33], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[33].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[35].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[37], EMPTY_LINK_ARRAY);
		TERMINALS[37].addFollower(TERMINALS[38], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), FEATURES[3]), });
		TERMINALS[39].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[6], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht(), FEATURES[2]), });
		TERMINALS[40].addFollower(TERMINALS[7], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), FEATURES[4]), });
		TERMINALS[7].addFollower(TERMINALS[41], EMPTY_LINK_ARRAY);
		TERMINALS[41].addFollower(TERMINALS[42], EMPTY_LINK_ARRAY);
		TERMINALS[42].addFollower(TERMINALS[43], EMPTY_LINK_ARRAY);
		TERMINALS[43].addFollower(TERMINALS[44], EMPTY_LINK_ARRAY);
		TERMINALS[44].addFollower(TERMINALS[45], EMPTY_LINK_ARRAY);
		TERMINALS[45].addFollower(TERMINALS[46], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[47], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[48], EMPTY_LINK_ARRAY);
		TERMINALS[48].addFollower(TERMINALS[49], EMPTY_LINK_ARRAY);
		TERMINALS[48].addFollower(TERMINALS[50], EMPTY_LINK_ARRAY);
		TERMINALS[49].addFollower(TERMINALS[51], EMPTY_LINK_ARRAY);
		TERMINALS[51].addFollower(TERMINALS[49], EMPTY_LINK_ARRAY);
		TERMINALS[51].addFollower(TERMINALS[50], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[52], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[7], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), FEATURES[4]), });
		TERMINALS[52].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[53].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[54].addFollower(TERMINALS[55], EMPTY_LINK_ARRAY);
		TERMINALS[55].addFollower(TERMINALS[56], EMPTY_LINK_ARRAY);
		TERMINALS[56].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[57].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[58].addFollower(TERMINALS[59], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[38], new ep.resource.ep.mopp.EpContainedFeature[] {new ep.resource.ep.mopp.EpContainedFeature(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), FEATURES[3]), });
		TERMINALS[59].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
