package com.riccardonoviello.jinject.app.dao;

import com.riccardonoviello.commons.jinject.annotations.Inject;
import com.riccardonoviello.jinject.app.service.FileService;


public class PersonDao {
	
	@Inject	
	FileService fileService;
	
	private String filename = "persons.txt";

	
	public void savePerson(){		
		
		fileService.writeToFile(filename);		
	}
}
