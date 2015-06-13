package com.riccardonoviello.commons.jinject.core;

import com.riccardonoviello.commons.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.annotations.PropertiesScan;

/**
 * This class loads the Application context and provides it.
 * 
 * @author RNOVI
 *
 */
public class Application {

	private static ApplicationContext applicationContext = null;

	/**
	 * Returns the current Application Context
	 * @return
	 */
	public static ApplicationContext getContext() {
		return applicationContext;
	}

	/**
	 * Start the Application by initialising the Application context
	 */
	public static void startApp(Class<?> clazz) {
		// init application context
		try {
			applicationContext = new ApplicationContext(getComponentScan(clazz), getPropertiesScan(clazz));

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get the Properties Scan values defined in the class' Annotation
	 * @param clazz
	 * @return
	 */
	private static String[] getPropertiesScan(Class<?> clazz) {
		return clazz.getAnnotation(PropertiesScan.class).value();

	}

	/**
	 * Get the Component Scan value defined in the class' Annotation
	 * @param clazz
	 * @return
	 */
	private static String getComponentScan(Class<?> clazz) {
		return clazz.getAnnotation(ComponentScan.class).value();
	}

}
