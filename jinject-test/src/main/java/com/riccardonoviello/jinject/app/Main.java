package com.riccardonoviello.jinject.app;

import com.riccardonoviello.commons.jinject.annotations.Inject;
import com.riccardonoviello.jinject.app.service.PersonService;

public class Main{
	
	@Inject
	static PersonService personService;
	
	public static void main(String[] args){
		
		// Start the App
		MyApp myApp = new MyApp();
		
		// Test Application
		personService.savePerson();

	}
}
