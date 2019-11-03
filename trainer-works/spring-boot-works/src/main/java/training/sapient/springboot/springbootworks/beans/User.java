package training.sapient.springboot.springbootworks.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class User {
	
	@Id
	private int id; 
	private String userName; 
	private int userAge; 
	private String userEmail;
	
	private Address address; 


	public User(int id, String userName, int userAge, String userEmail, Address address) {
		this.id = id; 
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.address = address; 
	} 
	public   User() {

	}
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
