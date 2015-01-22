/**
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.tests;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ep Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpElementTest extends TestCase {

	/**
	 * The fixture for this Ep Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EpElementTest.class);
	}

	/**
	 * Constructs a new Ep Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ep Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EpElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ep Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpElement getFixture() {
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
		setFixture(ErnaehrungsplanFactory.eINSTANCE.createEpElement());
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

} //EpElementTest
