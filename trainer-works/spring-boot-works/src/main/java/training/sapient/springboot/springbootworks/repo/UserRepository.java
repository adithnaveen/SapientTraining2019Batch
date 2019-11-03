package training.sapient.springboot.springbootworks.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import training.sapient.springboot.springbootworks.beans.User;

/*
 * 	private int userId;  -> findByUserId(Integer)  
	private String userName; 
	private int userAge; 
	private String userEmail;
 */
public interface UserRepository extends MongoRepository<User, Integer> {

	public User findByUserName(String userName);

	// given age it shows name and country (embedded document)
	@Query(value = "{'userAge':{$gt:?0}}", fields = "{'userName':1, 'address.country':1}")
	List<User> findByUserAge(int userAge);
}
