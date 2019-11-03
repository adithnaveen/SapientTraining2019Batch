package training.sapient.pmszuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class PmsZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsZuulApiGatewayServerApplication.class, args);

	}

	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE; 
	}
}
