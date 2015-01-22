/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ernaehrungsplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanImpl#getPersonen <em>Personen</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanImpl#getGerichte <em>Gerichte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErnaehrungsplanImpl extends EObjectImpl implements Ernaehrungsplan {
	/**
	 * The cached value of the '{@link #getPersonen() <em>Personen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonen()
	 * @generated
	 * @ordered
	 */
	protected Person personen;

	/**
	 * The cached value of the '{@link #getGerichte() <em>Gerichte</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGerichte()
	 * @generated
	 * @ordered
	 */
	protected EList<Gericht> gerichte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErnaehrungsplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErnaehrungsplanPackage.Literals.ERNAEHRUNGSPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPersonen() {
		if (personen != null && personen.eIsProxy()) {
			InternalEObject oldPersonen = (InternalEObject)personen;
			personen = (Person)eResolveProxy(oldPersonen);
			if (personen != oldPersonen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN, oldPersonen, personen));
			}
		}
		return personen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPersonen() {
		return personen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonen(Person newPersonen) {
		Person oldPersonen = personen;
		personen = newPersonen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN, oldPersonen, personen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gericht> getGerichte() {
		if (gerichte == null) {
			gerichte = new EObjectResolvingEList<Gericht>(Gericht.class, this, ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE);
		}
		return gerichte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN:
				if (resolve) return getPersonen();
				return basicGetPersonen();
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE:
				return getGerichte();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN:
				setPersonen((Person)newValue);
				return;
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE:
				getGerichte().clear();
				getGerichte().addAll((Collection<? extends Gericht>)newValue);
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN:
				setPersonen((Person)null);
				return;
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE:
				getGerichte().clear();
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN:
				return personen != null;
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE:
				return gerichte != null && !gerichte.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErnaehrungsplanImpl
