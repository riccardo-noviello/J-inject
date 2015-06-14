package com.riccardonoviello.commons.jinject.core;

import com.riccardonoviello.commons.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.annotations.PropertiesScan;
import java.lang.reflect.ParameterizedType;

/**
 * This class loads the Application context and provides it.
 * 
 * @author RNOVI
 *
 */
public class Application<T> {

	private static ApplicationContext applicationContext = null;
	private Class<T> typeParameterClass;


	// Constructor
	public Application(){
		initClazz();
		this.startApp();
	}
	

	/**
	 * initialise the private field typeParameterClass with the current Class<T> type parameter
	 */
	@SuppressWarnings("unchecked")
	private final void initClazz() {
		this.typeParameterClass = (Class<T>) ((ParameterizedType) this
				.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	/**
	 * Returns the current Application Context
	 * 
	 * @return
	 */
	public final static ApplicationContext getContext() {
		return applicationContext;
	}

	/**
	 * Start the Application by initialising the Application context
	 */
	public final void startApp() {
		// init application context
		try {
			applicationContext = ApplicationContext.getInstance(
					getComponentScan(typeParameterClass), getPropertiesScan(typeParameterClass));

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
	 * 
	 * @param clazz
	 * @return
	 */
	private static final String[] getPropertiesScan(Class<?> clazz) {
		return clazz.getAnnotation(PropertiesScan.class).value();

	}

	/**
	 * Get the Component Scan value defined in the class' Annotation
	 * 
	 * @param clazz
	 * @return
	 */
	private static final String[] getComponentScan(Class<?> clazz) {
		return clazz.getAnnotation(ComponentScan.class).value();
	}

}
