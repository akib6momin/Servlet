import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletLife
 */
@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
	
	static {
		System.out.println("Servlet loaded");
	}
	
    public ServletLife() {
    	System.out.println("Object is Created ");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("The initialization is done");
	}

	
	public void destroy() {
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("The request will be accepted and the response is generated");
	}

}
