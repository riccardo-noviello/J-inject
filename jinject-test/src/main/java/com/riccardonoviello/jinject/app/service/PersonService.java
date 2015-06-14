package com.riccardonoviello.jinject.app.service;

import com.riccardonoviello.commons.jinject.annotations.Inject;
import com.riccardonoviello.jinject.app.dao.PersonDao;

public class PersonService {
	
	@Inject(property="test.person.name")
	private String injectedName;
	
	@Inject
	PersonDao personDao;
	
	@Inject
	FileService fileService;
		
	public PersonService(){
		System.out.println("contructing PersonService");
	}

	public void savePerson(){
		personDao.savePerson();
	}
	
}
