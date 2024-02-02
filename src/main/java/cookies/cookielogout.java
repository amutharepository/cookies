package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookielogout
 */
@WebServlet("/cookielogout")
public class cookielogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cookie s2=new Cookie("name","");
		s2.setMaxAge(0);
		response.addCookie(s2);
		Cookie s3= new Cookie("pass","");
		s3.setMaxAge(0);
		response.addCookie(s3);
		out.print("Loggedout Successfully");
	}

}
