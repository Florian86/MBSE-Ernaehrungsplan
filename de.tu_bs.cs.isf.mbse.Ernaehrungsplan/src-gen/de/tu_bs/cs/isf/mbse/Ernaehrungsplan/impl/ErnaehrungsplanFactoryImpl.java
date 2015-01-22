/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.impl;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErnaehrungsplanFactoryImpl extends EFactoryImpl implements ErnaehrungsplanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErnaehrungsplanFactory init() {
		try {
			ErnaehrungsplanFactory theErnaehrungsplanFactory = (ErnaehrungsplanFactory)EPackage.Registry.INSTANCE.getEFactory(ErnaehrungsplanPackage.eNS_URI);
			if (theErnaehrungsplanFactory != null) {
				return theErnaehrungsplanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErnaehrungsplanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnaehrungsplanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN: return createErnaehrungsplan();
			case ErnaehrungsplanPackage.PERSON: return createPerson();
			case ErnaehrungsplanPackage.GERICHT: return createGericht();
			case ErnaehrungsplanPackage.HAUPTBESTANDTEIL: return createHauptbestandteil();
			case ErnaehrungsplanPackage.BEILAGE: return createBeilage();
			case ErnaehrungsplanPackage.SAUCE: return createSauce();
			case ErnaehrungsplanPackage.GERICHT2_ZUTAT: return createGericht2Zutat();
			case ErnaehrungsplanPackage.EP_ELEMENT: return createEpElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ernaehrungsplan createErnaehrungsplan() {
		ErnaehrungsplanImpl ernaehrungsplan = new ErnaehrungsplanImpl();
		return ernaehrungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gericht createGericht() {
		GerichtImpl gericht = new GerichtImpl();
		return gericht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hauptbestandteil createHauptbestandteil() {
		HauptbestandteilImpl hauptbestandteil = new HauptbestandteilImpl();
		return hauptbestandteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beilage createBeilage() {
		BeilageImpl beilage = new BeilageImpl();
		return beilage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sauce createSauce() {
		SauceImpl sauce = new SauceImpl();
		return sauce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gericht2Zutat createGericht2Zutat() {
		Gericht2ZutatImpl gericht2Zutat = new Gericht2ZutatImpl();
		return gericht2Zutat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpElement createEpElement() {
		EpElementImpl epElement = new EpElementImpl();
		return epElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnaehrungsplanPackage getErnaehrungsplanPackage() {
		return (ErnaehrungsplanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErnaehrungsplanPackage getPackage() {
		return ErnaehrungsplanPackage.eINSTANCE;
	}

} //ErnaehrungsplanFactoryImpl
