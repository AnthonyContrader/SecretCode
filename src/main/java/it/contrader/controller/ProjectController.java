package it.contrader.controller;

import java.util.List;
import it.contrader.dto.ProjectDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.ProjectService;
//Salvo Furnari
public class ProjectController implements Controller {
	//Props
	private ProjectService projectService;
	private static String subPack = "project.";
	//Constructor
	public ProjectController() {
		this.projectService = new ProjectService();
	}
	
	@Override
	public void doControl(Request request) {
		
		String mode   = request.get("mode")  .toString();
		
		switch(mode.toUpperCase()) {
			case "READ"   : readMode  (request); break;
			case "INSERT" : insertMode(request); break;
			case "UPDATE" : updateMode(request); break;
			case "DELETE" : deleteMode(request); break;
			case "CHOISE" : choiseMode(request); break;
			case "LIST"   : listMode  (request); break;
			default		  : choiseMode(request); break;
		}
	}
	//Helpers
	//Read
	private void readMode(Request request) {
		int id = Integer.parseInt(request.get("id").toString());
		
		ProjectDTO projectDTO = projectService.read(id);
		
		request.put("project", projectDTO);
		
		MainDispatcher.getInstance().callView(subPack + "ProjectRead", request);
	}
	//Insert
	private void insertMode(Request request) {
		
		String name 	   = request.get("name")	   .toString();
		String url  	   = request.get("url")		   .toString();
		String description = request.get("description").toString();
		
		ProjectDTO projectDTO = new ProjectDTO(name, url, description);
		
		projectService.create(projectDTO);
		request = new Request();
		request.put("mode", "mode");
		
		MainDispatcher.getInstance().callView(subPack + "ProjectInsert", request);
	}
	//Update
	private void updateMode(Request request) {
		int id = Integer.parseInt(request.get("id").toString());
		String name 	   = request.get("name")	   .toString();
		String url  	   = request.get("url")		   .toString();
		String description = request.get("description").toString();
		
		ProjectDTO projectDTO = new ProjectDTO(name, url, description);
		
		projectDTO.setId(id);
		projectService.update(projectDTO);
		request = new Request();
		request.put("mode", "mode");
		MainDispatcher.getInstance().callView(subPack + "ProjectUpdate", request);
	}
	//Delete
	private void deleteMode(Request request) {
		int id = Integer.parseInt(request.get("id").toString());
		projectService.delete(id);
		request = new Request();
		request.put("mode", "mode");
		MainDispatcher.getInstance().callView(subPack + "ProjectDelete", request);
	}
	//ReqHandler
	private void choiseMode(Request request) {
		
		String choise = request.get("choise").toString();
				
		switch (choise.toUpperCase()) {
		
		case "L":
			MainDispatcher.getInstance().callView(subPack + "ProjectRead", null);
			break;
			
		case "I":
			MainDispatcher.getInstance().callView(subPack + "ProjectInsert", null);
			break;
			
		case "M":
			MainDispatcher.getInstance().callView(subPack + "ProjectUpdate", null);
			break;
			
		case "C":
			MainDispatcher.getInstance().callView(subPack + "ProjectDelete", null);
			break;
			
		case "E":
			MainDispatcher.getInstance().callView("Login", null);
			break;

		case "B":
			MainDispatcher.getInstance().callView("HomeAdmin", null);
			break;
			
		default:
			MainDispatcher.getInstance().callView("Login", null);
		}
	}
	//List View
	private void listMode(Request request) {
		List<ProjectDTO> projectDTO = projectService.getAll();
		request.put("projects", projectDTO);
		MainDispatcher.getInstance().callView("Project", request);
	}
}
