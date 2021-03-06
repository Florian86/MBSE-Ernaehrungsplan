/**
 */
package ep.impl;

import ep.Ernaehrungsplan;
import ep.Gericht;
import ep.MetamodelPackage;
import ep.Person;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ernaehrungsplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ep.impl.ErnaehrungsplanImpl#getPersonen <em>Personen</em>}</li>
 *   <li>{@link ep.impl.ErnaehrungsplanImpl#getGerichte <em>Gerichte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErnaehrungsplanImpl extends MinimalEObjectImpl.Container implements Ernaehrungsplan {
	/**
	 * The cached value of the '{@link #getPersonen() <em>Personen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonen()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> personen;

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
		return MetamodelPackage.Literals.ERNAEHRUNGSPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersonen() {
		if (personen == null) {
			personen = new EObjectResolvingEList<Person>(Person.class, this, MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN);
		}
		return personen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gericht> getGerichte() {
		if (gerichte == null) {
			gerichte = new EObjectResolvingEList<Gericht>(Gericht.class, this, MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE);
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
			case MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN:
				return getPersonen();
			case MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE:
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
			case MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN:
				getPersonen().clear();
				getPersonen().addAll((Collection<? extends Person>)newValue);
				return;
			case MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE:
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
			case MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN:
				getPersonen().clear();
				return;
			case MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE:
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
			case MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN:
				return personen != null && !personen.isEmpty();
			case MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE:
				return gerichte != null && !gerichte.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErnaehrungsplanImpl
