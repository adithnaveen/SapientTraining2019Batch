package training.sapient.springboot.springbootworks.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timeStamp; 
	private String message; 
	private String details;
	private String myMessage; 
	
	public ExceptionResponse(Date timeStamp, String message, String details, String myMessage) {
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
		this.myMessage = myMessage; 
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}


	
	
	
}