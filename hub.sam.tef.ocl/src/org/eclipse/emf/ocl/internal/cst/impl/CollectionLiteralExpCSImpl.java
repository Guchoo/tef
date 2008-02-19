/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.ocl.internal.cst.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ocl.internal.cst.CSTPackage;
import org.eclipse.emf.ocl.internal.cst.CollectionLiteralExpCS;
import org.eclipse.emf.ocl.internal.cst.CollectionLiteralPartCS;
import org.eclipse.emf.ocl.internal.cst.CollectionTypeIdentifierEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.impl.CollectionLiteralExpCSImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ocl.internal.cst.impl.CollectionLiteralExpCSImpl#getCollectionLiteralParts <em>Collection Literal Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionLiteralExpCSImpl extends LiteralExpCSImpl implements CollectionLiteralExpCS {
	/**
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionTypeIdentifierEnum COLLECTION_TYPE_EDEFAULT = CollectionTypeIdentifierEnum.SET_LITERAL;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected CollectionTypeIdentifierEnum collectionType = COLLECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollectionLiteralParts() <em>Collection Literal Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionLiteralParts()
	 * @generated
	 * @ordered
	 */
	protected EList collectionLiteralParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionLiteralExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CSTPackage.Literals.COLLECTION_LITERAL_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeIdentifierEnum getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(CollectionTypeIdentifierEnum newCollectionType) {
		CollectionTypeIdentifierEnum oldCollectionType = collectionType;
		collectionType = newCollectionType == null ? COLLECTION_TYPE_EDEFAULT : newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCollectionLiteralParts() {
		if (collectionLiteralParts == null) {
			collectionLiteralParts = new EObjectResolvingEList(CollectionLiteralPartCS.class, this, CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_LITERAL_PARTS);
		}
		return collectionLiteralParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_TYPE:
				return getCollectionType();
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_LITERAL_PARTS:
				return getCollectionLiteralParts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_TYPE:
				setCollectionType((CollectionTypeIdentifierEnum)newValue);
				return;
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_LITERAL_PARTS:
				getCollectionLiteralParts().clear();
				getCollectionLiteralParts().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_LITERAL_PARTS:
				getCollectionLiteralParts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_TYPE:
				return collectionType != COLLECTION_TYPE_EDEFAULT;
			case CSTPackage.COLLECTION_LITERAL_EXP_CS__COLLECTION_LITERAL_PARTS:
				return collectionLiteralParts != null && !collectionLiteralParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (collectionType: "); //$NON-NLS-1$
		result.append(collectionType);
		result.append(')');
		return result.toString();
	}

} //CollectionLiteralExpCSImpl
