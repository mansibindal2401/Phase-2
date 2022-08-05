import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;	

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		// To verify whether entered data is printing correctly or not
		System.out.println("emailId.." + emailId);
		System.out.println("password.." + password);
	
		RequestDispatcher rd=null;
		
		if(emailId.equalsIgnoreCase("ankit11081998@gmail.com")&&password.equalsIgnoreCase("Ankit@1998")) {
			rd=request.getRequestDispatcher("Success");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid Credentials !!</span></center>");
		}
		
			
	
		}
	}

