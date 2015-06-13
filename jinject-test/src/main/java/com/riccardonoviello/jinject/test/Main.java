package com.riccardonoviello.jinject.test;

import com.riccardonoviello.commons.jinject.annotations.Inject;
import com.riccardonoviello.jinject.test.components.HelloComponent;

public class Main{
	
	@Inject
	static HelloComponent comp;
	
	public static void main(String[] args){
		
		// Start the App
		MyApp myApp = new MyApp();
		
		// Test Application
		comp.doSomething();

	}
}
