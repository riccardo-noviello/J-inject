package test.application.components;

import core.annotations.Inject;

public class DatabaseComponent {
	
	@Inject(property="database.name")
	private String dbname;
		
	@Inject(property="database.url")
	private String dburl;
	
	
	public DatabaseComponent(){
		
	}
	
	/**
	 * 
	 */
	public void connect(){
		System.out.println("Connected to: "+dbname + " with url: "+dburl);
	}
}
