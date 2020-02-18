package it.contrader.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.contrader.dto.ProjectDTO;
import it.contrader.service.ProjectService;

/**
 * Servlet implementation class ProjectManagerServlet
 */
public class ProjectManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ProjectService projectService;
			
    public ProjectManagerServlet() {
        this.projectService = new ProjectService();
    }

    @Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String mode = request.getParameter("mode").toString();
    	
    	switch(mode.toUpperCase()) {
			case "READ"   : readMode  (request); break;
			case "INSERT" : insertMode(request); break;
			case "UPDATE" : updateMode(request); break;
			case "DELETE" : deleteMode(request); break;
			case "LIST"   : listMode  (request, response); break;
			default		  : listMode  (request, response); break;
    	}
    }
    //Helpers
  	//Read
  	private void readMode(HttpServletRequest request) {
  		int id = Integer.parseInt(request.getParameter("id").toString());
  		
  		ProjectDTO projectDTO = projectService.read(id);
  		
  		request.setAttribute("project", projectDTO);
  		//View
  	}
  	//Insert
  	private void insertMode(HttpServletRequest request) {
  		
  		String name 	   = request.getParameter("name")	    .toString();
  		String url  	   = request.getParameter("url")	    .toString();
  		String description = request.getParameter("description").toString();
  		
  		ProjectDTO projectDTO = new ProjectDTO(name, url, description);
  		
  		projectService.create(projectDTO);
  		request.setAttribute("projectDTO", projectDTO);
  		request.setAttribute("mode", "mode");
  		//View
  	}
  	//Update
  	private void updateMode(HttpServletRequest request) {
  		int id = Integer.parseInt(request.getParameter("id")    .toString());
  		String name 	   = request.getParameter("name")	    .toString();
  		String url  	   = request.getParameter("url")	    .toString();
  		String description = request.getParameter("description").toString();
  		
  		ProjectDTO projectDTO = new ProjectDTO(name, url, description);
  		
  		projectDTO.setId(id);
  		request.setAttribute("mode", projectService.update(projectDTO));
  		//View
  	}
  	//Delete
  	private void deleteMode(HttpServletRequest request) {
  		int id = Integer.parseInt(request.getParameter("id").toString());
  		projectService.delete(id);
  		request.setAttribute("mode", projectService.delete(id));
  		//View
  	}
  	//List View
  	private void listMode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		List<ProjectDTO> projectDTO = projectService.getAll();
  		request.setAttribute("projects", projectDTO);
  		//View
  		getServletContext().getRequestDispatcher("/project/projectManager.jsp").forward(request, response);
  	}

}
