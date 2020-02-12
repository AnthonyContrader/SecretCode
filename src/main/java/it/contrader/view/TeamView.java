package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.TeamDTO;
import it.contrader.main.MainDispatcher;

public class TeamView {

	
	private Request request;
	private String choice;
	
	public TeamView(){
		
	}
	
	
	
	
	
	
	public void showResult(Request request) {
		if (request != null) {
			System.out.println("\n------------------- Gestione team ----------------\n");
			System.out.println("ID\tNometeam\tDescrizione\tNumeroutenti");
			System.out.println("----------------------------------------------------\\n");
		
			
			
			List<TeamDTO> team = (List<TeamDTO>) request.get("team");
			for (TeamDTO t: team)
				System.out.println(t);
			System.out.println();
		}
	}
	
	
	
	
	public void showOptions() {
		System.out.println("         Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");
		
		this.choice = getInput();
		
	}
	
	
	
	
	private String getInput() {
		// TODO Auto-generated method stub
		return null;
	}
	




	public void submit() {
		request = new Request();
		request.put("choice", "choice");
		request.put("mode", "GetCHOICE");
		MainDispatcher.getInstance().callAction("Team", "doControl", this.request);
		
	}
		
	
	
}
