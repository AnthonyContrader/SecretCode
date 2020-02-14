package it.contrader.view.team;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class TeamReadView extends AbstractView {
	
	private int id;
	private Request request;
	private final String mode = "READ";
	
	public TeamReadView() {
		
	}
	
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("la Visualizzazione e andata a buon fine \n ");
			MainDispatcher.getInstance().callView("Team", null);
		}
	}
	
	
	public void showOptions() {
		
		try {
			System.out.println("inserisci id team da visualizzare");
			id = Integer.parseInt(getInput());
		}catch(Exception e) {
			
		}
	}
	
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Team", "doControl", request);
	}
	

}
