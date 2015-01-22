/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory
 * @model kind="package"
 * @generated
 */
public interface ErnaehrungsplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ernaehrungsplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/Ernaehrungsplan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ernaehrungsplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErnaehrungsplanPackage eINSTANCE = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.NamedElementImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.TypeImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.DataTypeImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ABSTRACT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityModelImpl <em>Entity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityModelImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getEntityModel()
	 * @generated
	 */
	int ENTITY_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Entity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.FeatureImpl
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind <em>Feature Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getFeatureKind()
	 * @generated
	 */
	int FEATURE_KIND = 6;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity#isAbstract()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity#getFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Features();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Model</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel
	 * @generated
	 */
	EClass getEntityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel#getTypes()
	 * @see #getEntityModel()
	 * @generated
	 */
	EReference getEntityModel_Types();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature#getKind()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Kind();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Type();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind <em>Feature Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Kind</em>'.
	 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind
	 * @generated
	 */
	EEnum getFeatureKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErnaehrungsplanFactory getErnaehrungsplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.NamedElementImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.TypeImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.DataTypeImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ABSTRACT = eINSTANCE.getEntity_Abstract();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityModelImpl <em>Entity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.EntityModelImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getEntityModel()
		 * @generated
		 */
		EClass ENTITY_MODEL = eINSTANCE.getEntityModel();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MODEL__TYPES = eINSTANCE.getEntityModel_Types();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.FeatureImpl
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__KIND = eINSTANCE.getFeature_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind <em>Feature Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind
		 * @see de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getFeatureKind()
		 * @generated
		 */
		EEnum FEATURE_KIND = eINSTANCE.getFeatureKind();

	}

} //ErnaehrungsplanPackage
