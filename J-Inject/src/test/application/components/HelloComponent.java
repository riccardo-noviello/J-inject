package test.application.components;

import test.application.components.service.HelloService;
import core.annotations.Inject;


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
