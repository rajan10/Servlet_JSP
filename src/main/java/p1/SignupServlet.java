package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String username=req.getParameter("uname");
	      String password=req.getParameter("ppass");
	      String email=req.getParameter("email");
	      String mobile=req.getParameter("mobile");
	      String gender=req.getParameter("gender");
	      String address=req.getParameter("address");
	      String photo=req.getParameter("photo");
			// write JDBC Wala code to push data inside underlying database
			try {
				SignupDao.saveData(username, password, email, mobile);
				SignupDao.loadData();
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	   
	      //adding here so that we can access it on another page
	      //adding data inside request scope so that we can access it on another page
	      req.getRequestDispatcher("reviewSignup.jsp").forward(req, resp);
	}
}
