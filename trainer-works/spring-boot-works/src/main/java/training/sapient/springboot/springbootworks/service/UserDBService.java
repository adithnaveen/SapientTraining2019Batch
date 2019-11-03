package training.sapient.springboot.springbootworks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.sapient.springboot.springbootworks.beans.User;
import training.sapient.springboot.springbootworks.repo.UserRepository;

@Service
public class UserDBService {
	@Autowired
	private UserRepository userRepository;

	public User getUserByName(String name) {
		return this.userRepository.findByUserName(name);
	}

	public Optional<User> getUserById(Integer id) {
		return this.userRepository.findById(id);
	}

	public User getUserByIdAsObject(Integer id) {
		Optional<User> findById = this.getUserById(id);
		System.out.println(findById);
		return findById.get();
	}

	public User insertUser(User user) {
		return this.userRepository.insert(user);
	}

	public User updateUser(User user) {
		return this.userRepository.save(user);
	}

	public void deleteUserById(Integer id) {
		this.userRepository.deleteById(id);
	}

	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	public List<User> getUserGreaterThanAge(int userAge) {
		return this.userRepository.findByUserAge(userAge);

	}
}
