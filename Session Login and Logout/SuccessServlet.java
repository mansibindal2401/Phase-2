import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Success")
public class SuccessServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;	

	public SuccessServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1> Welcome "+request.getParameter("emailId") + " Login Successful at " + new Date() + "</h1>");
	}
	}
	