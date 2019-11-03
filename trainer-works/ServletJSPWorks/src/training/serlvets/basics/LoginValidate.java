package training.serlvets.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.serlvets.beans.LoginBean;
import training.serlvets.service.UserBL;

@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet implements SingleThreadModel{
	private static final long serialVersionUID = 1L;

	UserBL userBL;

	public void init() {
		userBL = new UserBL();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");

		response.setContentType("text/html");
		LoginBean loginBean = new LoginBean(userName, password);

		// invoke business logic
		if (userBL.validateUser(loginBean)) {
			// send it to success
			// or dispatch

			 request.getRequestDispatcher("Success").forward(request, response);

			// no statements
		} else {
			request.getRequestDispatcher("Failure").include(request, response);
			request.getRequestDispatcher("/Login.html").include(request, response);
		}
	}
}











