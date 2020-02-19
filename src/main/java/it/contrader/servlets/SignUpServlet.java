package it.contrader.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.contrader.service.SignUpService;

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		SignUpService service = new SignUpService();
		
			String cx=request.getParameter("cx").toString();
		   boolean ans;
		   
			switch (cx){
	        case "1":
	        	//this.request.put("mode", "USERLIST");
	        	getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	        	break;
	        case "2":
	        	getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		    break;
	        case "3":
	        	String password = request.getParameter("password");
	        	String username = request.getParameter("username");
	 			ans = service.SignUp(username, password);
	 			request.setAttribute("ans", ans);
                 getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);	
			    break;
	        default:
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				break;
		}
	}
}
