package training.sapient.springboot.springbootworks.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import training.sapient.springboot.springbootworks.beans.User;
import training.sapient.springboot.springbootworks.exception.UserNotFoundException;
import training.sapient.springboot.springbootworks.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId) throws UserNotFoundException {

		User user = userService.findOne(userId);

		if (user == null) {
			throw new UserNotFoundException("Sorry User Not Found with Id " + userId);
		}

		return user;

	}

	// on hold
	@GetMapping("/users-with-resource/{userId}")
	public User getUserWithResource(@PathVariable int userId) throws UserNotFoundException {
		User user = this.userService.findOne(userId);

		if (user == null) {
			throw new UserNotFoundException("Sorry User Not Found " + userId);
		}

		// to return the resources of the user
		return user;

	}

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		User savedUser = userService.save(user);

		return savedUser;
	}

	@PutMapping("/users")
	public User update(@RequestBody User user) {
		User updatedUser = userService.updateUser(user);
		return updatedUser;
	}
}












