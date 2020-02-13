package it.contrader.controller;

import java.util.List;

import it.contrader.dto.TeamDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.TeamService;

public class TeamController {
	
	private static String sub_package = "team";
	
	private TeamService teamService;
	
	
	public TeamController() {
		this.teamService = new TeamService();
	}

	
	
	
	
	public void doControl(Request request) {
		String mode = (String) request.get("mode");
		
		String choice = (String) request.get("choice");
		
		int id;
		String nometeam;
		String descrizione;
		int numeroutenti;
		
		
		switch (mode) {
		
		
		case "READ":
			id = Integer.parseInt(request.get("id").toString());
			TeamDTO teamDTO = teamService.read(id);
			request.put("team", teamDTO);
			MainDispatcher.getInstance().callView(sub_package + "TeamRead", request);
			break;
		
		case "INSERT":
			nometeam = request.get("nometeam").toString();
			descrizione = request.get("descrizione").toString();
			numeroutenti = Integer.parseInt(request.get("numeroutenti").toString());
			
			TeamDTO teamtoinsert = new TeamDTO(nometeam, descrizione, numeroutenti);
			
			teamService.insert(teamtoinsert);
			request = new Request();
			request.put("mode", "mode");
			
			MainDispatcher.getInstance().callView(sub_package + "TeamInsert" , request);
			break;
			
		case "DELETE":
			id = Integer.parseInt(request.get("id").toString());
			
			teamService.delete(id);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "TeamDelete", request);
			break;
			
		case "UPDATE":
			id = Integer.parseInt(request.get("id").toString());
			nometeam = request.get("nometeam").toString();
			descrizione = request.get("descrizione").toString();
			numeroutenti = Integer.parseInt(request.get("numeroutenti").toString());
			TeamDTO teamtoupdate = new TeamDTO(nometeam, descrizione, numeroutenti);
			teamtoupdate.setId(id);
			teamService.update(teamtoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "TeamUpdate", request);
			break;
			
			
		case "USERLIST":
			List<TeamDTO> teamsDTO = teamService.getAll();
			
			request.put("teams", teamsDTO);
			MainDispatcher.getInstance().callView("Team", request);
			break;
			
			
		case "GETCHOICE":
			
			
			switch (choice.toUpperCase()) {
				case "L":
					MainDispatcher.getInstance().callView(sub_package + "TeamRead", null);
					break;
					
				case "I":
					MainDispatcher.getInstance().callView(sub_package +  "TeamInsert", null);
					break;
					
				case "M":
					MainDispatcher.getInstance().callView(sub_package + "TeamUpdate", null);
					break;
					
				case "C":
					MainDispatcher.getInstance().callView(sub_package + "TeamDelete", null);
					break;
					
				case "E":
					MainDispatcher.getInstance().callView("Login", null);
					break;
					
				case "B":
					MainDispatcher.getInstance().callView("Homeadmin", null);
					break;
				
				default:
					MainDispatcher.getInstance().callView("Login", null);
					
			}
	
	
		
		}
		
	}	
}

