/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.ui.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.axdt.avm.util.AvmEAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmEItemProviderAdapterFactory extends AvmEAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmEItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmVoid} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmVoidItemProvider avmVoidItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmVoid}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmVoidAdapter() {
		if (avmVoidItemProvider == null) {
			avmVoidItemProvider = new AvmVoidItemProvider(this);
		}

		return avmVoidItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmNull} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmNullItemProvider avmNullItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmNull}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmNullAdapter() {
		if (avmNullItemProvider == null) {
			avmNullItemProvider = new AvmNullItemProvider(this);
		}

		return avmNullItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmGeneric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmGenericItemProvider avmGenericItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmGeneric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmGenericAdapter() {
		if (avmGenericItemProvider == null) {
			avmGenericItemProvider = new AvmGenericItemProvider(this);
		}

		return avmGenericItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmVoidReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmVoidReferenceItemProvider avmVoidReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmVoidReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmVoidReferenceAdapter() {
		if (avmVoidReferenceItemProvider == null) {
			avmVoidReferenceItemProvider = new AvmVoidReferenceItemProvider(this);
		}

		return avmVoidReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmNullReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmNullReferenceItemProvider avmNullReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmNullReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmNullReferenceAdapter() {
		if (avmNullReferenceItemProvider == null) {
			avmNullReferenceItemProvider = new AvmNullReferenceItemProvider(this);
		}

		return avmNullReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmGenericReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmGenericReferenceItemProvider avmGenericReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmGenericReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmGenericReferenceAdapter() {
		if (avmGenericReferenceItemProvider == null) {
			avmGenericReferenceItemProvider = new AvmGenericReferenceItemProvider(this);
		}

		return avmGenericReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.axdt.avm.model.AvmDeclaredTypeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmDeclaredTypeReferenceItemProvider avmDeclaredTypeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.axdt.avm.model.AvmDeclaredTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvmDeclaredTypeReferenceAdapter() {
		if (avmDeclaredTypeReferenceItemProvider == null) {
			avmDeclaredTypeReferenceItemProvider = new AvmDeclaredTypeReferenceItemProvider(this);
		}

		return avmDeclaredTypeReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (avmVoidItemProvider != null) avmVoidItemProvider.dispose();
		if (avmNullItemProvider != null) avmNullItemProvider.dispose();
		if (avmGenericItemProvider != null) avmGenericItemProvider.dispose();
		if (avmVoidReferenceItemProvider != null) avmVoidReferenceItemProvider.dispose();
		if (avmNullReferenceItemProvider != null) avmNullReferenceItemProvider.dispose();
		if (avmGenericReferenceItemProvider != null) avmGenericReferenceItemProvider.dispose();
		if (avmDeclaredTypeReferenceItemProvider != null) avmDeclaredTypeReferenceItemProvider.dispose();
	}

}
