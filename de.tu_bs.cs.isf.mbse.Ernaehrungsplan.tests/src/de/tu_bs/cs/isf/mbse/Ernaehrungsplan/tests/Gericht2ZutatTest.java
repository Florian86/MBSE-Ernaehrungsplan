/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.tests;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gericht2 Zutat</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gericht2ZutatTest extends TestCase {

	/**
	 * The fixture for this Gericht2 Zutat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gericht2Zutat fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Gericht2ZutatTest.class);
	}

	/**
	 * Constructs a new Gericht2 Zutat test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gericht2ZutatTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Gericht2 Zutat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Gericht2Zutat fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Gericht2 Zutat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gericht2Zutat getFixture() {
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
		setFixture(ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat());
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

} //Gericht2ZutatTest
