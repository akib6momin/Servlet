

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        System.out.println("Servlet object is created by container");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String ucity = request.getParameter("ucity");
		
		response.sendRedirect("/ThirdWebApp/sucess.jsp");
	}

}
