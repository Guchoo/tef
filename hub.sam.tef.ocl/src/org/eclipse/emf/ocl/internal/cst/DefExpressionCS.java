/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.ocl.internal.cst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Expression CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.DefExpressionCS#getOperationCS <em>Operation CS</em>}</li>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.DefExpressionCS#getVariableCS <em>Variable CS</em>}</li>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.DefExpressionCS#getExpressionCS <em>Expression CS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getDefExpressionCS()
 * @model
 * @generated
 */
public interface DefExpressionCS extends CSTNode {
	/**
	 * Returns the value of the '<em><b>Operation CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation CS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation CS</em>' reference.
	 * @see #setOperationCS(OperationCS)
	 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getDefExpressionCS_OperationCS()
	 * @model
	 * @generated
	 */
	OperationCS getOperationCS();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ocl.internal.cst.DefExpressionCS#getOperationCS <em>Operation CS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation CS</em>' reference.
	 * @see #getOperationCS()
	 * @generated
	 */
	void setOperationCS(OperationCS value);

	/**
	 * Returns the value of the '<em><b>Variable CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable CS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable CS</em>' reference.
	 * @see #setVariableCS(VariableCS)
	 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getDefExpressionCS_VariableCS()
	 * @model
	 * @generated
	 */
	VariableCS getVariableCS();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ocl.internal.cst.DefExpressionCS#getVariableCS <em>Variable CS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable CS</em>' reference.
	 * @see #getVariableCS()
	 * @generated
	 */
	void setVariableCS(VariableCS value);

	/**
	 * Returns the value of the '<em><b>Expression CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression CS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression CS</em>' reference.
	 * @see #setExpressionCS(OCLExpressionCS)
	 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getDefExpressionCS_ExpressionCS()
	 * @model extendedMetaData="name='oclExpressionCS'"
	 * @generated
	 */
	OCLExpressionCS getExpressionCS();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ocl.internal.cst.DefExpressionCS#getExpressionCS <em>Expression CS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression CS</em>' reference.
	 * @see #getExpressionCS()
	 * @generated
	 */
	void setExpressionCS(OCLExpressionCS value);

} // DefExpressionCS
