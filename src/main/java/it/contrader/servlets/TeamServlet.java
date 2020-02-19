package it.contrader.servlets;

import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.TeamDTO;
import it.contrader.service.TeamService;

public class TeamServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public TeamServlet() {

	}

	public void updateList(HttpServletRequest request) {
		TeamService service = new TeamService();
		List<TeamDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			TeamService service = new TeamService();	
			String mode = request.getParameter("mode");
			TeamDTO dto;
			int id;
			boolean ans;
			
	
		switch (mode.toUpperCase()) {
			
		case "TEAMLIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/team/teammanager.jsp").forward(request, response);
			
			break;
		
		case "READ":
			id = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				getServletContext().getRequestDispatcher("/team/readteam.jsp").forward(request, response);
			}
			
			else getServletContext().getRequestDispatcher("/team/updateteam.jsp").forward(request, response);
			break;
			
		case "INSERT":
			String nometeam = request.getParameter("nometeam").toString();
			String descrizione = request.getParameter("descrizione").toString();
			String numeroutenti = request.getParameter("numeroutenti").toString();
			dto = new TeamDTO (nometeam , descrizione, numeroutenti);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/team/teammanager.jsp").forward(request, response);
			break;
			
		case "DELETE":
			id = Integer.parseInt(request.getParameter("id"));
			ans = service.delete(id);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/team/teammanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			id = Integer.parseInt(request.getParameter("id"));
			nometeam = request.getParameter("nometeam");
			descrizione = request.getParameter("descrizione");
			numeroutenti = request.getParameter("numeroutenti");
			dto = new TeamDTO(id, nometeam, descrizione, numeroutenti);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/team/teammanager.jsp").forward(request, response);
			break;
	
	
		
		}
		
	}	
}

