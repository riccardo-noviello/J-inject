package test.application.components.service;

import core.annotations.Inject;

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
