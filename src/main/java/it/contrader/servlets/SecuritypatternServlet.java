package it.contrader.servlets;

import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.contrader.dto.SecuritypatternDTO;
import it.contrader.service.SecuritypatternService;

public class SecuritypatternServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public SecuritypatternServlet() {

	}

	public void updateList(HttpServletRequest request) {
		SecuritypatternService service = new SecuritypatternService();
		List<SecuritypatternDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			SecuritypatternService service = new SecuritypatternService();	
			String mode = request.getParameter("mode");
			SecuritypatternDTO dto;
			int id;
			boolean ans;
			
	
		switch (mode.toUpperCase()) {
			
		case "SECURITYPATTERNLIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/securitypattern/securitypatternmanager.jsp").forward(request, response);	
			break;
		
		case "READ":
			id = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				getServletContext().getRequestDispatcher("/securitypattern/readsecuritypattern.jsp").forward(request, response);
			}
			
			else getServletContext().getRequestDispatcher("/securitypattern/updatesecuritypattern.jsp").forward(request, response);
			break;
			
		case "INSERT":
			String nome = request.getParameter("nome").toString();
			String tipo = request.getParameter("tipo").toString();
			dto = new SecuritypatternDTO (nome , tipo);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/securitypattern/securitypatternmanager.jsp").forward(request, response);
			break;
			
		case "DELETE":
			id = Integer.parseInt(request.getParameter("id"));
			ans = service.delete(id);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/securitypattern/securitypatternmanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			id = Integer.parseInt(request.getParameter("id"));
			nome = request.getParameter("nome");
			tipo = request.getParameter("tipo");
			dto = new SecuritypatternDTO(id, nome, tipo);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/securitypattern/securitypatternmanager.jsp").forward(request, response);
			break;
	
	
		
		}
		
	}
}
