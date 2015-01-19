/**
 */
package ep;

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
 *   <li>{@link ep.EpElement#getEplanElement <em>Eplan Element</em>}</li>
 *   <li>{@link ep.EpElement#getPersonElement <em>Person Element</em>}</li>
 *   <li>{@link ep.EpElement#getZutatElement <em>Zutat Element</em>}</li>
 *   <li>{@link ep.EpElement#getGerichtElement <em>Gericht Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ep.MetamodelPackage#getEpElement()
 * @model
 * @generated
 */
public interface EpElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Eplan Element</b></em>' containment reference list.
	 * The list contents are of type {@link ep.Ernaehrungsplan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eplan Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eplan Element</em>' containment reference list.
	 * @see ep.MetamodelPackage#getEpElement_EplanElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ernaehrungsplan> getEplanElement();

	/**
	 * Returns the value of the '<em><b>Person Element</b></em>' containment reference list.
	 * The list contents are of type {@link ep.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Element</em>' containment reference list.
	 * @see ep.MetamodelPackage#getEpElement_PersonElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getPersonElement();

	/**
	 * Returns the value of the '<em><b>Zutat Element</b></em>' containment reference list.
	 * The list contents are of type {@link ep.Zutat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zutat Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zutat Element</em>' containment reference list.
	 * @see ep.MetamodelPackage#getEpElement_ZutatElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Zutat> getZutatElement();

	/**
	 * Returns the value of the '<em><b>Gericht Element</b></em>' containment reference list.
	 * The list contents are of type {@link ep.Gericht}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gericht Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gericht Element</em>' containment reference list.
	 * @see ep.MetamodelPackage#getEpElement_GerichtElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Gericht> getGerichtElement();

} // EpElement
