/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zutat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ZutatImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.ZutatImpl#getKcal <em>Kcal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ZutatImpl extends MinimalEObjectImpl.Container implements Zutat {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getKcal() <em>Kcal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcal()
     * @generated
     * @ordered
     */
    protected static final int KCAL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKcal() <em>Kcal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcal()
     * @generated
     * @ordered
     */
    protected int kcal = KCAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ZutatImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetamodelPackage.Literals.ZUTAT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ZUTAT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getKcal() {
        return kcal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKcal(int newKcal) {
        int oldKcal = kcal;
        kcal = newKcal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ZUTAT__KCAL, oldKcal, kcal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MetamodelPackage.ZUTAT__NAME:
                return getName();
            case MetamodelPackage.ZUTAT__KCAL:
                return getKcal();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MetamodelPackage.ZUTAT__NAME:
                setName((String)newValue);
                return;
            case MetamodelPackage.ZUTAT__KCAL:
                setKcal((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MetamodelPackage.ZUTAT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case MetamodelPackage.ZUTAT__KCAL:
                setKcal(KCAL_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MetamodelPackage.ZUTAT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case MetamodelPackage.ZUTAT__KCAL:
                return kcal != KCAL_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", kcal: ");
        result.append(kcal);
        result.append(')');
        return result.toString();
    }

} //ZutatImpl
