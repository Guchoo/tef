/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.tef.tsl.impl;

import hub.sam.tef.modelcreating.ModelCreatingContext;
import hub.sam.tef.tsl.Binding;
import hub.sam.tef.tsl.CompositeBinding;
import hub.sam.tef.tsl.ElementBinding;
import hub.sam.tef.tsl.FixTerminal;
import hub.sam.tef.tsl.NonTerminal;
import hub.sam.tef.tsl.Pattern;
import hub.sam.tef.tsl.PatternTerminal;
import hub.sam.tef.tsl.PrimitiveBinding;
import hub.sam.tef.tsl.ReferenceBinding;
import hub.sam.tef.tsl.Rule;
import hub.sam.tef.tsl.Syntax;
import hub.sam.tef.tsl.TslFactory;
import hub.sam.tef.tsl.TslPackage;
import hub.sam.tef.tsl.ValueBinding;
import hub.sam.tef.tsl.WhiteSpace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TslFactoryImpl extends EFactoryImpl implements TslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TslFactory init() {
		try {
			TslFactory theTslFactory = (TslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.informatik.hu-berlin.de/sam/meta-tools/tef/tsl"); 
			if (theTslFactory != null) {
				return theTslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TslFactoryImpl() {
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
			case TslPackage.SYNTAX: return createSyntax();
			case TslPackage.RULE: return createRule();
			case TslPackage.NON_TERMINAL: return createNonTerminal();
			case TslPackage.FIX_TERMINAL: return createFixTerminal();
			case TslPackage.PATTERN_TERMINAL: return createPatternTerminal();
			case TslPackage.WHITE_SPACE: return createWhiteSpace();
			case TslPackage.PATTERN: return createPattern();
			case TslPackage.BINDING: return createBinding();
			case TslPackage.VALUE_BINDING: return createValueBinding();
			case TslPackage.ELEMENT_BINDING: return createElementBinding();
			case TslPackage.PRIMITIVE_BINDING: return createPrimitiveBinding();
			case TslPackage.COMPOSITE_BINDING: return createCompositeBinding();
			case TslPackage.REFERENCE_BINDING: return createReferenceBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TslPackage.MODEL_CREATING_CONTEXT:
				return createModelCreatingContextFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TslPackage.MODEL_CREATING_CONTEXT:
				return convertModelCreatingContextToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syntax createSyntax() {
		SyntaxImpl syntax = new SyntaxImpl();
		return syntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal createNonTerminal() {
		NonTerminalImpl nonTerminal = new NonTerminalImpl();
		return nonTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixTerminal createFixTerminal() {
		FixTerminalImpl fixTerminal = new FixTerminalImpl();
		return fixTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternTerminal createPatternTerminal() {
		PatternTerminalImpl patternTerminal = new PatternTerminalImpl();
		return patternTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteSpace createWhiteSpace() {
		WhiteSpaceImpl whiteSpace = new WhiteSpaceImpl();
		return whiteSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBinding createValueBinding() {
		ValueBindingImpl valueBinding = new ValueBindingImpl();
		return valueBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementBinding createElementBinding() {
		ElementBindingImpl elementBinding = new ElementBindingImpl();
		return elementBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveBinding createPrimitiveBinding() {
		PrimitiveBindingImpl primitiveBinding = new PrimitiveBindingImpl();
		return primitiveBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeBinding createCompositeBinding() {
		CompositeBindingImpl compositeBinding = new CompositeBindingImpl();
		return compositeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceBinding createReferenceBinding() {
		ReferenceBindingImpl referenceBinding = new ReferenceBindingImpl();
		return referenceBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCreatingContext createModelCreatingContextFromString(EDataType eDataType, String initialValue) {
		return (ModelCreatingContext)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelCreatingContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TslPackage getTslPackage() {
		return (TslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TslPackage getPackage() {
		return TslPackage.eINSTANCE;
	}

} //TslFactoryImpl