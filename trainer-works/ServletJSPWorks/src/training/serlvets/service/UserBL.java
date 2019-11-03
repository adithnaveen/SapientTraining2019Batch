package training.serlvets.service;

import training.serlvets.beans.LoginBean;

public class UserBL {

	public boolean validateUser(LoginBean lb) {
		// you should connect to DB and validate

		return 
				lb.getUserName().equals("india") && 
				lb.getPassword().equals("sapient");
	}
}
