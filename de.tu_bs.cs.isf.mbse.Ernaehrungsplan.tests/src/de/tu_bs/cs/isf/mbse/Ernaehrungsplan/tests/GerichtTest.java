/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.tests;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gericht</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GerichtTest extends TestCase {

	/**
	 * The fixture for this Gericht test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gericht fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GerichtTest.class);
	}

	/**
	 * Constructs a new Gericht test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GerichtTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Gericht test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Gericht fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Gericht test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gericht getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErnaehrungsplanFactory.eINSTANCE.createGericht());
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

} //GerichtTest
