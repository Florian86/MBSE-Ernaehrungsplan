/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ernaehrungsplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getPersonen <em>Personen</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getGerichte <em>Gerichte</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getErnaehrungsplan()
 * @model
 * @generated
 */
public interface Ernaehrungsplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Personen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personen</em>' reference.
	 * @see #setPersonen(Person)
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getErnaehrungsplan_Personen()
	 * @model required="true"
	 * @generated
	 */
	Person getPersonen();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan#getPersonen <em>Personen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personen</em>' reference.
	 * @see #getPersonen()
	 * @generated
	 */
	void setPersonen(Person value);

	/**
	 * Returns the value of the '<em><b>Gerichte</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gerichte</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gerichte</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getErnaehrungsplan_Gerichte()
	 * @model lower="7"
	 * @generated
	 */
	EList<Gericht> getGerichte();

} // Ernaehrungsplan
