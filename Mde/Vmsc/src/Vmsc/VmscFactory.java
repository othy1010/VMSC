/**
 */
package Vmsc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Vmsc.VmscPackage
 * @generated
 */
public interface VmscFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmscFactory eINSTANCE = Vmsc.impl.VmscFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VEnum</em>'.
	 * @generated
	 */
	VEnum createVEnum();

	/**
	 * Returns a new object of class '<em>VDatatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDatatype</em>'.
	 * @generated
	 */
	VDatatype createVDatatype();

	/**
	 * Returns a new object of class '<em>VPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPackage</em>'.
	 * @generated
	 */
	VPackage createVPackage();

	/**
	 * Returns a new object of class '<em>VClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VClass</em>'.
	 * @generated
	 */
	VClass createVClass();

	/**
	 * Returns a new object of class '<em>VAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAttribute</em>'.
	 * @generated
	 */
	VAttribute createVAttribute();

	/**
	 * Returns a new object of class '<em>VReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VReference</em>'.
	 * @generated
	 */
	VReference createVReference();

	/**
	 * Returns a new object of class '<em>VString</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VString</em>'.
	 * @generated
	 */
	VString createVString();

	/**
	 * Returns a new object of class '<em>VInt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VInt</em>'.
	 * @generated
	 */
	VInt createVInt();

	/**
	 * Returns a new object of class '<em>VFloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VFloat</em>'.
	 * @generated
	 */
	VFloat createVFloat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmscPackage getVmscPackage();

} //VmscFactory
