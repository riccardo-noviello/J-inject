package com.riccardonoviello.jinject.test.components.service;

import com.riccardonoviello.commons.jinject.annotations.Inject;

public class HelloService {
	
	@Inject(property="test.person.name")
	private String injectedName;
	
	public HelloService(){
		System.out.println("contructing HelloService");
	}

	public void helloService(){
		System.out.println("Hello '" + injectedName +"'");
	}
	
}
