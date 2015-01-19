/**
 */
package ep.impl;

import ep.EpElement;
import ep.Ernaehrungsplan;
import ep.Gericht;
import ep.MetamodelPackage;
import ep.Person;
import ep.Zutat;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ep Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ep.impl.EpElementImpl#getEplanElement <em>Eplan Element</em>}</li>
 *   <li>{@link ep.impl.EpElementImpl#getPersonElement <em>Person Element</em>}</li>
 *   <li>{@link ep.impl.EpElementImpl#getZutatElement <em>Zutat Element</em>}</li>
 *   <li>{@link ep.impl.EpElementImpl#getGerichtElement <em>Gericht Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EpElementImpl extends MinimalEObjectImpl.Container implements EpElement {
	/**
	 * The cached value of the '{@link #getEplanElement() <em>Eplan Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEplanElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Ernaehrungsplan> eplanElement;

	/**
	 * The cached value of the '{@link #getPersonElement() <em>Person Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> personElement;

	/**
	 * The cached value of the '{@link #getZutatElement() <em>Zutat Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZutatElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Zutat> zutatElement;

	/**
	 * The cached value of the '{@link #getGerichtElement() <em>Gericht Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGerichtElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Gericht> gerichtElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.EP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ernaehrungsplan> getEplanElement() {
		if (eplanElement == null) {
			eplanElement = new EObjectContainmentEList<Ernaehrungsplan>(Ernaehrungsplan.class, this, MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT);
		}
		return eplanElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersonElement() {
		if (personElement == null) {
			personElement = new EObjectContainmentEList<Person>(Person.class, this, MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT);
		}
		return personElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zutat> getZutatElement() {
		if (zutatElement == null) {
			zutatElement = new EObjectContainmentEList<Zutat>(Zutat.class, this, MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT);
		}
		return zutatElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gericht> getGerichtElement() {
		if (gerichtElement == null) {
			gerichtElement = new EObjectContainmentEList<Gericht>(Gericht.class, this, MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT);
		}
		return gerichtElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT:
				return ((InternalEList<?>)getEplanElement()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT:
				return ((InternalEList<?>)getPersonElement()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT:
				return ((InternalEList<?>)getZutatElement()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT:
				return ((InternalEList<?>)getGerichtElement()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT:
				return getEplanElement();
			case MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT:
				return getPersonElement();
			case MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT:
				return getZutatElement();
			case MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT:
				return getGerichtElement();
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
			case MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT:
				getEplanElement().clear();
				getEplanElement().addAll((Collection<? extends Ernaehrungsplan>)newValue);
				return;
			case MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT:
				getPersonElement().clear();
				getPersonElement().addAll((Collection<? extends Person>)newValue);
				return;
			case MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT:
				getZutatElement().clear();
				getZutatElement().addAll((Collection<? extends Zutat>)newValue);
				return;
			case MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT:
				getGerichtElement().clear();
				getGerichtElement().addAll((Collection<? extends Gericht>)newValue);
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
			case MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT:
				getEplanElement().clear();
				return;
			case MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT:
				getPersonElement().clear();
				return;
			case MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT:
				getZutatElement().clear();
				return;
			case MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT:
				getGerichtElement().clear();
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
			case MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT:
				return eplanElement != null && !eplanElement.isEmpty();
			case MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT:
				return personElement != null && !personElement.isEmpty();
			case MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT:
				return zutatElement != null && !zutatElement.isEmpty();
			case MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT:
				return gerichtElement != null && !gerichtElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EpElementImpl
