package training.sapient.pmsbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class CustomContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	@Autowired
	Configuration configuration;

	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setPort(configuration.getPort());
		System.out.println("Port number got from the spring cloud is " + configuration.getPort());
		factory.setContextPath("");
	}
}