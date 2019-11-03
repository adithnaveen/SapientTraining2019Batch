package training.sapient.springboot.springbootworks.exception;

public class UserNotFoundException extends Exception {

	private String message; 
	
	private UserNotFoundException() {
		this.message = "Sorry User Not Found"; 
	}

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserNotFoundException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

