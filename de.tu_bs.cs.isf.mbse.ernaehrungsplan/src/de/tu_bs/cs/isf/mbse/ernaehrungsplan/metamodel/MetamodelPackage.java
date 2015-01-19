/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel;

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
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelFactory
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
    String eNAME = "metamodel";

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
    String eNS_PREFIX = "metamodel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MetamodelPackage eINSTANCE = de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl.init();

    /**
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ErnaehrungsplanImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getErnaehrungsplan()
     * @generated
     */
    int ERNAEHRUNGSPLAN = 0;

    /**
     * The feature id for the '<em><b>Personen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERNAEHRUNGSPLAN__PERSONEN = 0;

    /**
     * The feature id for the '<em><b>Gerichte</b></em>' containment reference list.
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.PersonImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getPerson()
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.GerichtImpl <em>Gericht</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.GerichtImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getGericht()
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ZutatImpl <em>Zutat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ZutatImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getZutat()
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.HauptbestandteilImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getHauptbestandteil()
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.BeilageImpl <em>Beilage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.BeilageImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getBeilage()
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.SauceImpl <em>Sauce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.SauceImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getSauce()
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
     * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.Gericht2ZutatImpl <em>Gericht2 Zutat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.Gericht2ZutatImpl
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getGericht2Zutat()
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
     * The feature id for the '<em><b>Zutat</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GERICHT2_ZUTAT__ZUTAT = 1;

    /**
     * The number of structural features of the '<em>Gericht2 Zutat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GERICHT2_ZUTAT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Gericht2 Zutat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GERICHT2_ZUTAT_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan <em>Ernaehrungsplan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ernaehrungsplan</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan
     * @generated
     */
    EClass getErnaehrungsplan();

    /**
     * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan#getPersonen <em>Personen</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Personen</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan#getPersonen()
     * @see #getErnaehrungsplan()
     * @generated
     */
    EReference getErnaehrungsplan_Personen();

    /**
     * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan#getGerichte <em>Gerichte</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Gerichte</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan#getGerichte()
     * @see #getErnaehrungsplan()
     * @generated
     */
    EReference getErnaehrungsplan_Gerichte();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person#getName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Name();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person#getKcal <em>Kcal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kcal</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person#getKcal()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Kcal();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht <em>Gericht</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gericht</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht
     * @generated
     */
    EClass getGericht();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getName()
     * @see #getGericht()
     * @generated
     */
    EAttribute getGericht_Name();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getKommentar <em>Kommentar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kommentar</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getKommentar()
     * @see #getGericht()
     * @generated
     */
    EAttribute getGericht_Kommentar();

    /**
     * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getZutaten <em>Zutaten</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Zutaten</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getZutaten()
     * @see #getGericht()
     * @generated
     */
    EReference getGericht_Zutaten();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#isIstSalat <em>Ist Salat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ist Salat</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#isIstSalat()
     * @see #getGericht()
     * @generated
     */
    EAttribute getGericht_IstSalat();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat <em>Zutat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zutat</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat
     * @generated
     */
    EClass getZutat();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getName()
     * @see #getZutat()
     * @generated
     */
    EAttribute getZutat_Name();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getKcal <em>Kcal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kcal</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getKcal()
     * @see #getZutat()
     * @generated
     */
    EAttribute getZutat_Kcal();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Hauptbestandteil <em>Hauptbestandteil</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hauptbestandteil</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Hauptbestandteil
     * @generated
     */
    EClass getHauptbestandteil();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Beilage <em>Beilage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Beilage</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Beilage
     * @generated
     */
    EClass getBeilage();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Sauce <em>Sauce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sauce</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Sauce
     * @generated
     */
    EClass getSauce();

    /**
     * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat <em>Gericht2 Zutat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gericht2 Zutat</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat
     * @generated
     */
    EClass getGericht2Zutat();

    /**
     * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat#getMenge <em>Menge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Menge</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat#getMenge()
     * @see #getGericht2Zutat()
     * @generated
     */
    EAttribute getGericht2Zutat_Menge();

    /**
     * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat#getZutat <em>Zutat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Zutat</em>'.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat#getZutat()
     * @see #getGericht2Zutat()
     * @generated
     */
    EReference getGericht2Zutat_Zutat();

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
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ErnaehrungsplanImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getErnaehrungsplan()
         * @generated
         */
        EClass ERNAEHRUNGSPLAN = eINSTANCE.getErnaehrungsplan();

        /**
         * The meta object literal for the '<em><b>Personen</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ERNAEHRUNGSPLAN__PERSONEN = eINSTANCE.getErnaehrungsplan_Personen();

        /**
         * The meta object literal for the '<em><b>Gerichte</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ERNAEHRUNGSPLAN__GERICHTE = eINSTANCE.getErnaehrungsplan_Gerichte();

        /**
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.PersonImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getPerson()
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
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.GerichtImpl <em>Gericht</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.GerichtImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getGericht()
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
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ZutatImpl <em>Zutat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ZutatImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getZutat()
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
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.HauptbestandteilImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getHauptbestandteil()
         * @generated
         */
        EClass HAUPTBESTANDTEIL = eINSTANCE.getHauptbestandteil();

        /**
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.BeilageImpl <em>Beilage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.BeilageImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getBeilage()
         * @generated
         */
        EClass BEILAGE = eINSTANCE.getBeilage();

        /**
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.SauceImpl <em>Sauce</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.SauceImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getSauce()
         * @generated
         */
        EClass SAUCE = eINSTANCE.getSauce();

        /**
         * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.Gericht2ZutatImpl <em>Gericht2 Zutat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.Gericht2ZutatImpl
         * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.MetamodelPackageImpl#getGericht2Zutat()
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
         * The meta object literal for the '<em><b>Zutat</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GERICHT2_ZUTAT__ZUTAT = eINSTANCE.getGericht2Zutat_Zutat();

    }

} //MetamodelPackage
