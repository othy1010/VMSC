/**
 */
package Vmsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Vmsc.VPackage#getVPrefix <em>VPrefix</em>}</li>
 *   <li>{@link Vmsc.VPackage#getVUri <em>VUri</em>}</li>
 *   <li>{@link Vmsc.VPackage#getVComponents <em>VComponents</em>}</li>
 * </ul>
 *
 * @see Vmsc.VmscPackage#getVPackage()
 * @model
 * @generated
 */
public interface VPackage extends VStructuralComponent {
	/**
	 * Returns the value of the '<em><b>VPrefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VPrefix</em>' attribute.
	 * @see #setVPrefix(String)
	 * @see Vmsc.VmscPackage#getVPackage_VPrefix()
	 * @model
	 * @generated
	 */
	String getVPrefix();

	/**
	 * Sets the value of the '{@link Vmsc.VPackage#getVPrefix <em>VPrefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VPrefix</em>' attribute.
	 * @see #getVPrefix()
	 * @generated
	 */
	void setVPrefix(String value);

	/**
	 * Returns the value of the '<em><b>VUri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VUri</em>' attribute.
	 * @see #setVUri(String)
	 * @see Vmsc.VmscPackage#getVPackage_VUri()
	 * @model
	 * @generated
	 */
	String getVUri();

	/**
	 * Sets the value of the '{@link Vmsc.VPackage#getVUri <em>VUri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VUri</em>' attribute.
	 * @see #getVUri()
	 * @generated
	 */
	void setVUri(String value);

	/**
	 * Returns the value of the '<em><b>VComponents</b></em>' containment reference list.
	 * The list contents are of type {@link Vmsc.VStructuralComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VComponents</em>' containment reference list.
	 * @see Vmsc.VmscPackage#getVPackage_VComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<VStructuralComponent> getVComponents();

} // VPackage
