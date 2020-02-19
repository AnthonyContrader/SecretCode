package it.contrader.servlets;

import java.util.List;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.NewTeamDTO;
import it.contrader.service.NewTeamService;

public class NewTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewTeamServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		NewTeamService service = new NewTeamService();
		List<NewTeamDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewTeamService service = new NewTeamService();
		String var = request.getParameter("var");
		NewTeamDTO dto;
		int iduser;
		int idteam;
		
		boolean ans;

		switch (var.toUpperCase()) {


		case "READ":
			iduser = Integer.parseInt(request.getParameter("iduser"));
			dto = service.read(iduser);
			request.setAttribute("dto", dto);
			 
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/user/readuser.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/user/updateuser.jsp").forward(request, response);
			
			break;

		case "INSERT":
			iduser = Integer.parseInt(request.getParameter("iduser"));
			idteam = Integer.parseInt(request.getParameter("idteam"));
			String usertype = request.getParameter("usertype").toString();
			dto = new NewTeamDTO (idteam,iduser,usertype);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/NewTeam/NewTeam.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			iduser = Integer.parseInt(request.getParameter("iduser"));
			idteam = Integer.parseInt(request.getParameter("idteam"));
			usertype = request.getParameter("usertype");
			dto = new NewTeamDTO (idteam,iduser, usertype);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/NewTeam/NewTeam.jsp").forward(request, response);
			break;

		case "DELETE":
			iduser = Integer.parseInt(request.getParameter("iduser"));
			idteam = Integer.parseInt(request.getParameter("idteam"));
			dto = new NewTeamDTO (idteam,iduser,"");
			ans = service.delete(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/NewTeam/NewTeam.jsp").forward(request, response);
			break;
		}
	}
}