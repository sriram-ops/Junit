package com.in28minutes.rest.webservices.resdtfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	//GET
	//URI---/helloworld
	//method---'HelloWorld'
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}

	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldbean() {
		
		return new HelloWorldBean("Vishal Joshi");
	}
	
	@GetMapping(path="/hello-world-bean/path-Variablr/{name}")
	public HelloWorldBean helloWorldbean(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello Word,%s", name));
	}
	
	
}
