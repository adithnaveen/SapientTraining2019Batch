package training.serlvets.basics;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectionRadio
 */
@WebServlet("/RedirectionRadio")
public class RedirectionRadio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String interest = request.getParameter("interest");

		if (interest.equals("sports")) {
			response.sendRedirect("https://www.espncricinfo.com/");
		} else if (interest.equals("politics")) {
			response.sendRedirect("https://www.ndtv.com/topic/politics");
		} else if (interest.equals("business")) {
			response.sendRedirect("https://www.news18.com/");
		} else  {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
						"Sorry we dont support for other services");
		}
	}
}
