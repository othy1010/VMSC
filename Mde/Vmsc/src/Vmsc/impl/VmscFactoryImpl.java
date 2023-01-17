/**
 */
package Vmsc.impl;

import Vmsc.*;

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
public class VmscFactoryImpl extends EFactoryImpl implements VmscFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmscFactory init() {
		try {
			VmscFactory theVmscFactory = (VmscFactory)EPackage.Registry.INSTANCE.getEFactory(VmscPackage.eNS_URI);
			if (theVmscFactory != null) {
				return theVmscFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmscFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmscFactoryImpl() {
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
			case VmscPackage.VENUM: return createVEnum();
			case VmscPackage.VDATATYPE: return createVDatatype();
			case VmscPackage.VPACKAGE: return createVPackage();
			case VmscPackage.VCLASS: return createVClass();
			case VmscPackage.VATTRIBUTE: return createVAttribute();
			case VmscPackage.VREFERENCE: return createVReference();
			case VmscPackage.VSTRING: return createVString();
			case VmscPackage.VINT: return createVInt();
			case VmscPackage.VFLOAT: return createVFloat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VEnum createVEnum() {
		VEnumImpl vEnum = new VEnumImpl();
		return vEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDatatype createVDatatype() {
		VDatatypeImpl vDatatype = new VDatatypeImpl();
		return vDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPackage createVPackage() {
		VPackageImpl vPackage = new VPackageImpl();
		return vPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VClass createVClass() {
		VClassImpl vClass = new VClassImpl();
		return vClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAttribute createVAttribute() {
		VAttributeImpl vAttribute = new VAttributeImpl();
		return vAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VReference createVReference() {
		VReferenceImpl vReference = new VReferenceImpl();
		return vReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VString createVString() {
		VStringImpl vString = new VStringImpl();
		return vString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInt createVInt() {
		VIntImpl vInt = new VIntImpl();
		return vInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VFloat createVFloat() {
		VFloatImpl vFloat = new VFloatImpl();
		return vFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmscPackage getVmscPackage() {
		return (VmscPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmscPackage getPackage() {
		return VmscPackage.eINSTANCE;
	}

} //VmscFactoryImpl
