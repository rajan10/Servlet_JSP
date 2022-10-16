package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteRecord")
public class DeleteSignupServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//<a href="deleteRecord?uname=<%=signupDTO.getUsername() %>">
		  String username=req.getParameter("username");
		  SignupDao.deleteData(username);
			//Here we are Calling another servlet
		  req.getRequestDispatcher("showAllSignups").forward(req, resp);
	}
	
}
