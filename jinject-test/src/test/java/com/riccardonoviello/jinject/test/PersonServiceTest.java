package com.riccardonoviello.jinject.test;

import org.junit.Before;
import org.junit.Test;

import com.riccardonoviello.jinject.app.service.PersonService;

public class PersonServiceTest {

	MyTestApp myApp;
	PersonService service;
	
	@Before
	public void setup() throws IllegalAccessException, InstantiationException{
		myApp = new MyTestApp();
		service = myApp.getComponent(PersonService.class);		
	}
	
	@Test
	public void loadContextTest() {
		service.savePerson();
	}

}
