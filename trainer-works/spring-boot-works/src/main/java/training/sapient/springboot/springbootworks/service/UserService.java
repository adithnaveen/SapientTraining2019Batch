package training.sapient.springboot.springbootworks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import training.sapient.springboot.springbootworks.beans.User;

@Component
public class UserService {

	// assuming the Data is populated from DB

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(101, "Umang", 23, "umang@gmail.com", null));
		users.add(new User(102, "Mayur", 23, "mayur@gmail.com", null));
		users.add(new User(103, "Abhilash", 24, "Abhilash@gmail.com", null));
	}

	// get all records
	public List<User> getAllUsers() {
		return users;
	}

	public User save(User user) {
		// when end user doesnot give the userId
		if (user.getId() == 0) {
			int counter = users.size() + 1;
			user.setId(counter);
		}

		users.add(user);

		// post adding to the list
		return user;
	}

	public User findOne(int userId) {
		for (User user : users) {
			if (user.getId() == userId) {
				return user;
			}
		}
		return null;
	}

	public User updateUser(User user) {
		this.deleteUser(user.getId());
		users.add(user);
		return user;
	}

	public User deleteUser(int userId) {
		for (User user : users) {
			if (user.getId() == userId) {
				users.remove(user);
				return user;
			}
		}
		return null;
	}

}
