/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gericht2 Zutat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getMenge <em>Menge</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getGericht <em>Gericht</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getZutat <em>Zutat</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getGericht2Zutat()
 * @model
 * @generated
 */
public interface Gericht2Zutat extends EObject {
	/**
	 * Returns the value of the '<em><b>Menge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menge</em>' attribute.
	 * @see #setMenge(int)
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getGericht2Zutat_Menge()
	 * @model required="true"
	 * @generated
	 */
	int getMenge();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getMenge <em>Menge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menge</em>' attribute.
	 * @see #getMenge()
	 * @generated
	 */
	void setMenge(int value);

	/**
	 * Returns the value of the '<em><b>Gericht</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gericht</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gericht</em>' reference.
	 * @see #setGericht(Gericht)
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getGericht2Zutat_Gericht()
	 * @model required="true"
	 * @generated
	 */
	Gericht getGericht();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getGericht <em>Gericht</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gericht</em>' reference.
	 * @see #getGericht()
	 * @generated
	 */
	void setGericht(Gericht value);

	/**
	 * Returns the value of the '<em><b>Zutat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zutat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zutat</em>' reference.
	 * @see #setZutat(Zutat)
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage#getGericht2Zutat_Zutat()
	 * @model required="true"
	 * @generated
	 */
	Zutat getZutat();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat#getZutat <em>Zutat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutat</em>' reference.
	 * @see #getZutat()
	 * @generated
	 */
	void setZutat(Zutat value);

} // Gericht2Zutat
