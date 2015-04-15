package test.application;

import core.Application;
import core.annotations.ComponentScan;
import core.annotations.PropertiesScan;
import test.application.components.HelloComponent;

@ComponentScan("test.application.components")
@PropertiesScan({ "resource/app.properties", "resource/db.properties" })
public class Main extends Application {
	
	public static void main(String[] args) {		
		
		// Start the App
		startApp(Main.class);
		
		// Test Application
		HelloComponent comp = getContext().getComponent(HelloComponent.class);
		comp.doSomething();

	}

}
