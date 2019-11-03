package training.sapient.springboot.springbootworks.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static ApiInfo apiInfo = 
			new ApiInfo("In Sapient", "Some Description Goes Here", 
					"1.0", "no Service", 
					new Contact("Naveen", "naveenks.com", "adith.naveen@gmail.com"), 
					"Some Lince", "http://ibm.com/licence");

	// http://localhost:9090/v2/api-docs
	// http://localhost:9090/swagger-ui.html
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(apiInfo); 
	}
}