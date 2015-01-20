/**
 */
package ep;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ep.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ep";

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
	String eNS_PREFIX = "ep";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = ep.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ep.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.ErnaehrungsplanImpl
	 * @see ep.impl.MetamodelPackageImpl#getErnaehrungsplan()
	 * @generated
	 */
	int ERNAEHRUNGSPLAN = 0;

	/**
	 * The feature id for the '<em><b>Personen</b></em>' reference list.
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
	 * The number of operations of the '<em>Ernaehrungsplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ep.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.PersonImpl
	 * @see ep.impl.MetamodelPackageImpl#getPerson()
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
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ep.impl.GerichtImpl <em>Gericht</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.GerichtImpl
	 * @see ep.impl.MetamodelPackageImpl#getGericht()
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
	 * The number of operations of the '<em>Gericht</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ep.impl.ZutatImpl <em>Zutat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.ZutatImpl
	 * @see ep.impl.MetamodelPackageImpl#getZutat()
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
	 * The number of operations of the '<em>Zutat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ep.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.HauptbestandteilImpl
	 * @see ep.impl.MetamodelPackageImpl#getHauptbestandteil()
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
	 * The number of operations of the '<em>Hauptbestandteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ep.impl.BeilageImpl <em>Beilage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.BeilageImpl
	 * @see ep.impl.MetamodelPackageImpl#getBeilage()
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
	 * The number of operations of the '<em>Beilage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ep.impl.SauceImpl <em>Sauce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.SauceImpl
	 * @see ep.impl.MetamodelPackageImpl#getSauce()
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
	 * The number of operations of the '<em>Sauce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUCE_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ep.impl.Gericht2ZutatImpl <em>Gericht2 Zutat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.Gericht2ZutatImpl
	 * @see ep.impl.MetamodelPackageImpl#getGericht2Zutat()
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
	 * The number of operations of the '<em>Gericht2 Zutat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT2_ZUTAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ep.impl.EpElementImpl <em>Ep Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ep.impl.EpElementImpl
	 * @see ep.impl.MetamodelPackageImpl#getEpElement()
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
	 * The number of operations of the '<em>Ep Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ep.Ernaehrungsplan <em>Ernaehrungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ernaehrungsplan</em>'.
	 * @see ep.Ernaehrungsplan
	 * @generated
	 */
	EClass getErnaehrungsplan();

	/**
	 * Returns the meta object for the reference list '{@link ep.Ernaehrungsplan#getPersonen <em>Personen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personen</em>'.
	 * @see ep.Ernaehrungsplan#getPersonen()
	 * @see #getErnaehrungsplan()
	 * @generated
	 */
	EReference getErnaehrungsplan_Personen();

	/**
	 * Returns the meta object for the reference list '{@link ep.Ernaehrungsplan#getGerichte <em>Gerichte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gerichte</em>'.
	 * @see ep.Ernaehrungsplan#getGerichte()
	 * @see #getErnaehrungsplan()
	 * @generated
	 */
	EReference getErnaehrungsplan_Gerichte();

	/**
	 * Returns the meta object for class '{@link ep.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see ep.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link ep.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ep.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link ep.Person#getKcal <em>Kcal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kcal</em>'.
	 * @see ep.Person#getKcal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Kcal();

	/**
	 * Returns the meta object for class '{@link ep.Gericht <em>Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gericht</em>'.
	 * @see ep.Gericht
	 * @generated
	 */
	EClass getGericht();

	/**
	 * Returns the meta object for the attribute '{@link ep.Gericht#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ep.Gericht#getName()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_Name();

	/**
	 * Returns the meta object for the attribute '{@link ep.Gericht#getKommentar <em>Kommentar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommentar</em>'.
	 * @see ep.Gericht#getKommentar()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_Kommentar();

	/**
	 * Returns the meta object for the containment reference list '{@link ep.Gericht#getZutaten <em>Zutaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zutaten</em>'.
	 * @see ep.Gericht#getZutaten()
	 * @see #getGericht()
	 * @generated
	 */
	EReference getGericht_Zutaten();

	/**
	 * Returns the meta object for the attribute '{@link ep.Gericht#isIstSalat <em>Ist Salat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ist Salat</em>'.
	 * @see ep.Gericht#isIstSalat()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_IstSalat();

	/**
	 * Returns the meta object for class '{@link ep.Zutat <em>Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zutat</em>'.
	 * @see ep.Zutat
	 * @generated
	 */
	EClass getZutat();

	/**
	 * Returns the meta object for the attribute '{@link ep.Zutat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ep.Zutat#getName()
	 * @see #getZutat()
	 * @generated
	 */
	EAttribute getZutat_Name();

	/**
	 * Returns the meta object for the attribute '{@link ep.Zutat#getKcal <em>Kcal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kcal</em>'.
	 * @see ep.Zutat#getKcal()
	 * @see #getZutat()
	 * @generated
	 */
	EAttribute getZutat_Kcal();

	/**
	 * Returns the meta object for class '{@link ep.Hauptbestandteil <em>Hauptbestandteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hauptbestandteil</em>'.
	 * @see ep.Hauptbestandteil
	 * @generated
	 */
	EClass getHauptbestandteil();

	/**
	 * Returns the meta object for class '{@link ep.Beilage <em>Beilage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beilage</em>'.
	 * @see ep.Beilage
	 * @generated
	 */
	EClass getBeilage();

	/**
	 * Returns the meta object for class '{@link ep.Sauce <em>Sauce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sauce</em>'.
	 * @see ep.Sauce
	 * @generated
	 */
	EClass getSauce();

	/**
	 * Returns the meta object for class '{@link ep.Gericht2Zutat <em>Gericht2 Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gericht2 Zutat</em>'.
	 * @see ep.Gericht2Zutat
	 * @generated
	 */
	EClass getGericht2Zutat();

	/**
	 * Returns the meta object for the attribute '{@link ep.Gericht2Zutat#getMenge <em>Menge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menge</em>'.
	 * @see ep.Gericht2Zutat#getMenge()
	 * @see #getGericht2Zutat()
	 * @generated
	 */
	EAttribute getGericht2Zutat_Menge();

	/**
	 * Returns the meta object for the reference '{@link ep.Gericht2Zutat#getGericht <em>Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gericht</em>'.
	 * @see ep.Gericht2Zutat#getGericht()
	 * @see #getGericht2Zutat()
	 * @generated
	 */
	EReference getGericht2Zutat_Gericht();

	/**
	 * Returns the meta object for the reference '{@link ep.Gericht2Zutat#getZutat <em>Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zutat</em>'.
	 * @see ep.Gericht2Zutat#getZutat()
	 * @see #getGericht2Zutat()
	 * @generated
	 */
	EReference getGericht2Zutat_Zutat();

	/**
	 * Returns the meta object for class '{@link ep.EpElement <em>Ep Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep Element</em>'.
	 * @see ep.EpElement
	 * @generated
	 */
	EClass getEpElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ep.EpElement#getEplanElement <em>Eplan Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eplan Element</em>'.
	 * @see ep.EpElement#getEplanElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_EplanElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ep.EpElement#getPersonElement <em>Person Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Element</em>'.
	 * @see ep.EpElement#getPersonElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_PersonElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ep.EpElement#getZutatElement <em>Zutat Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zutat Element</em>'.
	 * @see ep.EpElement#getZutatElement()
	 * @see #getEpElement()
	 * @generated
	 */
	EReference getEpElement_ZutatElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ep.EpElement#getGerichtElement <em>Gericht Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gericht Element</em>'.
	 * @see ep.EpElement#getGerichtElement()
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
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ep.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.ErnaehrungsplanImpl
		 * @see ep.impl.MetamodelPackageImpl#getErnaehrungsplan()
		 * @generated
		 */
		EClass ERNAEHRUNGSPLAN = eINSTANCE.getErnaehrungsplan();

		/**
		 * The meta object literal for the '<em><b>Personen</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link ep.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.PersonImpl
		 * @see ep.impl.MetamodelPackageImpl#getPerson()
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
		 * The meta object literal for the '{@link ep.impl.GerichtImpl <em>Gericht</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.GerichtImpl
		 * @see ep.impl.MetamodelPackageImpl#getGericht()
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
		 * The meta object literal for the '{@link ep.impl.ZutatImpl <em>Zutat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.ZutatImpl
		 * @see ep.impl.MetamodelPackageImpl#getZutat()
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
		 * The meta object literal for the '{@link ep.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.HauptbestandteilImpl
		 * @see ep.impl.MetamodelPackageImpl#getHauptbestandteil()
		 * @generated
		 */
		EClass HAUPTBESTANDTEIL = eINSTANCE.getHauptbestandteil();

		/**
		 * The meta object literal for the '{@link ep.impl.BeilageImpl <em>Beilage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.BeilageImpl
		 * @see ep.impl.MetamodelPackageImpl#getBeilage()
		 * @generated
		 */
		EClass BEILAGE = eINSTANCE.getBeilage();

		/**
		 * The meta object literal for the '{@link ep.impl.SauceImpl <em>Sauce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.SauceImpl
		 * @see ep.impl.MetamodelPackageImpl#getSauce()
		 * @generated
		 */
		EClass SAUCE = eINSTANCE.getSauce();

		/**
		 * The meta object literal for the '{@link ep.impl.Gericht2ZutatImpl <em>Gericht2 Zutat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.Gericht2ZutatImpl
		 * @see ep.impl.MetamodelPackageImpl#getGericht2Zutat()
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
		 * The meta object literal for the '{@link ep.impl.EpElementImpl <em>Ep Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ep.impl.EpElementImpl
		 * @see ep.impl.MetamodelPackageImpl#getEpElement()
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

} //MetamodelPackage
