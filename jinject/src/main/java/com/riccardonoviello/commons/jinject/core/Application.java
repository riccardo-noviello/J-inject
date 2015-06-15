package com.riccardonoviello.commons.jinject.core;

import com.riccardonoviello.commons.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.annotations.PropertiesScan;

import java.lang.reflect.ParameterizedType;
import java.util.logging.Logger;

/**
 * This class loads the Application context and provides it.
 * 
 * @author RNOVI
 *
 */
public class Application<T> {
	
	private Logger logger = Logger.getLogger(Application.class.getName());

	private Class<T> typeParameterClass;


	// Constructor
	public Application(){
		initClazz();
		getContext();
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
	public final ApplicationContext getContext() {
		try {
			return ApplicationContext.getInstance(
					getComponentScan(typeParameterClass), getPropertiesScan(typeParameterClass));

		} catch (IllegalArgumentException e) {
			logger.severe(e.toString());
		} catch (IllegalAccessException e) {
			logger.severe(e.toString());
		} catch (InstantiationException e) {
			logger.severe(e.toString());
		}
		return null;
	}


	/**
	 * Get the Properties Scan values defined in the class' Annotation
	 * 
	 * @param clazz
	 * @return
	 */
	private final String[] getPropertiesScan(Class<?> clazz) {
		return clazz.getAnnotation(PropertiesScan.class).value();

	}

	/**
	 * Get the Component Scan value defined in the class' Annotation
	 * 
	 * @param clazz
	 * @return
	 */
	private final String[] getComponentScan(Class<?> clazz) {
		return clazz.getAnnotation(ComponentScan.class).value();
	}

}
