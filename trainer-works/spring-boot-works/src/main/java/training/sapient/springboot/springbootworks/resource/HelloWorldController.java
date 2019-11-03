package training.sapient.springboot.springbootworks.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import training.sapient.springboot.springbootworks.beans.Hello;

@RestController 
public class HelloWorldController {
	
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		return "Hello World"; 
	}
	
	// http://localhost:9090/helloworld/Naveen
	@GetMapping(path="/helloworld/{name}")
	public Hello sayHello(
			@PathVariable
			String name) {
		 
		return new Hello("Hello " + name ); 
	}
	
}
