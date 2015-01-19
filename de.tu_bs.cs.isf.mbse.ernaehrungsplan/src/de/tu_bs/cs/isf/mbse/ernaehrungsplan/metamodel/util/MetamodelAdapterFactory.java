/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.util;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MetamodelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetamodelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MetamodelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MetamodelSwitch<Adapter> modelSwitch =
        new MetamodelSwitch<Adapter>() {
            @Override
            public Adapter caseErnaehrungsplan(Ernaehrungsplan object) {
                return createErnaehrungsplanAdapter();
            }
            @Override
            public Adapter casePerson(Person object) {
                return createPersonAdapter();
            }
            @Override
            public Adapter caseGericht(Gericht object) {
                return createGerichtAdapter();
            }
            @Override
            public Adapter caseZutat(Zutat object) {
                return createZutatAdapter();
            }
            @Override
            public Adapter caseHauptbestandteil(Hauptbestandteil object) {
                return createHauptbestandteilAdapter();
            }
            @Override
            public Adapter caseBeilage(Beilage object) {
                return createBeilageAdapter();
            }
            @Override
            public Adapter caseSauce(Sauce object) {
                return createSauceAdapter();
            }
            @Override
            public Adapter caseGericht2Zutat(Gericht2Zutat object) {
                return createGericht2ZutatAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan <em>Ernaehrungsplan</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan
     * @generated
     */
    public Adapter createErnaehrungsplanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person
     * @generated
     */
    public Adapter createPersonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht <em>Gericht</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht
     * @generated
     */
    public Adapter createGerichtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat <em>Zutat</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat
     * @generated
     */
    public Adapter createZutatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Hauptbestandteil <em>Hauptbestandteil</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Hauptbestandteil
     * @generated
     */
    public Adapter createHauptbestandteilAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Beilage <em>Beilage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Beilage
     * @generated
     */
    public Adapter createBeilageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Sauce <em>Sauce</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Sauce
     * @generated
     */
    public Adapter createSauceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat <em>Gericht2 Zutat</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat
     * @generated
     */
    public Adapter createGericht2ZutatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //MetamodelAdapterFactory
