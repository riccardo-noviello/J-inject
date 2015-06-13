package com.riccardonoviello.jinject.test;


import com.riccardonoviello.commons.jinject.core.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.core.jinject.annotations.PropertiesScan;
import com.riccardonoviello.commons.jinject.core.Application;
import com.riccardonoviello.jinject.test.components.HelloComponent;

@ComponentScan("com.riccardonoviello.jinject.test")
@PropertiesScan({ "src/main/resources/app.properties", "src/main/resources/db.properties" })
public class ApplicationTest extends Application {
	
	public static void main(String[] args) {		
		
		// Start the App
		startApp(ApplicationTest.class);
		
		// Test Application
		HelloComponent comp = getContext().getComponent(HelloComponent.class);
		comp.doSomething();

	}

}
