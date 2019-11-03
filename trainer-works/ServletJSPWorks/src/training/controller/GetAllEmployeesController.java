package training.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.jdbc.beans.Employee;
import training.jdbc.standards.IEmployeeDAO;
import training.service.EmployeeDAO;

/**
 * Servlet implementation class GetAllEmployeesController
 */
@WebServlet("/getemps")
public class GetAllEmployeesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException {

			List<Employee> emps = new EmployeeDAO().getAllEmployees(); 
			System.out.println("in controller " + emps);
			
			String path ="/WEB-INF/views/showemps2.jsp"; 
			
			request.setAttribute("EMPS", emps);
			
			request.getRequestDispatcher(path).forward(request, response); 
			
			
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}















