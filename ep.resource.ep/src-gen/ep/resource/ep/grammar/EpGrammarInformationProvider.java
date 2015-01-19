/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

public class EpGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static EpGrammarInformationProvider INSTANCE = new EpGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static ep.resource.ep.grammar.EpKeyword EP_0_0_0_0 = new ep.resource.ep.grammar.EpKeyword("Ernaehrungsplan", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_0_0_0_1 = new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_2 = new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ep.MetamodelPackage.eINSTANCE.getPerson(), }, 0);
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_3 = new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ep.MetamodelPackage.eINSTANCE.getZutat(), }, 0);
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_4 = new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ep.MetamodelPackage.eINSTANCE.getGericht(), }, 0);
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_5 = new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), }, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_0_0_0_6 = new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_0_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_0_0_0_0, EP_0_0_0_1, EP_0_0_0_2, EP_0_0_0_3, EP_0_0_0_4, EP_0_0_0_5, EP_0_0_0_6);
	public final static ep.resource.ep.grammar.EpChoice EP_0_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_0_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_0 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getEpElement(), EP_0_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_0 = new ep.resource.ep.grammar.EpKeyword("Person", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_1 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_1_0_0_2 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getPerson().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_3 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_1_0_0_4 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getPerson().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_5 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_1_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_1_0_0_0, EP_1_0_0_1, EP_1_0_0_2, EP_1_0_0_3, EP_1_0_0_4, EP_1_0_0_5);
	public final static ep.resource.ep.grammar.EpChoice EP_1_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_1_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_1 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getPerson(), EP_1_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_0 = new ep.resource.ep.grammar.EpKeyword("Hauptbestandteil", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_1 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_2_0_0_2 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_3 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_2_0_0_4 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_5 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_2_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_2_0_0_0, EP_2_0_0_1, EP_2_0_0_2, EP_2_0_0_3, EP_2_0_0_4, EP_2_0_0_5);
	public final static ep.resource.ep.grammar.EpChoice EP_2_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_2_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_2 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), EP_2_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_0 = new ep.resource.ep.grammar.EpKeyword("Beilage", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_1 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_3_0_0_2 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getBeilage().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_3 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_3_0_0_4 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getBeilage().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_5 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_3_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_3_0_0_0, EP_3_0_0_1, EP_3_0_0_2, EP_3_0_0_3, EP_3_0_0_4, EP_3_0_0_5);
	public final static ep.resource.ep.grammar.EpChoice EP_3_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_3_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_3 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getBeilage(), EP_3_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_0 = new ep.resource.ep.grammar.EpKeyword("Sauce", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_1 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_4_0_0_2 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getSauce().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_3 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_4_0_0_4 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getSauce().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_5 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_4_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_4_0_0_0, EP_4_0_0_1, EP_4_0_0_2, EP_4_0_0_3, EP_4_0_0_4, EP_4_0_0_5);
	public final static ep.resource.ep.grammar.EpChoice EP_4_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_4_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_4 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getSauce(), EP_4_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_0 = new ep.resource.ep.grammar.EpKeyword("Gericht", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_1 = new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_2 = new ep.resource.ep.grammar.EpKeyword("name", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_5_0_0_3 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_4 = new ep.resource.ep.grammar.EpKeyword("kommentar", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_5_0_0_5 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR), "QUOTED_34_34", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_6 = new ep.resource.ep.grammar.EpKeyword("istSalat", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpBooleanTerminal EP_5_0_0_7 = new ep.resource.ep.grammar.EpBooleanTerminal(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT), "ja", "nein", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_8 = new ep.resource.ep.grammar.EpKeyword("besteht aus", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_9 = new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpContainment EP_5_0_0_10 = new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__ZUTATEN), ep.resource.ep.grammar.EpCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), }, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_11 = new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_12 = new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_5_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_5_0_0_0, EP_5_0_0_1, EP_5_0_0_2, EP_5_0_0_3, EP_5_0_0_4, EP_5_0_0_5, EP_5_0_0_6, EP_5_0_0_7, EP_5_0_0_8, EP_5_0_0_9, EP_5_0_0_10, EP_5_0_0_11, EP_5_0_0_12);
	public final static ep.resource.ep.grammar.EpChoice EP_5_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_5_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_5 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getGericht(), EP_5_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_0 = new ep.resource.ep.grammar.EpKeyword("eplan", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_1 = new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_2 = new ep.resource.ep.grammar.EpKeyword("personen", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_3 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_4 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_5_0_0_0 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_5_0_0_1 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpSequence EP_6_0_0_5_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_5_0_0_0, EP_6_0_0_5_0_0_1);
	public final static ep.resource.ep.grammar.EpChoice EP_6_0_0_5_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_5_0_0);
	public final static ep.resource.ep.grammar.EpCompound EP_6_0_0_5 = new ep.resource.ep.grammar.EpCompound(EP_6_0_0_5_0, ep.resource.ep.grammar.EpCardinality.STAR);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_6 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_7 = new ep.resource.ep.grammar.EpKeyword("gerichte", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_8 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_9 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_10_0_0_0 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_10_0_0_1 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpSequence EP_6_0_0_10_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_10_0_0_0, EP_6_0_0_10_0_0_1);
	public final static ep.resource.ep.grammar.EpChoice EP_6_0_0_10_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_10_0_0);
	public final static ep.resource.ep.grammar.EpCompound EP_6_0_0_10 = new ep.resource.ep.grammar.EpCompound(EP_6_0_0_10_0, ep.resource.ep.grammar.EpCardinality.STAR);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_11 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_12 = new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_6_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_0, EP_6_0_0_1, EP_6_0_0_2, EP_6_0_0_3, EP_6_0_0_4, EP_6_0_0_5, EP_6_0_0_6, EP_6_0_0_7, EP_6_0_0_8, EP_6_0_0_9, EP_6_0_0_10, EP_6_0_0_11, EP_6_0_0_12);
	public final static ep.resource.ep.grammar.EpChoice EP_6_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_6 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), EP_6_0, ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_0 = new ep.resource.ep.grammar.EpKeyword("zutat", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_1 = new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_7_0_0_2 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_3 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_7_0_0_4 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_5 = new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpPlaceholder EP_7_0_0_6 = new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_7 = new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	public final static ep.resource.ep.grammar.EpSequence EP_7_0_0 = new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_7_0_0_0, EP_7_0_0_1, EP_7_0_0_2, EP_7_0_0_3, EP_7_0_0_4, EP_7_0_0_5, EP_7_0_0_6, EP_7_0_0_7);
	public final static ep.resource.ep.grammar.EpChoice EP_7_0 = new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_7_0_0);
	public final static ep.resource.ep.grammar.EpRule EP_7 = new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), EP_7_0, ep.resource.ep.grammar.EpCardinality.ONE);
	
	public static String getSyntaxElementID(ep.resource.ep.grammar.EpSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : ep.resource.ep.grammar.EpGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static ep.resource.ep.grammar.EpSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (ep.resource.ep.grammar.EpSyntaxElement) ep.resource.ep.grammar.EpGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static ep.resource.ep.grammar.EpRule[] RULES = new ep.resource.ep.grammar.EpRule[] {
		EP_0,
		EP_1,
		EP_2,
		EP_3,
		EP_4,
		EP_5,
		EP_6,
		EP_7,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (ep.resource.ep.grammar.EpRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(ep.resource.ep.grammar.EpSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof ep.resource.ep.grammar.EpKeyword) {
			keywords.add(((ep.resource.ep.grammar.EpKeyword) element).getValue());
		} else if (element instanceof ep.resource.ep.grammar.EpBooleanTerminal) {
			keywords.add(((ep.resource.ep.grammar.EpBooleanTerminal) element).getTrueLiteral());
			keywords.add(((ep.resource.ep.grammar.EpBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof ep.resource.ep.grammar.EpEnumerationTerminal) {
			ep.resource.ep.grammar.EpEnumerationTerminal terminal = (ep.resource.ep.grammar.EpEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (ep.resource.ep.grammar.EpSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
