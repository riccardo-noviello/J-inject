package com.riccardonoviello.jinject.test;

import org.junit.Test;

import com.riccardonoviello.commons.jinject.annotations.Inject;
import com.riccardonoviello.jinject.test.MyApp;
import com.riccardonoviello.jinject.test.components.HelloComponent;

public class MainTest {
	
	MyApp myApp = new MyApp();
	
	@Inject
	static HelloComponent comp;
	
	@Test
	public void loadContextTest(){
		comp.doSomething();
		
	}

}
