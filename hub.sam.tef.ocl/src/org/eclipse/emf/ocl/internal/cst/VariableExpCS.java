/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.ocl.internal.cst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.VariableExpCS#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.VariableExpCS#getSimpleNameCS <em>Simple Name CS</em>}</li>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.VariableExpCS#getIsMarkedPreCS <em>Is Marked Pre CS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getVariableExpCS()
 * @model
 * @generated
 */
public interface VariableExpCS extends OCLExpressionCS {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ocl.internal.cst.OCLExpressionCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getVariableExpCS_Arguments()
	 * @model type="org.eclipse.emf.ocl.internal.cst.OCLExpressionCS"
	 * @generated
	 */
	EList getArguments();

	/**
	 * Returns the value of the '<em><b>Simple Name CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Name CS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name CS</em>' reference.
	 * @see #setSimpleNameCS(SimpleNameCS)
	 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getVariableExpCS_SimpleNameCS()
	 * @model
	 * @generated
	 */
	SimpleNameCS getSimpleNameCS();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ocl.internal.cst.VariableExpCS#getSimpleNameCS <em>Simple Name CS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name CS</em>' reference.
	 * @see #getSimpleNameCS()
	 * @generated
	 */
	void setSimpleNameCS(SimpleNameCS value);

	/**
	 * Returns the value of the '<em><b>Is Marked Pre CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Marked Pre CS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Marked Pre CS</em>' reference.
	 * @see #setIsMarkedPreCS(IsMarkedPreCS)
	 * @see org.eclipse.emf.ocl.internal.cst.CSTPackage#getVariableExpCS_IsMarkedPreCS()
	 * @model
	 * @generated
	 */
	IsMarkedPreCS getIsMarkedPreCS();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ocl.internal.cst.VariableExpCS#getIsMarkedPreCS <em>Is Marked Pre CS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Marked Pre CS</em>' reference.
	 * @see #getIsMarkedPreCS()
	 * @generated
	 */
	void setIsMarkedPreCS(IsMarkedPreCS value);

} // VariableExpCS
