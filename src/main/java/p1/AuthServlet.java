package p1;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth") // - Hey servlet your unique name is /auth - so client can connect with this servlet using this name only
public class AuthServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      System.out.println("Servlet is called");
	      String username=req.getParameter("username");
	      String password=req.getParameter("password");
	      
	      if(username.equalsIgnoreCase(username) && username.equalsIgnoreCase(password)) {
	    	  //It will forward request to home.jsp
		      req.getRequestDispatcher("home.jsp").forward(req, resp);
	      }else {
	    	  //setting message inside request scope before going to login page
	    	  req.setAttribute("cpapa", "Hey!!!! your username and password are not correct!!");
	    	  //The RequestDispatcher interface allows you to do a server side forward/include whereas
	    	  //sendRedirect() does a client side redirect. SendRedirect() will search the content 
	    	  //between the servers. it is slow because it has to intimate the browser by sending the URL of the content.
	    	 req.getRequestDispatcher("login.jsp").forward(req, resp);
	      }
	    
	}
}
