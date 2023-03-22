package com.bilalwebservice.webservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class HelloWorldController {

	//url->http://localhost:8080/helloworld
	@GetMapping(path = "/helloworld")
	public String helloworld() {
		return "helloworld";
	}
	//url->http://localhost:8080/hello-world-bean
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldbean() {
		return new HelloWorldBean("Hello World");
	}
	//url->http://localhost:8080/helloworld/pathvariable/Bilal
	@GetMapping(path="/helloworld/pathvariable/{name}")
	public HelloWorldBean helloworldpathvariable(@PathVariable String name) {
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello World,%s",name));
	}
}
