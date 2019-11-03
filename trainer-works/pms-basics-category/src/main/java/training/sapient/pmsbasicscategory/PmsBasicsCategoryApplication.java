package training.sapient.pmsbasicscategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import brave.sampler.Sampler;


@EnableFeignClients("training.sapient.pmsbasicscategory")
@SpringBootApplication
@EnableDiscoveryClient
public class PmsBasicsCategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsBasicsCategoryApplication.class, args);
	}


	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE; 
	}

}
