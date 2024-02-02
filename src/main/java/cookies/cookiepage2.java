package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookiepage2
 */
@WebServlet("/cookiepage2")
public class cookiepage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out= response.getWriter();
    Cookie[] ab=request.getCookies();
	for(Cookie i:ab) {
		out.print(i.getValue());
	}
	}

}
