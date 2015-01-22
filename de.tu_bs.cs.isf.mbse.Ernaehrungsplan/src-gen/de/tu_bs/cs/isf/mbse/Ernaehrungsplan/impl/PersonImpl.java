/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.PersonImpl#getKcal <em>Kcal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
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
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErnaehrungsplanPackage.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErnaehrungsplanPackage.PERSON__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErnaehrungsplanPackage.PERSON__KCAL, oldKcal, kcal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErnaehrungsplanPackage.PERSON__NAME:
				return getName();
			case ErnaehrungsplanPackage.PERSON__KCAL:
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
			case ErnaehrungsplanPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ErnaehrungsplanPackage.PERSON__KCAL:
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
			case ErnaehrungsplanPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ErnaehrungsplanPackage.PERSON__KCAL:
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
			case ErnaehrungsplanPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ErnaehrungsplanPackage.PERSON__KCAL:
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

} //PersonImpl
