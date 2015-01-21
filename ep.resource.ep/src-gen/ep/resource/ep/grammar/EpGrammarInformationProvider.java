/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.grammar;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class EpGrammarInformationProvider {
	
	public final static EStructuralFeature ANONYMOUS_FEATURE = EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static EpGrammarInformationProvider INSTANCE = new EpGrammarInformationProvider();
	
	private Set<String> keywords;
	
	public final static ep.resource.ep.grammar.EpKeyword EP_0_0_0_0 = INSTANCE.getEP_0_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_0_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("Ernaehrungsplan", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_0_0_0_1 = INSTANCE.getEP_0_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_0_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_2 = INSTANCE.getEP_0_0_0_2();
	private ep.resource.ep.grammar.EpContainment getEP_0_0_0_2() {
		return new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {ep.MetamodelPackage.eINSTANCE.getPerson(), }, 0);
	}
	
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_3 = INSTANCE.getEP_0_0_0_3();
	private ep.resource.ep.grammar.EpContainment getEP_0_0_0_3() {
		return new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {ep.MetamodelPackage.eINSTANCE.getZutat(), }, 0);
	}
	
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_4 = INSTANCE.getEP_0_0_0_4();
	private ep.resource.ep.grammar.EpContainment getEP_0_0_0_4() {
		return new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {ep.MetamodelPackage.eINSTANCE.getGericht(), }, 0);
	}
	
	public final static ep.resource.ep.grammar.EpContainment EP_0_0_0_5 = INSTANCE.getEP_0_0_0_5();
	private ep.resource.ep.grammar.EpContainment getEP_0_0_0_5() {
		return new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getEpElement().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT), ep.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), }, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_0_0_0_6 = INSTANCE.getEP_0_0_0_6();
	private ep.resource.ep.grammar.EpKeyword getEP_0_0_0_6() {
		return new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_0_0_0 = INSTANCE.getEP_0_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_0_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_0_0_0_0, EP_0_0_0_1, EP_0_0_0_2, EP_0_0_0_3, EP_0_0_0_4, EP_0_0_0_5, EP_0_0_0_6);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_0_0 = INSTANCE.getEP_0_0();
	private ep.resource.ep.grammar.EpChoice getEP_0_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_0_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_0 = INSTANCE.getEP_0();
	private ep.resource.ep.grammar.EpRule getEP_0() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getEpElement(), EP_0_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_0 = INSTANCE.getEP_1_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_1_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("Person", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_1 = INSTANCE.getEP_1_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_1_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_1_0_0_2 = INSTANCE.getEP_1_0_0_2();
	private ep.resource.ep.grammar.EpPlaceholder getEP_1_0_0_2() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getPerson().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_3 = INSTANCE.getEP_1_0_0_3();
	private ep.resource.ep.grammar.EpKeyword getEP_1_0_0_3() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_1_0_0_4 = INSTANCE.getEP_1_0_0_4();
	private ep.resource.ep.grammar.EpPlaceholder getEP_1_0_0_4() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getPerson().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_1_0_0_5 = INSTANCE.getEP_1_0_0_5();
	private ep.resource.ep.grammar.EpKeyword getEP_1_0_0_5() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_1_0_0 = INSTANCE.getEP_1_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_1_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_1_0_0_0, EP_1_0_0_1, EP_1_0_0_2, EP_1_0_0_3, EP_1_0_0_4, EP_1_0_0_5);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_1_0 = INSTANCE.getEP_1_0();
	private ep.resource.ep.grammar.EpChoice getEP_1_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_1_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_1 = INSTANCE.getEP_1();
	private ep.resource.ep.grammar.EpRule getEP_1() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getPerson(), EP_1_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_0 = INSTANCE.getEP_2_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_2_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("Hauptbestandteil", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_1 = INSTANCE.getEP_2_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_2_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_2_0_0_2 = INSTANCE.getEP_2_0_0_2();
	private ep.resource.ep.grammar.EpPlaceholder getEP_2_0_0_2() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_3 = INSTANCE.getEP_2_0_0_3();
	private ep.resource.ep.grammar.EpKeyword getEP_2_0_0_3() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_2_0_0_4 = INSTANCE.getEP_2_0_0_4();
	private ep.resource.ep.grammar.EpPlaceholder getEP_2_0_0_4() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_2_0_0_5 = INSTANCE.getEP_2_0_0_5();
	private ep.resource.ep.grammar.EpKeyword getEP_2_0_0_5() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_2_0_0 = INSTANCE.getEP_2_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_2_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_2_0_0_0, EP_2_0_0_1, EP_2_0_0_2, EP_2_0_0_3, EP_2_0_0_4, EP_2_0_0_5);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_2_0 = INSTANCE.getEP_2_0();
	private ep.resource.ep.grammar.EpChoice getEP_2_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_2_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_2 = INSTANCE.getEP_2();
	private ep.resource.ep.grammar.EpRule getEP_2() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getHauptbestandteil(), EP_2_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_0 = INSTANCE.getEP_3_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_3_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("Beilage", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_1 = INSTANCE.getEP_3_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_3_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_3_0_0_2 = INSTANCE.getEP_3_0_0_2();
	private ep.resource.ep.grammar.EpPlaceholder getEP_3_0_0_2() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getBeilage().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_3 = INSTANCE.getEP_3_0_0_3();
	private ep.resource.ep.grammar.EpKeyword getEP_3_0_0_3() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_3_0_0_4 = INSTANCE.getEP_3_0_0_4();
	private ep.resource.ep.grammar.EpPlaceholder getEP_3_0_0_4() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getBeilage().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_3_0_0_5 = INSTANCE.getEP_3_0_0_5();
	private ep.resource.ep.grammar.EpKeyword getEP_3_0_0_5() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_3_0_0 = INSTANCE.getEP_3_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_3_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_3_0_0_0, EP_3_0_0_1, EP_3_0_0_2, EP_3_0_0_3, EP_3_0_0_4, EP_3_0_0_5);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_3_0 = INSTANCE.getEP_3_0();
	private ep.resource.ep.grammar.EpChoice getEP_3_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_3_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_3 = INSTANCE.getEP_3();
	private ep.resource.ep.grammar.EpRule getEP_3() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getBeilage(), EP_3_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_0 = INSTANCE.getEP_4_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_4_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("Sauce", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_1 = INSTANCE.getEP_4_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_4_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_4_0_0_2 = INSTANCE.getEP_4_0_0_2();
	private ep.resource.ep.grammar.EpPlaceholder getEP_4_0_0_2() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getSauce().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_3 = INSTANCE.getEP_4_0_0_3();
	private ep.resource.ep.grammar.EpKeyword getEP_4_0_0_3() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_4_0_0_4 = INSTANCE.getEP_4_0_0_4();
	private ep.resource.ep.grammar.EpPlaceholder getEP_4_0_0_4() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getSauce().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL), "TEXT", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_4_0_0_5 = INSTANCE.getEP_4_0_0_5();
	private ep.resource.ep.grammar.EpKeyword getEP_4_0_0_5() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_4_0_0 = INSTANCE.getEP_4_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_4_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_4_0_0_0, EP_4_0_0_1, EP_4_0_0_2, EP_4_0_0_3, EP_4_0_0_4, EP_4_0_0_5);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_4_0 = INSTANCE.getEP_4_0();
	private ep.resource.ep.grammar.EpChoice getEP_4_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_4_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_4 = INSTANCE.getEP_4();
	private ep.resource.ep.grammar.EpRule getEP_4() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getSauce(), EP_4_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_0 = INSTANCE.getEP_5_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("Gericht", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_1 = INSTANCE.getEP_5_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_2 = INSTANCE.getEP_5_0_0_2();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_2() {
		return new ep.resource.ep.grammar.EpKeyword("name", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_5_0_0_3 = INSTANCE.getEP_5_0_0_3();
	private ep.resource.ep.grammar.EpPlaceholder getEP_5_0_0_3() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_4 = INSTANCE.getEP_5_0_0_4();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_4() {
		return new ep.resource.ep.grammar.EpKeyword("kommentar", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_5_0_0_5 = INSTANCE.getEP_5_0_0_5();
	private ep.resource.ep.grammar.EpPlaceholder getEP_5_0_0_5() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR), "QUOTED_34_34", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_6 = INSTANCE.getEP_5_0_0_6();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_6() {
		return new ep.resource.ep.grammar.EpKeyword("istSalat", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpBooleanTerminal EP_5_0_0_7 = INSTANCE.getEP_5_0_0_7();
	private ep.resource.ep.grammar.EpBooleanTerminal getEP_5_0_0_7() {
		return new ep.resource.ep.grammar.EpBooleanTerminal(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT), "ja", "nein", ep.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_8 = INSTANCE.getEP_5_0_0_8();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_8() {
		return new ep.resource.ep.grammar.EpKeyword("besteht aus", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_9 = INSTANCE.getEP_5_0_0_9();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_9() {
		return new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpContainment EP_5_0_0_10 = INSTANCE.getEP_5_0_0_10();
	private ep.resource.ep.grammar.EpContainment getEP_5_0_0_10() {
		return new ep.resource.ep.grammar.EpContainment(ep.MetamodelPackage.eINSTANCE.getGericht().getEStructuralFeature(ep.MetamodelPackage.GERICHT__ZUTATEN), ep.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), }, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_11 = INSTANCE.getEP_5_0_0_11();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_11() {
		return new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_5_0_0_12 = INSTANCE.getEP_5_0_0_12();
	private ep.resource.ep.grammar.EpKeyword getEP_5_0_0_12() {
		return new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_5_0_0 = INSTANCE.getEP_5_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_5_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_5_0_0_0, EP_5_0_0_1, EP_5_0_0_2, EP_5_0_0_3, EP_5_0_0_4, EP_5_0_0_5, EP_5_0_0_6, EP_5_0_0_7, EP_5_0_0_8, EP_5_0_0_9, EP_5_0_0_10, EP_5_0_0_11, EP_5_0_0_12);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_5_0 = INSTANCE.getEP_5_0();
	private ep.resource.ep.grammar.EpChoice getEP_5_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_5_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_5 = INSTANCE.getEP_5();
	private ep.resource.ep.grammar.EpRule getEP_5() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getGericht(), EP_5_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_0 = INSTANCE.getEP_6_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("eplan", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_1 = INSTANCE.getEP_6_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("{", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_2 = INSTANCE.getEP_6_0_0_2();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_2() {
		return new ep.resource.ep.grammar.EpKeyword("person", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_3 = INSTANCE.getEP_6_0_0_3();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_3() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_4 = INSTANCE.getEP_6_0_0_4();
	private ep.resource.ep.grammar.EpPlaceholder getEP_6_0_0_4() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_5 = INSTANCE.getEP_6_0_0_5();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_5() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_6 = INSTANCE.getEP_6_0_0_6();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_6() {
		return new ep.resource.ep.grammar.EpKeyword("gerichte", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_7 = INSTANCE.getEP_6_0_0_7();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_7() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_8 = INSTANCE.getEP_6_0_0_8();
	private ep.resource.ep.grammar.EpPlaceholder getEP_6_0_0_8() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_9_0_0_0 = INSTANCE.getEP_6_0_0_9_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_9_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_6_0_0_9_0_0_1 = INSTANCE.getEP_6_0_0_9_0_0_1();
	private ep.resource.ep.grammar.EpPlaceholder getEP_6_0_0_9_0_0_1() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_6_0_0_9_0_0 = INSTANCE.getEP_6_0_0_9_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_6_0_0_9_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_9_0_0_0, EP_6_0_0_9_0_0_1);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_6_0_0_9_0 = INSTANCE.getEP_6_0_0_9_0();
	private ep.resource.ep.grammar.EpChoice getEP_6_0_0_9_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_9_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpCompound EP_6_0_0_9 = INSTANCE.getEP_6_0_0_9();
	private ep.resource.ep.grammar.EpCompound getEP_6_0_0_9() {
		return new ep.resource.ep.grammar.EpCompound(EP_6_0_0_9_0, ep.resource.ep.grammar.EpCardinality.STAR);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_10 = INSTANCE.getEP_6_0_0_10();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_10() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_6_0_0_11 = INSTANCE.getEP_6_0_0_11();
	private ep.resource.ep.grammar.EpKeyword getEP_6_0_0_11() {
		return new ep.resource.ep.grammar.EpKeyword("}", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_6_0_0 = INSTANCE.getEP_6_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_6_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_0, EP_6_0_0_1, EP_6_0_0_2, EP_6_0_0_3, EP_6_0_0_4, EP_6_0_0_5, EP_6_0_0_6, EP_6_0_0_7, EP_6_0_0_8, EP_6_0_0_9, EP_6_0_0_10, EP_6_0_0_11);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_6_0 = INSTANCE.getEP_6_0();
	private ep.resource.ep.grammar.EpChoice getEP_6_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_6 = INSTANCE.getEP_6();
	private ep.resource.ep.grammar.EpRule getEP_6() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getErnaehrungsplan(), EP_6_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_0 = INSTANCE.getEP_7_0_0_0();
	private ep.resource.ep.grammar.EpKeyword getEP_7_0_0_0() {
		return new ep.resource.ep.grammar.EpKeyword("zutat", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_1 = INSTANCE.getEP_7_0_0_1();
	private ep.resource.ep.grammar.EpKeyword getEP_7_0_0_1() {
		return new ep.resource.ep.grammar.EpKeyword("(", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_7_0_0_2 = INSTANCE.getEP_7_0_0_2();
	private ep.resource.ep.grammar.EpPlaceholder getEP_7_0_0_2() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_3 = INSTANCE.getEP_7_0_0_3();
	private ep.resource.ep.grammar.EpKeyword getEP_7_0_0_3() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_7_0_0_4 = INSTANCE.getEP_7_0_0_4();
	private ep.resource.ep.grammar.EpPlaceholder getEP_7_0_0_4() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_5 = INSTANCE.getEP_7_0_0_5();
	private ep.resource.ep.grammar.EpKeyword getEP_7_0_0_5() {
		return new ep.resource.ep.grammar.EpKeyword(",", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpPlaceholder EP_7_0_0_6 = INSTANCE.getEP_7_0_0_6();
	private ep.resource.ep.grammar.EpPlaceholder getEP_7_0_0_6() {
		return new ep.resource.ep.grammar.EpPlaceholder(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), "TEXT", ep.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static ep.resource.ep.grammar.EpKeyword EP_7_0_0_7 = INSTANCE.getEP_7_0_0_7();
	private ep.resource.ep.grammar.EpKeyword getEP_7_0_0_7() {
		return new ep.resource.ep.grammar.EpKeyword(")", ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static ep.resource.ep.grammar.EpSequence EP_7_0_0 = INSTANCE.getEP_7_0_0();
	private ep.resource.ep.grammar.EpSequence getEP_7_0_0() {
		return new ep.resource.ep.grammar.EpSequence(ep.resource.ep.grammar.EpCardinality.ONE, EP_7_0_0_0, EP_7_0_0_1, EP_7_0_0_2, EP_7_0_0_3, EP_7_0_0_4, EP_7_0_0_5, EP_7_0_0_6, EP_7_0_0_7);
	}
	
	public final static ep.resource.ep.grammar.EpChoice EP_7_0 = INSTANCE.getEP_7_0();
	private ep.resource.ep.grammar.EpChoice getEP_7_0() {
		return new ep.resource.ep.grammar.EpChoice(ep.resource.ep.grammar.EpCardinality.ONE, EP_7_0_0);
	}
	
	public final static ep.resource.ep.grammar.EpRule EP_7 = INSTANCE.getEP_7();
	private ep.resource.ep.grammar.EpRule getEP_7() {
		return new ep.resource.ep.grammar.EpRule(ep.MetamodelPackage.eINSTANCE.getGericht2Zutat(), EP_7_0, ep.resource.ep.grammar.EpCardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(ep.resource.ep.grammar.EpSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : ep.resource.ep.grammar.EpGrammarInformationProvider.class.getFields()) {
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
	public Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new LinkedHashSet<String>();
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
	private void findKeywords(ep.resource.ep.grammar.EpSyntaxElement element, Set<String> keywords) {
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
