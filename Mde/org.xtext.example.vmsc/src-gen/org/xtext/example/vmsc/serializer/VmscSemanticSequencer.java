/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.vmsc.serializer;

import Vmsc.VAttribute;
import Vmsc.VClass;
import Vmsc.VDatatype;
import Vmsc.VEnum;
import Vmsc.VFloat;
import Vmsc.VInt;
import Vmsc.VPackage;
import Vmsc.VReference;
import Vmsc.VString;
import Vmsc.VmscPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.vmsc.services.VmscGrammarAccess;

@SuppressWarnings("all")
public class VmscSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VmscGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VmscPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VmscPackage.VATTRIBUTE:
				sequence_VAttribute(context, (VAttribute) semanticObject); 
				return; 
			case VmscPackage.VCLASS:
				sequence_VClass(context, (VClass) semanticObject); 
				return; 
			case VmscPackage.VDATATYPE:
				sequence_VDatatype_Impl(context, (VDatatype) semanticObject); 
				return; 
			case VmscPackage.VENUM:
				sequence_VEnum(context, (VEnum) semanticObject); 
				return; 
			case VmscPackage.VFLOAT:
				sequence_VFloat(context, (VFloat) semanticObject); 
				return; 
			case VmscPackage.VINT:
				sequence_VInt(context, (VInt) semanticObject); 
				return; 
			case VmscPackage.VPACKAGE:
				sequence_VPackage(context, (VPackage) semanticObject); 
				return; 
			case VmscPackage.VREFERENCE:
				sequence_VReference(context, (VReference) semanticObject); 
				return; 
			case VmscPackage.VSTRING:
				sequence_VString(context, (VString) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     VStructuralFeatures returns VAttribute
	 *     VAttribute returns VAttribute
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         IsChangeable?='IsChangeable'? 
	 *         IsOrdered?='IsOrdered'? 
	 *         IsTransient?='IsTransient'? 
	 *         IsUnsettable?='IsUnsettable'? 
	 *         IsVolatile?='IsVolatile'? 
	 *         IsDerived?='IsDerived'? 
	 *         IsUnique?='IsUnique'? 
	 *         LowerBound=EInt? 
	 *         UpperBound=EInt? 
	 *         VType=VType?
	 *     )
	 * </pre>
	 */
	protected void sequence_VAttribute(ISerializationContext context, VAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VStructuralComponent returns VClass
	 *     VClass returns VClass
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (VStructural_features+=VStructuralFeatures VStructural_features+=VStructuralFeatures*)? 
	 *         (VSuperType+=[VClass|EString] VSuperType+=[VClass|EString]*)? 
	 *         IsAbstract?='IsAbstract'? 
	 *         IsInterface?='IsInterface'?
	 *     )
	 * </pre>
	 */
	protected void sequence_VClass(ISerializationContext context, VClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VStructuralComponent returns VDatatype
	 *     VDatatype_Impl returns VDatatype
	 *
	 * Constraint:
	 *     (name=EString IsSerializable?='IsSerializable'?)
	 * </pre>
	 */
	protected void sequence_VDatatype_Impl(ISerializationContext context, VDatatype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VStructuralComponent returns VEnum
	 *     VEnum returns VEnum
	 *
	 * Constraint:
	 *     (name=EString IsSerializable?='IsSerializable'?)
	 * </pre>
	 */
	protected void sequence_VEnum(ISerializationContext context, VEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VType returns VFloat
	 *     VFloat returns VFloat
	 *
	 * Constraint:
	 *     VContent=EFloat
	 * </pre>
	 */
	protected void sequence_VFloat(ISerializationContext context, VFloat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VmscPackage.Literals.VFLOAT__VCONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VmscPackage.Literals.VFLOAT__VCONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVFloatAccess().getVContentEFloatParserRuleCall_5_0(), semanticObject.getVContent());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VType returns VInt
	 *     VInt returns VInt
	 *
	 * Constraint:
	 *     VContent=EInt
	 * </pre>
	 */
	protected void sequence_VInt(ISerializationContext context, VInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VmscPackage.Literals.VINT__VCONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VmscPackage.Literals.VINT__VCONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVIntAccess().getVContentEIntParserRuleCall_5_0(), semanticObject.getVContent());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VPackage returns VPackage
	 *     VStructuralComponent returns VPackage
	 *
	 * Constraint:
	 *     (name=EString VPrefix=EString VUri=EString (VComponents+=VStructuralComponent VComponents+=VStructuralComponent*)?)
	 * </pre>
	 */
	protected void sequence_VPackage(ISerializationContext context, VPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VStructuralFeatures returns VReference
	 *     VReference returns VReference
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         IsChangeable?='IsChangeable'? 
	 *         IsOrdered?='IsOrdered'? 
	 *         IsTransient?='IsTransient'? 
	 *         IsUnsettable?='IsUnsettable'? 
	 *         IsVolatile?='IsVolatile'? 
	 *         IsDerived?='IsDerived'? 
	 *         IsUnique?='IsUnique'? 
	 *         IsContainer?='IsContainer'? 
	 *         IsContainment?='IsContainment'? 
	 *         LowerBound=EInt? 
	 *         UpperBound=EInt? 
	 *         VType=VClass?
	 *     )
	 * </pre>
	 */
	protected void sequence_VReference(ISerializationContext context, VReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VType returns VString
	 *     VString returns VString
	 *
	 * Constraint:
	 *     VContent=EString
	 * </pre>
	 */
	protected void sequence_VString(ISerializationContext context, VString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VmscPackage.Literals.VSTRING__VCONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VmscPackage.Literals.VSTRING__VCONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVStringAccess().getVContentEStringParserRuleCall_5_0(), semanticObject.getVContent());
		feeder.finish();
	}
	
	
}
