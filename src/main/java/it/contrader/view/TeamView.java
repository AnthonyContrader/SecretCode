package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.TeamDTO;
import it.contrader.main.MainDispatcher;

public class TeamView extends AbstractView {

	
	private Request request;
	private String choice;
	
	public TeamView(){
		
	}
	
	
	
	
	
	@Override
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("\n------------------- Visualizzazione team ----------------\n");
			System.out.println("ID\tNometeam\tDescrizione\tNumeroutenti");
			System.out.println("----------------------------------------------------\\n");
		
			
			@SuppressWarnings("unchecked")
			List<TeamDTO> teams = (List<TeamDTO>) request.get("teams");
			for (TeamDTO t: teams)
				System.out.println(t);
			System.out.println();
		}
	}
	
	
	@Override
	public void showOptions() {
		System.out.println("         Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");
		
		this.choice = getInput();
		
	}
	





@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Team", "doControl", this.request);
		
	}
		
	
	
}
