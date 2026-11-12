

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@WebServlet("/servletUsingGet")
public class GetHandler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		PrintWriter writer = response.getWriter();
		
		if(name.equals("Akib") && city.equals("Pune")) {
			writer.println("Successfully Logged in");
		}else {
			writer.println("Something Went Wrong");
		}
	}

}
