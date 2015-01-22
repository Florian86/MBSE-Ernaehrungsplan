/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ep Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getEplanElement <em>Eplan Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getPersonElement <em>Person Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getZutatElement <em>Zutat Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement#getGerichtElement <em>Gericht Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getEpElement()
 * @model
 * @generated
 */
public interface EpElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Eplan Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eplan Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eplan Element</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getEpElement_EplanElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ernaehrungsplan> getEplanElement();

	/**
	 * Returns the value of the '<em><b>Person Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Element</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getEpElement_PersonElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getPersonElement();

	/**
	 * Returns the value of the '<em><b>Zutat Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zutat Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zutat Element</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getEpElement_ZutatElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Zutat> getZutatElement();

	/**
	 * Returns the value of the '<em><b>Gericht Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gericht Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gericht Element</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getEpElement_GerichtElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Gericht> getGerichtElement();

} // EpElement
