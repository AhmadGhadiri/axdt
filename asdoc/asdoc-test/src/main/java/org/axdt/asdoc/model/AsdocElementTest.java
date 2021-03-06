/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocElement#getFullUri() <em>Get Full Uri</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocElement#getRoot() <em>Get Root</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AsdocElementTest extends TestCase {

	/**
	 * The fixture for this Asdoc Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocElement fixture = null;

	/**
	 * Constructs a new Asdoc Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Asdoc Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AsdocElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Asdoc Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocElement getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.asdoc.model.AsdocElement#getFullUri() <em>Get Full Uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocElement#getFullUri()
	 * @generated NOT
	 */
	public void testGetFullUri() {
		assertEquals(null, getFixture().getFullUri());
	}

	/**
	 * Tests the '{@link org.axdt.asdoc.model.AsdocElement#getRoot() <em>Get Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocElement#getRoot()
	 */
	public void testGetRoot() {
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getName()
	 * @generated NOT
	 */
	public abstract void testGetName();

} //AsdocElementTest
