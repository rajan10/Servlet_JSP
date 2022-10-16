package p1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchData")
public class SearchDataServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String ptext=req.getParameter("ptext");
		 List<SignupDTO>  searchResult=SignupDao.searchData(ptext);
		 if(searchResult==null || searchResult.size()==0) {
			 req.setAttribute("message", "hmmm data could not be found!!!");
		 }
		 req.setAttribute("pdata", searchResult);
		 req.getRequestDispatcher("search.jsp").forward(req, resp);
	}
}
