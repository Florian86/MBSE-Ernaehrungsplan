/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.tests;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sauce</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SauceTest extends ZutatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SauceTest.class);
	}

	/**
	 * Constructs a new Sauce test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SauceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sauce test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sauce getFixture() {
		return (Sauce)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErnaehrungsplanFactory.eINSTANCE.createSauce());
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

} //SauceTest
