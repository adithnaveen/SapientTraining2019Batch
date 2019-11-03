package training.sapient.pmsbasics;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
//@EnableDiscoveryClient
public class PmsBasicsApplication {
	
	
	@Autowired
	Configuration configuration; 
	public static void main(String[] args) {
		SpringApplication.run(PmsBasicsApplication.class, args);
		
		 SpringApplication app = new SpringApplication(PmsBasicsApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8083"));
	        app.run(args);
		
		
	}
	
	// commented to test spring profile 
	/*
	 * 
	 * public Sampler defaultSampler() { return Sampler.ALWAYS_SAMPLE; }
	 */

}
