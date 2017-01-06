

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends GenericServlet{
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<center>This is the First Servlet</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
