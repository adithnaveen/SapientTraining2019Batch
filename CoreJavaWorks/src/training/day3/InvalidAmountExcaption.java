package training.day3;

public class InvalidAmountExcaption extends Exception {
	private String message; 
	
	public InvalidAmountExcaption() {
		this.message = "Sorry Invalid Amount"; 
	}
	
	public InvalidAmountExcaption(String message) {
		this.message = message; 
	}

	@Override
	public String toString() {
		return "InvalidAmountExcaption [message=" + message + "]";
	}
	
	
	
}
