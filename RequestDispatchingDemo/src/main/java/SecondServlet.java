

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control In Second Servlet");
		
        PrintWriter writer = response.getWriter();
		
		writer.println("Response From SecondServlet");
	}

}
