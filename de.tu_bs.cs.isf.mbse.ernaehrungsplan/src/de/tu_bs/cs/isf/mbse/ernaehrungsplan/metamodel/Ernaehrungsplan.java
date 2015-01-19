/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel;

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
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan#getPersonen <em>Personen</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan#getGerichte <em>Gerichte</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getErnaehrungsplan()
 * @model
 * @generated
 */
public interface Ernaehrungsplan extends EObject {
    /**
     * Returns the value of the '<em><b>Personen</b></em>' containment reference list.
     * The list contents are of type {@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Personen</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Personen</em>' containment reference list.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getErnaehrungsplan_Personen()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Person> getPersonen();

    /**
     * Returns the value of the '<em><b>Gerichte</b></em>' containment reference list.
     * The list contents are of type {@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Gericht}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gerichte</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gerichte</em>' containment reference list.
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getErnaehrungsplan_Gerichte()
     * @model containment="true"
     * @generated
     */
    EList<Gericht> getGerichte();

} // Ernaehrungsplan
