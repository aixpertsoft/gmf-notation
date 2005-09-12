/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getAlignment()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %level1
 */
public final class Alignment extends AbstractEnumerator {
	/**
	 * The '<em><b>Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_LITERAL
	 * @model name="Left"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT = 0;

	/**
	 * The '<em><b>Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_LITERAL
	 * @model name="Right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT = 1;

	/**
	 * The '<em><b>Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_LITERAL
	 * @model name="Center"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER = 2;

	/**
	 * The '<em><b>Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_LITERAL
	 * @model name="Top"
	 * @generated
	 * @ordered
	 */
	public static final int TOP = 3;

	/**
	 * The '<em><b>Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LITERAL
	 * @model name="Bottom"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM = 4;

	/**
	 * The '<em><b>Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @generated
	 * @ordered
	 */
	public static final Alignment LEFT_LITERAL = new Alignment(LEFT, "Left"); //$NON-NLS-1$

	/**
	 * The '<em><b>Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @generated
	 * @ordered
	 */
	public static final Alignment RIGHT_LITERAL = new Alignment(RIGHT, "Right"); //$NON-NLS-1$

	/**
	 * The '<em><b>Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @generated
	 * @ordered
	 */
	public static final Alignment CENTER_LITERAL = new Alignment(CENTER, "Center"); //$NON-NLS-1$

	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @generated
	 * @ordered
	 */
	public static final Alignment TOP_LITERAL = new Alignment(TOP, "Top"); //$NON-NLS-1$

	/**
	 * The '<em><b>Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @generated
	 * @ordered
	 */
	public static final Alignment BOTTOM_LITERAL = new Alignment(BOTTOM, "Bottom"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Alignment[] VALUES_ARRAY =
		new Alignment[] {
			LEFT_LITERAL,
			RIGHT_LITERAL,
			CENTER_LITERAL,
			TOP_LITERAL,
			BOTTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Alignment get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Alignment result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alignment</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Alignment get(int value) {
		switch (value) {
			case LEFT: return LEFT_LITERAL;
			case RIGHT: return RIGHT_LITERAL;
			case CENTER: return CENTER_LITERAL;
			case TOP: return TOP_LITERAL;
			case BOTTOM: return BOTTOM_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Alignment(int value, String name) {
		super(value, name);
	}

} //Alignment
