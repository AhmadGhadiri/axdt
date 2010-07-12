
package org.axdt.as3;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class As3StandaloneSetup extends As3StandaloneSetupGenerated{

	public static void doSetup() {
		new As3StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	@Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://axdt.org/uri/As3")) {
			EPackage.Registry.INSTANCE.put("http://axdt.org/uri/As3", org.axdt.as3.As3EPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://axdt.org/uri/Asdoc")) {
			EPackage.Registry.INSTANCE.put("http://axdt.org/uri/Asdoc", org.axdt.asdoc.AsdocEPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://axdt.org/uri/Avm")) {
			EPackage.Registry.INSTANCE.put("http://axdt.org/uri/Avm", org.axdt.avm.AvmEPackage.eINSTANCE);
		}
		super.register(injector);
	}
}

