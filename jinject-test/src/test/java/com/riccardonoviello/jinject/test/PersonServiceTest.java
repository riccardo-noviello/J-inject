package com.riccardonoviello.jinject.test;

import org.junit.Test;

import com.riccardonoviello.commons.jinject.annotations.Inject;
import com.riccardonoviello.jinject.app.service.PersonService;

public class PersonServiceTest {

	@Inject
	PersonService service;

	MyTestApp myApp = new MyTestApp();
		
	@Test
	public void loadContextTest() {
		service.savePerson();
	}

}
