import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class FirstServletApp
 */
@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		PrintWriter writer =response.getWriter();
//		writer.println("Hello "+name);
//		writer.println("I know you're from "+city);
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<table border='1'>");
		writer.println("<tr><th>Greeting</th></tr>");
		writer.println("<tr><td>Hello " + name + "</td></tr>");
		writer.println("<tr><td>I know you're from " + city + "</td></tr>");
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
