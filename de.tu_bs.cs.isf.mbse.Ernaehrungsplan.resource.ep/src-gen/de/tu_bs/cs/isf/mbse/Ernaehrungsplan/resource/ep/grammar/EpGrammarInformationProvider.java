/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar;

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
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_0_0_0_0 = INSTANCE.getEP_0_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_0_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("Ernaehrungsplan", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_0_0_0_1 = INSTANCE.getEP_0_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_0_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("{", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment EP_0_0_0_2 = INSTANCE.getEP_0_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment getEP_0_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__PERSON_ELEMENT), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getPerson(), }, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment EP_0_0_0_3 = INSTANCE.getEP_0_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment getEP_0_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__ZUTAT_ELEMENT), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getZutat(), }, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment EP_0_0_0_4 = INSTANCE.getEP_0_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment getEP_0_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__GERICHT_ELEMENT), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), }, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment EP_0_0_0_5 = INSTANCE.getEP_0_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment getEP_0_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__EPLAN_ELEMENT), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan(), }, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_0_0_0_6 = INSTANCE.getEP_0_0_0_6();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_0_0_0_6() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("}", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_0_0_0 = INSTANCE.getEP_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_0_0_0_0, EP_0_0_0_1, EP_0_0_0_2, EP_0_0_0_3, EP_0_0_0_4, EP_0_0_0_5, EP_0_0_0_6);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_0_0 = INSTANCE.getEP_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_0_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_0 = INSTANCE.getEP_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), EP_0_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_1_0_0_0 = INSTANCE.getEP_1_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_1_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("Person", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_1_0_0_1 = INSTANCE.getEP_1_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_1_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_1_0_0_2 = INSTANCE.getEP_1_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_1_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getPerson().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__NAME), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_1_0_0_3 = INSTANCE.getEP_1_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_1_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_1_0_0_4 = INSTANCE.getEP_1_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_1_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getPerson().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__KCAL), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_1_0_0_5 = INSTANCE.getEP_1_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_1_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_1_0_0 = INSTANCE.getEP_1_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_1_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_1_0_0_0, EP_1_0_0_1, EP_1_0_0_2, EP_1_0_0_3, EP_1_0_0_4, EP_1_0_0_5);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_1_0 = INSTANCE.getEP_1_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_1_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_1_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_1 = INSTANCE.getEP_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getPerson(), EP_1_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_2_0_0_0 = INSTANCE.getEP_2_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_2_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("Hauptbestandteil", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_2_0_0_1 = INSTANCE.getEP_2_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_2_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_2_0_0_2 = INSTANCE.getEP_2_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_2_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getHauptbestandteil().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__NAME), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_2_0_0_3 = INSTANCE.getEP_2_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_2_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_2_0_0_4 = INSTANCE.getEP_2_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_2_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getHauptbestandteil().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__KCAL), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_2_0_0_5 = INSTANCE.getEP_2_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_2_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_2_0_0 = INSTANCE.getEP_2_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_2_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_2_0_0_0, EP_2_0_0_1, EP_2_0_0_2, EP_2_0_0_3, EP_2_0_0_4, EP_2_0_0_5);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_2_0 = INSTANCE.getEP_2_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_2_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_2_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_2 = INSTANCE.getEP_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getHauptbestandteil(), EP_2_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_3_0_0_0 = INSTANCE.getEP_3_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_3_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("Beilage", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_3_0_0_1 = INSTANCE.getEP_3_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_3_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_3_0_0_2 = INSTANCE.getEP_3_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_3_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getBeilage().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__NAME), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_3_0_0_3 = INSTANCE.getEP_3_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_3_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_3_0_0_4 = INSTANCE.getEP_3_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_3_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getBeilage().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__KCAL), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_3_0_0_5 = INSTANCE.getEP_3_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_3_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_3_0_0 = INSTANCE.getEP_3_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_3_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_3_0_0_0, EP_3_0_0_1, EP_3_0_0_2, EP_3_0_0_3, EP_3_0_0_4, EP_3_0_0_5);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_3_0 = INSTANCE.getEP_3_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_3_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_3_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_3 = INSTANCE.getEP_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getBeilage(), EP_3_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_4_0_0_0 = INSTANCE.getEP_4_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_4_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("Sauce", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_4_0_0_1 = INSTANCE.getEP_4_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_4_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_4_0_0_2 = INSTANCE.getEP_4_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_4_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getSauce().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__NAME), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_4_0_0_3 = INSTANCE.getEP_4_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_4_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_4_0_0_4 = INSTANCE.getEP_4_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_4_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getSauce().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__KCAL), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_4_0_0_5 = INSTANCE.getEP_4_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_4_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_4_0_0 = INSTANCE.getEP_4_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_4_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_4_0_0_0, EP_4_0_0_1, EP_4_0_0_2, EP_4_0_0_3, EP_4_0_0_4, EP_4_0_0_5);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_4_0 = INSTANCE.getEP_4_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_4_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_4_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_4 = INSTANCE.getEP_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getSauce(), EP_4_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_0 = INSTANCE.getEP_5_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("Gericht", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_1 = INSTANCE.getEP_5_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("{", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_2 = INSTANCE.getEP_5_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("name", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_5_0_0_3 = INSTANCE.getEP_5_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_5_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__NAME), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_4 = INSTANCE.getEP_5_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("kommentar", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_5_0_0_5 = INSTANCE.getEP_5_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_5_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__KOMMENTAR), "QUOTED_34_34", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_6 = INSTANCE.getEP_5_0_0_6();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_6() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("istSalat", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal EP_5_0_0_7 = INSTANCE.getEP_5_0_0_7();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal getEP_5_0_0_7() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__IST_SALAT), "ja", "nein", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.QUESTIONMARK, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_8 = INSTANCE.getEP_5_0_0_8();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_8() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("besteht aus", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_9 = INSTANCE.getEP_5_0_0_9();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_9() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("{", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment EP_5_0_0_10 = INSTANCE.getEP_5_0_0_10();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment getEP_5_0_0_10() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainment(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__ZUTATEN), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.PLUS, new EClass[] {de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat(), }, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_11 = INSTANCE.getEP_5_0_0_11();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_11() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("}", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_5_0_0_12 = INSTANCE.getEP_5_0_0_12();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_5_0_0_12() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("}", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_5_0_0 = INSTANCE.getEP_5_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_5_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_5_0_0_0, EP_5_0_0_1, EP_5_0_0_2, EP_5_0_0_3, EP_5_0_0_4, EP_5_0_0_5, EP_5_0_0_6, EP_5_0_0_7, EP_5_0_0_8, EP_5_0_0_9, EP_5_0_0_10, EP_5_0_0_11, EP_5_0_0_12);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_5_0 = INSTANCE.getEP_5_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_5_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_5_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_5 = INSTANCE.getEP_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), EP_5_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_0 = INSTANCE.getEP_6_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("eplan", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_1 = INSTANCE.getEP_6_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("{", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_2 = INSTANCE.getEP_6_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("person", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_3 = INSTANCE.getEP_6_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_6_0_0_4 = INSTANCE.getEP_6_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_6_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_5 = INSTANCE.getEP_6_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_6 = INSTANCE.getEP_6_0_0_6();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_6() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("gerichte", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_7 = INSTANCE.getEP_6_0_0_7();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_7() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_6_0_0_8 = INSTANCE.getEP_6_0_0_8();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_6_0_0_8() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_9_0_0_0 = INSTANCE.getEP_6_0_0_9_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_9_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_6_0_0_9_0_0_1 = INSTANCE.getEP_6_0_0_9_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_6_0_0_9_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_6_0_0_9_0_0 = INSTANCE.getEP_6_0_0_9_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_6_0_0_9_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_9_0_0_0, EP_6_0_0_9_0_0_1);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_6_0_0_9_0 = INSTANCE.getEP_6_0_0_9_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_6_0_0_9_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_9_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCompound EP_6_0_0_9 = INSTANCE.getEP_6_0_0_9();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCompound getEP_6_0_0_9() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCompound(EP_6_0_0_9_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.STAR);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_10 = INSTANCE.getEP_6_0_0_10();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_10() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_6_0_0_11 = INSTANCE.getEP_6_0_0_11();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_6_0_0_11() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("}", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_6_0_0 = INSTANCE.getEP_6_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_6_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0_0, EP_6_0_0_1, EP_6_0_0_2, EP_6_0_0_3, EP_6_0_0_4, EP_6_0_0_5, EP_6_0_0_6, EP_6_0_0_7, EP_6_0_0_8, EP_6_0_0_9, EP_6_0_0_10, EP_6_0_0_11);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_6_0 = INSTANCE.getEP_6_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_6_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_6_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_6 = INSTANCE.getEP_6();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_6() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getErnaehrungsplan(), EP_6_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_7_0_0_0 = INSTANCE.getEP_7_0_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_7_0_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("zutat", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_7_0_0_1 = INSTANCE.getEP_7_0_0_1();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_7_0_0_1() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword("(", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_7_0_0_2 = INSTANCE.getEP_7_0_0_2();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_7_0_0_2() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__MENGE), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_7_0_0_3 = INSTANCE.getEP_7_0_0_3();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_7_0_0_3() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_7_0_0_4 = INSTANCE.getEP_7_0_0_4();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_7_0_0_4() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_7_0_0_5 = INSTANCE.getEP_7_0_0_5();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_7_0_0_5() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(",", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder EP_7_0_0_6 = INSTANCE.getEP_7_0_0_6();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder getEP_7_0_0_6() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpPlaceholder(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT), "TEXT", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, 0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword EP_7_0_0_7 = INSTANCE.getEP_7_0_0_7();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword getEP_7_0_0_7() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword(")", de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence EP_7_0_0 = INSTANCE.getEP_7_0_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence getEP_7_0_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSequence(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_7_0_0_0, EP_7_0_0_1, EP_7_0_0_2, EP_7_0_0_3, EP_7_0_0_4, EP_7_0_0_5, EP_7_0_0_6, EP_7_0_0_7);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice EP_7_0 = INSTANCE.getEP_7_0();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice getEP_7_0() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpChoice(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE, EP_7_0_0);
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule EP_7 = INSTANCE.getEP_7();
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule getEP_7() {
		return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht2Zutat(), EP_7_0, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpCardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.class.getFields()) {
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
	
	public static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement) de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule[] RULES = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule[] {
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
			for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement element, Set<String> keywords) {
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword) {
			keywords.add(((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpKeyword) element).getValue());
		} else if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal) {
			keywords.add(((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal) element).getTrueLiteral());
			keywords.add(((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal terminal = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
