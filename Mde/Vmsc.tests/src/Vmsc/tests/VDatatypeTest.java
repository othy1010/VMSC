/**
 */
package Vmsc.tests;

import Vmsc.VDatatype;
import Vmsc.VmscFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VDatatype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VDatatypeTest extends VStructuralComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VDatatypeTest.class);
	}

	/**
	 * Constructs a new VDatatype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDatatypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VDatatype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VDatatype getFixture() {
		return (VDatatype)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmscFactory.eINSTANCE.createVDatatype());
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

} //VDatatypeTest
