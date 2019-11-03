package training.sapient.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="english")
	public IGreetings english() {
		return new GreetEnglish(); 
	}
	
	@Bean(name="french")
	public IGreetings french() {
		return new GreetFrench(); 
	}
}
