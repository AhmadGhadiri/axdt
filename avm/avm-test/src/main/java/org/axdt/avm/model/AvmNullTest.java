/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.axdt.avm.AvmEFactory;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType) <em>Calculate Common Type</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AvmNullTest extends TestCase {

	/**
	 * The fixture for this Avm Null test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmNull fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AvmNullTest.class);
	}

	/**
	 * Constructs a new Avm Null test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmNullTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Null test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmNull fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Null test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmNull getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AvmEFactory.eINSTANCE.createAvmNull());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isDynamic()
	 */
	public void testIsDynamic() {
		assertFalse(getFixture().isDynamic());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isFinal()
	 */
	public void testIsFinal() {
		assertTrue(getFixture().isFinal());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isInterface()
	 */
	public void testIsInterface() {
		assertFalse(getFixture().isInterface());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isClass()
	 */
	public void testIsClass() {
		assertFalse(getFixture().isClass());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType) <em>Calculate Common Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType)
	 */
	public void testCalculateCommonType__AvmType() {
		assertNull(getFixture().calculateCommonType(null));
		AvmNull nul = AvmEFactory.eINSTANCE.createAvmNull();
		assertEquals(getFixture(), getFixture().calculateCommonType(nul));
		AvmVoid voi = AvmEFactory.eINSTANCE.createAvmVoid();
		assertEquals(voi, getFixture().calculateCommonType(voi));
		AvmGeneric generic = AvmEFactory.eINSTANCE.createAvmGeneric();
		assertEquals(generic, getFixture().calculateCommonType(generic));
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getName()
	 */
	public void testGetName() {
		assertEquals("Null", getFixture().getName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		assertEquals("Null", getFixture().getName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifiedName()
	 */
	public void testGetQualifiedName() {
		assertEquals(QualifiedName.create("Null"), getFixture().getQualifiedName());
	}

} //AvmNullTest
