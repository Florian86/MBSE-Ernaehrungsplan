/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.tests;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hauptbestandteil</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HauptbestandteilTest extends ZutatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HauptbestandteilTest.class);
	}

	/**
	 * Constructs a new Hauptbestandteil test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HauptbestandteilTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hauptbestandteil test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hauptbestandteil getFixture() {
		return (Hauptbestandteil)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HauptbestandteilTest
