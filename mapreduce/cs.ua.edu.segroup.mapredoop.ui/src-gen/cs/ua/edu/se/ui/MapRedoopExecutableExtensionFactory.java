
/*
 * generated by Xtext
 */
 
package cs.ua.edu.se.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class MapRedoopExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return cs.ua.edu.se.ui.internal.MapRedoopActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return cs.ua.edu.se.ui.internal.MapRedoopActivator.getInstance().getInjector("cs.ua.edu.se.MapRedoop");
	}
	
}
