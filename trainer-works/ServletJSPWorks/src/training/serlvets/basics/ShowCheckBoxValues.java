package training.serlvets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowCheckBoxValues
 */
@WebServlet("/ShowCheckBoxValues")
public class ShowCheckBoxValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uName = request.getParameter("uname"); 
		
		String[] interests = request.getParameterValues("interest");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		out.println("Your Name is  " + uName);

		for(String temp : interests) {
			out.println(temp);
		}
	}

}
