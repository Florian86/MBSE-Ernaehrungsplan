/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gericht</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getKommentar <em>Kommentar</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getZutaten <em>Zutaten</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#isIstSalat <em>Ist Salat</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getGericht()
 * @model
 * @generated
 */
public interface Gericht extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getGericht_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Kommentar</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kommentar</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kommentar</em>' attribute.
     * @see #setKommentar(String)
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getGericht_Kommentar()
     * @model
     * @generated
     */
    String getKommentar();

    /**
     * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#getKommentar <em>Kommentar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kommentar</em>' attribute.
     * @see #getKommentar()
     * @generated
     */
    void setKommentar(String value);

    /**
     * Returns the value of the '<em><b>Zutaten</b></em>' containment reference list.
     * The list contents are of type {@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht2Zutat}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zutaten</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zutaten</em>' containment reference list.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getGericht_Zutaten()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Gericht2Zutat> getZutaten();

    /**
     * Returns the value of the '<em><b>Ist Salat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ist Salat</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ist Salat</em>' attribute.
     * @see #setIstSalat(boolean)
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getGericht_IstSalat()
     * @model
     * @generated
     */
    boolean isIstSalat();

    /**
     * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht#isIstSalat <em>Ist Salat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ist Salat</em>' attribute.
     * @see #isIstSalat()
     * @generated
     */
    void setIstSalat(boolean value);

} // Gericht
