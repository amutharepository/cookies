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
 * Servlet implementation class cookiepage
 */
@WebServlet("/cookiepage")
public class cookiepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String name= request.getParameter("A");
		String pass=request.getParameter("B");
		if(name.equals("amu")&& pass.equals("1234")) {
			Cookie s= new Cookie("name", name);
			response.addCookie(s);
			Cookie s1= new Cookie ("pass",pass);
			response.addCookie(s1);
			out.print("You are login successfully");
			response.sendRedirect("cookiepage2");
		}
		else {
			out.print("Please check your credentials");
		}
		if(name.equals("kavi")&& pass.equals("2345")) {
			Cookie s= new Cookie("name", name);
			response.addCookie(s);
			Cookie s1= new Cookie ("pass",pass);
			response.addCookie(s1);
			out.print("You are login successfully");
			response.sendRedirect("cookiepage2");
		}
		else {
			out.print("Please check your credentials");
		}
	}

}
