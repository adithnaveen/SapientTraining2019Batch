package training.sapient.springboot.springbootworks.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import training.sapient.springboot.springbootworks.beans.Address;
import training.sapient.springboot.springbootworks.beans.User;
import training.sapient.springboot.springbootworks.repo.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoConfig {

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return string -> {
			/*
			 * userRepository.insert(new User(101, "Sandeep", 23, "sandeep@gmail.com", new
			 * Address("Marata Halli", "Bengaluru", "Karnatka", "India")));
			 * 
			 * userRepository.insert(new User(102, "Udit", 24, "udit@gmail.com", new
			 * Address("Whitefield", "Bengaluru", "Karnatka", "India")));
			 * 
			 * userRepository.insert(new User(103, "Anurag", 24, "anrag@gmail.com", new
			 * Address("Halter Ln", "Reston", "Virginia", "USA")));
			 */
			
		};
	}

}