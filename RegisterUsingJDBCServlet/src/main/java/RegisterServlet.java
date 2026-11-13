

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String uemail = request.getParameter("uemail");
		String upass = request.getParameter("upass");
		String ucity = request.getParameter("ucity");
		
		System.out.println("Username: " + uname);
		System.out.println("Email: " + uemail);
		System.out.println("Password: " + upass);
		System.out.println("City: " + ucity);
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc_learning"; 
			String user= "root";
			String pass = "Akib@123";
			Connection con = DriverManager.getConnection(url, user, pass);
			
			PreparedStatement stmt = con.prepareStatement("insert into registeruser(Name, Email, Password, City) values(?,?,?,?)");
			
			stmt.setString(1, uname);
			stmt.setString(2, uemail);
			stmt.setString(3, upass);
			stmt.setString(4, ucity);
			
			int rowsAffected = stmt.executeUpdate();
			
			PrintWriter writer = response.getWriter();
			
			if(rowsAffected!=0) {
				writer.println("<h1>Registered Successfully</h1>");
			}else {
				writer.println("<h1>Failed to Register</h1>");
			}
			
			con.close();
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
