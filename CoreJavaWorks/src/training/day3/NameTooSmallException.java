package training.day3;

// since the class extends an exception class then it is called as 
// checked exception 
// if the class is extending checked exception then 
// the is eligible to be throwable and checked exception 
// classes has to surrounded by try catch block explicitly. 


public class NameTooSmallException extends Exception {

	
	private String message; 
	
	public NameTooSmallException() {
		this.message = "Sorry Name is too Small "; 
	}
	
	public NameTooSmallException(String message) {
		this.message = message; 
	}

	@Override
	public String getMessage() {

		return this.message +"::::::::::"; 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ " +this.message+"]";
	}
	
	
}
