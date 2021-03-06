package training.sapient.pmsbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ServerPortCustomizer 
  implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
  

	@Autowired
	Configuration config; 
	
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(config.getPort());
    }
}