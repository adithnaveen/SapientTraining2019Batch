package training.service;

import java.util.List;

import training.jdbc.beans.Employee;

public class EmployeeDAO {

	// Employee is defined in Jar file 
	public List<Employee> getAllEmployees(){
		return new training.jdbc.dao.EmployeeDAO().getAllEmployees(); 
	}
}
