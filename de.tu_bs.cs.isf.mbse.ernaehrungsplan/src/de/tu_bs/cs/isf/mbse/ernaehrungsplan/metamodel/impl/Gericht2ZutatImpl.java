/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gericht2 Zutat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.Gericht2ZutatImpl#getMenge <em>Menge</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.impl.Gericht2ZutatImpl#getZutat <em>Zutat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Gericht2ZutatImpl extends MinimalEObjectImpl.Container implements Gericht2Zutat {
    /**
     * The default value of the '{@link #getMenge() <em>Menge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMenge()
     * @generated
     * @ordered
     */
    protected static final int MENGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMenge() <em>Menge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMenge()
     * @generated
     * @ordered
     */
    protected int menge = MENGE_EDEFAULT;

    /**
     * The cached value of the '{@link #getZutat() <em>Zutat</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZutat()
     * @generated
     * @ordered
     */
    protected Zutat zutat;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Gericht2ZutatImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetamodelPackage.Literals.GERICHT2_ZUTAT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMenge() {
        return menge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMenge(int newMenge) {
        int oldMenge = menge;
        menge = newMenge;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.GERICHT2_ZUTAT__MENGE, oldMenge, menge));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Zutat getZutat() {
        return zutat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetZutat(Zutat newZutat, NotificationChain msgs) {
        Zutat oldZutat = zutat;
        zutat = newZutat;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.GERICHT2_ZUTAT__ZUTAT, oldZutat, newZutat);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setZutat(Zutat newZutat) {
        if (newZutat != zutat) {
            NotificationChain msgs = null;
            if (zutat != null)
                msgs = ((InternalEObject)zutat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.GERICHT2_ZUTAT__ZUTAT, null, msgs);
            if (newZutat != null)
                msgs = ((InternalEObject)newZutat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.GERICHT2_ZUTAT__ZUTAT, null, msgs);
            msgs = basicSetZutat(newZutat, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.GERICHT2_ZUTAT__ZUTAT, newZutat, newZutat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MetamodelPackage.GERICHT2_ZUTAT__ZUTAT:
                return basicSetZutat(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MetamodelPackage.GERICHT2_ZUTAT__MENGE:
                return getMenge();
            case MetamodelPackage.GERICHT2_ZUTAT__ZUTAT:
                return getZutat();
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
            case MetamodelPackage.GERICHT2_ZUTAT__MENGE:
                setMenge((Integer)newValue);
                return;
            case MetamodelPackage.GERICHT2_ZUTAT__ZUTAT:
                setZutat((Zutat)newValue);
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
            case MetamodelPackage.GERICHT2_ZUTAT__MENGE:
                setMenge(MENGE_EDEFAULT);
                return;
            case MetamodelPackage.GERICHT2_ZUTAT__ZUTAT:
                setZutat((Zutat)null);
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
            case MetamodelPackage.GERICHT2_ZUTAT__MENGE:
                return menge != MENGE_EDEFAULT;
            case MetamodelPackage.GERICHT2_ZUTAT__ZUTAT:
                return zutat != null;
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
        result.append(" (menge: ");
        result.append(menge);
        result.append(')');
        return result.toString();
    }

} //Gericht2ZutatImpl
