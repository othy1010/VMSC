/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.vmsc;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class VmscStandaloneSetup extends VmscStandaloneSetupGenerated {

	public static void doSetup() {
		new VmscStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
