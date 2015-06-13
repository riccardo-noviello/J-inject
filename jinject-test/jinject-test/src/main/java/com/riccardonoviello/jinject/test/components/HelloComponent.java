package com.riccardonoviello.jinject.test.components;

import com.riccardonoviello.commons.jinject.core.jinject.annotations.Inject;
import com.riccardonoviello.jinject.test.components.service.HelloService;


public class HelloComponent {
	
	@Inject	
	HelloService service;	
	
	public HelloComponent(){
		System.out.println("contructing HelloComponent");
	}
	
	public void doSomething(){
		
		service.helloService();
		
	}
}
