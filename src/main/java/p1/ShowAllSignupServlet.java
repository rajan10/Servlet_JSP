package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showAllSignups")
public class ShowAllSignupServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			SignupDao.loadData();
	      //adding here so that we can access it on another page
	      //adding data inside request scope so that we can access it on another page
	      req.getRequestDispatcher("reviewSignup.jsp").forward(req, resp);
	}
}
