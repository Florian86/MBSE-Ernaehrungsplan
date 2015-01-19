/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Beilage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Hauptbestandteil;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelFactory;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Sauce;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelPackageImpl extends EPackageImpl implements MetamodelPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ernaehrungsplanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gerichtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass zutatEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hauptbestandteilEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass beilageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sauceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gericht2ZutatEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MetamodelPackageImpl() {
        super(eNS_URI, MetamodelFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link MetamodelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MetamodelPackage init() {
        if (isInited) return (MetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);

        // Obtain or create and register package
        MetamodelPackageImpl theMetamodelPackage = (MetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetamodelPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theMetamodelPackage.createPackageContents();

        // Initialize created meta-data
        theMetamodelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMetamodelPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MetamodelPackage.eNS_URI, theMetamodelPackage);
        return theMetamodelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getErnaehrungsplan() {
        return ernaehrungsplanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getErnaehrungsplan_Personen() {
        return (EReference)ernaehrungsplanEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getErnaehrungsplan_Gerichte() {
        return (EReference)ernaehrungsplanEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerson() {
        return personEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Name() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Kcal() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGericht() {
        return gerichtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGericht_Name() {
        return (EAttribute)gerichtEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGericht_Kommentar() {
        return (EAttribute)gerichtEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGericht_Zutaten() {
        return (EReference)gerichtEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGericht_IstSalat() {
        return (EAttribute)gerichtEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getZutat() {
        return zutatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getZutat_Name() {
        return (EAttribute)zutatEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getZutat_Kcal() {
        return (EAttribute)zutatEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHauptbestandteil() {
        return hauptbestandteilEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBeilage() {
        return beilageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSauce() {
        return sauceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGericht2Zutat() {
        return gericht2ZutatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGericht2Zutat_Menge() {
        return (EAttribute)gericht2ZutatEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGericht2Zutat_Zutat() {
        return (EReference)gericht2ZutatEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetamodelFactory getMetamodelFactory() {
        return (MetamodelFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        ernaehrungsplanEClass = createEClass(ERNAEHRUNGSPLAN);
        createEReference(ernaehrungsplanEClass, ERNAEHRUNGSPLAN__PERSONEN);
        createEReference(ernaehrungsplanEClass, ERNAEHRUNGSPLAN__GERICHTE);

        personEClass = createEClass(PERSON);
        createEAttribute(personEClass, PERSON__NAME);
        createEAttribute(personEClass, PERSON__KCAL);

        gerichtEClass = createEClass(GERICHT);
        createEAttribute(gerichtEClass, GERICHT__NAME);
        createEAttribute(gerichtEClass, GERICHT__KOMMENTAR);
        createEReference(gerichtEClass, GERICHT__ZUTATEN);
        createEAttribute(gerichtEClass, GERICHT__IST_SALAT);

        zutatEClass = createEClass(ZUTAT);
        createEAttribute(zutatEClass, ZUTAT__NAME);
        createEAttribute(zutatEClass, ZUTAT__KCAL);

        hauptbestandteilEClass = createEClass(HAUPTBESTANDTEIL);

        beilageEClass = createEClass(BEILAGE);

        sauceEClass = createEClass(SAUCE);

        gericht2ZutatEClass = createEClass(GERICHT2_ZUTAT);
        createEAttribute(gericht2ZutatEClass, GERICHT2_ZUTAT__MENGE);
        createEReference(gericht2ZutatEClass, GERICHT2_ZUTAT__ZUTAT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        hauptbestandteilEClass.getESuperTypes().add(this.getZutat());
        beilageEClass.getESuperTypes().add(this.getZutat());
        sauceEClass.getESuperTypes().add(this.getZutat());

        // Initialize classes, features, and operations; add parameters
        initEClass(ernaehrungsplanEClass, Ernaehrungsplan.class, "Ernaehrungsplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getErnaehrungsplan_Personen(), this.getPerson(), null, "personen", null, 1, -1, Ernaehrungsplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getErnaehrungsplan_Gerichte(), this.getGericht(), null, "gerichte", null, 0, -1, Ernaehrungsplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Kcal(), ecorePackage.getEInt(), "kcal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gerichtEClass, Gericht.class, "Gericht", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGericht_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGericht_Kommentar(), ecorePackage.getEString(), "kommentar", null, 0, 1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGericht_Zutaten(), this.getGericht2Zutat(), null, "zutaten", null, 1, -1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGericht_IstSalat(), ecorePackage.getEBoolean(), "istSalat", null, 0, 1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(zutatEClass, Zutat.class, "Zutat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getZutat_Name(), ecorePackage.getEString(), "name", null, 0, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getZutat_Kcal(), ecorePackage.getEInt(), "kcal", null, 0, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hauptbestandteilEClass, Hauptbestandteil.class, "Hauptbestandteil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(beilageEClass, Beilage.class, "Beilage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sauceEClass, Sauce.class, "Sauce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gericht2ZutatEClass, Gericht2Zutat.class, "Gericht2Zutat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGericht2Zutat_Menge(), ecorePackage.getEInt(), "menge", null, 0, 1, Gericht2Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGericht2Zutat_Zutat(), this.getZutat(), null, "zutat", null, 1, 1, Gericht2Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //MetamodelPackageImpl
