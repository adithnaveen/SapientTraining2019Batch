package training.serlvets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class HelloWolrd extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public HelloWolrd() {
        super();
        
        System.out.println("Hello World, in constructor");
      
    }

    
    public void init() {
    	System.out.println("Hi i'm in Init, HelloWorld");
    }
    
    public void destroy() {
    	
    	System.out.println("I'm going out(Destroy), from Hello World ");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	 
		// processed 
		
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html");
		
		
		// send html content 
		
		out.print("<html>");
		out.print("<head><title>Hello world in Servlet </title></head>");
		out.print("<body><h1>Welcome to Servlets in Sapient, by Naveen </h1></body>");
		out.print("</html>");
	}
}
















