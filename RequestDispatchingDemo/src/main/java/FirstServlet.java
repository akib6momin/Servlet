

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control In First Servlet");
		
		RequestDispatcher rd = request.getRequestDispatcher("/SecondServlet");
		
		rd.forward(request, response);
		
		PrintWriter writer = response.getWriter();
		
		writer.println("Response From FirstServlet");
		
		
	}

}
