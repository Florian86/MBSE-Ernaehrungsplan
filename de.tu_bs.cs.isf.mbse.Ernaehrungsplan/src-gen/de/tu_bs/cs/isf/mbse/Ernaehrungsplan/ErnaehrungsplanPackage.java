/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory
 * @model kind="package"
 * @generated
 */
public interface ErnaehrungsplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ernaehrungsplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ernaehrungsplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErnaehrungsplanPackage eINSTANCE = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getErnaehrungsplan()
	 * @generated
	 */
	int ERNAEHRUNGSPLAN = 0;

	/**
	 * The feature id for the '<em><b>Personen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN__PERSONEN = 0;

	/**
	 * The feature id for the '<em><b>Gerichte</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN__GERICHTE = 1;

	/**
	 * The number of structural features of the '<em>Ernaehrungsplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.PersonImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KCAL = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.GerichtImpl <em>Gericht</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.GerichtImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getGericht()
	 * @generated
	 */
	int GERICHT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kommentar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__KOMMENTAR = 1;

	/**
	 * The feature id for the '<em><b>Zutaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__ZUTATEN = 2;

	/**
	 * The feature id for the '<em><b>Ist Salat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__IST_SALAT = 3;

	/**
	 * The number of structural features of the '<em>Gericht</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ZutatImpl <em>Zutat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ZutatImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getZutat()
	 * @generated
	 */
	int ZUTAT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT__KCAL = 1;

	/**
	 * The number of structural features of the '<em>Zutat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.HauptbestandteilImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getHauptbestandteil()
	 * @generated
	 */
	int HAUPTBESTANDTEIL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Hauptbestandteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.BeilageImpl <em>Beilage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.BeilageImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getBeilage()
	 * @generated
	 */
	int BEILAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Beilage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.SauceImpl <em>Sauce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.SauceImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getSauce()
	 * @generated
	 */
	int SAUCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Sauce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.Gericht2ZutatImpl <em>Gericht2 Zutat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.Gericht2ZutatImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getGericht2Zutat()
	 * @generated
	 */
	int GERICHT2_ZUTAT = 7;

	/**
	 * The feature id for the '<em><b>Menge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT2_ZUTAT__MENGE = 0;

	/**
	 * The feature id for the '<em><b>Gericht</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT2_ZUTAT__GERICHT = 1;

	/**
	 * The feature id for the '<em><b>Zutat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT2_ZUTAT__ZUTAT = 2;

	/**
	 * The number of structural features of the '<em>Gericht2 Zutat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT2_ZUTAT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EpElementImpl <em>Ep Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EpElementImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getEpElement()
	 * @generated
	 */
	int EP_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Eplan Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__EPLAN_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Person Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__PERSON_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Zutat Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__ZUTAT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Gericht Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT__GERICHT_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Ep Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan <em>Ernaehrungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ernaehrungsplan</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan
	 * @generated
	 */
	EClass getErnaehrungsplan();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getPersonen <em>Personen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personen</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getPersonen()
	 * @see #getErnaehrungsplan()
	 * @generated
	 */
	EReference getErnaehrungsplan_Personen();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getGerichte <em>Gerichte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gerichte</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getGerichte()
	 * @see #getErnaehrungsplan()
	 * @generated
	 */
	EReference getErnaehrungsplan_Gerichte();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person#getKcal <em>Kcal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kcal</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person#getKcal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Kcal();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht <em>Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gericht</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht
	 * @generated
	 */
	EClass getGericht();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#getName()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#getKommentar <em>Kommentar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommentar</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#getKommentar()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_Kommentar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#getZutaten <em>Zutaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zutaten</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#getZutaten()
	 * @see #getGericht()
	 * @generated
	 */
	EReference getGericht_Zutaten();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#isIstSalat <em>Ist Salat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ist Salat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht#isIstSalat()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_IstSalat();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat <em>Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zutat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat
	 * @generated
	 */
	EClass getZutat();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat#getName()
	 * @see #getZutat()
	 * @generated
	 */
	EAttribute getZutat_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat#getKcal <em>Kcal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kcal</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat#getKcal()
	 * @see #getZutat()
	 * @generated
	 */
	EAttribute getZutat_Kcal();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil <em>Hauptbestandteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hauptbestandteil</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil
	 * @generated
	 */
	EClass getHauptbestandteil();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage <em>Beilage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beilage</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage
	 * @generated
	 */
	EClass getBeilage();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce <em>Sauce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sauce</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce
	 * @generated
	 */
	EClass getSauce();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat <em>Gericht2 Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gericht2 Zutat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat
	 * @generated
	 */
	EClass getGericht2Zutat();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getMenge <em>Menge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menge</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getMenge()
	 * @see #getGericht2Zutat()
	 * @generated
	 */
	EAttribute getGericht2Zutat_Menge();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getGericht <em>Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gericht</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getGericht()
	 * @see #getGericht2Zutat()
	 * @generated
	 */
	EReference getGericht2Zutat_Gericht();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getZutat <em>Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zutat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getZutat()
	 * @see #getGericht2Zutat()
	 * @generated
	 */
	EReference getGericht2Zutat_Zutat();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement <em>Ep Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement
	 * @generated
	 */
	EClass getEpElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getEplanElement <em>Eplan Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eplan Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getEplanElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_EplanElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getPersonElement <em>Person Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getPersonElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_PersonElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getZutatElement <em>Zutat Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zutat Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getZutatElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_ZutatElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getGerichtElement <em>Gericht Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gericht Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getGerichtElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_GerichtElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErnaehrungsplanFactory getErnaehrungsplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getErnaehrungsplan()
		 * @generated
		 */
		EClass ERNAEHRUNGSPLAN = eINSTANCE.getErnaehrungsplan();

		/**
		 * The meta object literal for the '<em><b>Personen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERNAEHRUNGSPLAN__PERSONEN = eINSTANCE.getErnaehrungsplan_Personen();

		/**
		 * The meta object literal for the '<em><b>Gerichte</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERNAEHRUNGSPLAN__GERICHTE = eINSTANCE.getErnaehrungsplan_Gerichte();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.PersonImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Kcal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__KCAL = eINSTANCE.getPerson_Kcal();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.GerichtImpl <em>Gericht</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.GerichtImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getGericht()
		 * @generated
		 */
		EClass GERICHT = eINSTANCE.getGericht();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GERICHT__NAME = eINSTANCE.getGericht_Name();

		/**
		 * The meta object literal for the '<em><b>Kommentar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GERICHT__KOMMENTAR = eINSTANCE.getGericht_Kommentar();

		/**
		 * The meta object literal for the '<em><b>Zutaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GERICHT__ZUTATEN = eINSTANCE.getGericht_Zutaten();

		/**
		 * The meta object literal for the '<em><b>Ist Salat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GERICHT__IST_SALAT = eINSTANCE.getGericht_IstSalat();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ZutatImpl <em>Zutat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ZutatImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getZutat()
		 * @generated
		 */
		EClass ZUTAT = eINSTANCE.getZutat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUTAT__NAME = eINSTANCE.getZutat_Name();

		/**
		 * The meta object literal for the '<em><b>Kcal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUTAT__KCAL = eINSTANCE.getZutat_Kcal();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.HauptbestandteilImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getHauptbestandteil()
		 * @generated
		 */
		EClass HAUPTBESTANDTEIL = eINSTANCE.getHauptbestandteil();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.BeilageImpl <em>Beilage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.BeilageImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getBeilage()
		 * @generated
		 */
		EClass BEILAGE = eINSTANCE.getBeilage();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.SauceImpl <em>Sauce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.SauceImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getSauce()
		 * @generated
		 */
		EClass SAUCE = eINSTANCE.getSauce();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.Gericht2ZutatImpl <em>Gericht2 Zutat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.Gericht2ZutatImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getGericht2Zutat()
		 * @generated
		 */
		EClass GERICHT2_ZUTAT = eINSTANCE.getGericht2Zutat();

		/**
		 * The meta object literal for the '<em><b>Menge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GERICHT2_ZUTAT__MENGE = eINSTANCE.getGericht2Zutat_Menge();

		/**
		 * The meta object literal for the '<em><b>Gericht</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GERICHT2_ZUTAT__GERICHT = eINSTANCE.getGericht2Zutat_Gericht();

		/**
		 * The meta object literal for the '<em><b>Zutat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GERICHT2_ZUTAT__ZUTAT = eINSTANCE.getGericht2Zutat_Zutat();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EpElementImpl <em>Ep Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EpElementImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getEpElement()
		 * @generated
		 */
		EClass EP_ELEMENT = eINSTANCE.getEpElement();

		/**
		 * The meta object literal for the '<em><b>Eplan Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__EPLAN_ELEMENT = eINSTANCE.getEpElement_EplanElement();

		/**
		 * The meta object literal for the '<em><b>Person Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__PERSON_ELEMENT = eINSTANCE.getEpElement_PersonElement();

		/**
		 * The meta object literal for the '<em><b>Zutat Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__ZUTAT_ELEMENT = eINSTANCE.getEpElement_ZutatElement();

		/**
		 * The meta object literal for the '<em><b>Gericht Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_ELEMENT__GERICHT_ELEMENT = eINSTANCE.getEpElement_GerichtElement();

	}

} //ErnaehrungsplanPackage
