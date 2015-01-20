/**
 */
package ep.tests;

import ep.Ernaehrungsplan;
import ep.MetamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ernaehrungsplan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErnaehrungsplanTest extends TestCase {

	/**
	 * The fixture for this Ernaehrungsplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ernaehrungsplan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ErnaehrungsplanTest.class);
	}

	/**
	 * Constructs a new Ernaehrungsplan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnaehrungsplanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ernaehrungsplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ernaehrungsplan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ernaehrungsplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ernaehrungsplan getFixture() {
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
		setFixture(MetamodelFactory.eINSTANCE.createErnaehrungsplan());
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

} //ErnaehrungsplanTest
