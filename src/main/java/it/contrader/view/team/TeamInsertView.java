package it.contrader.view.team;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class TeamInsertView extends AbstractView {

	private Request request;
	
	
	private String nometeam;
	private String descrizione;
	private int numeroutenti;
	
	
	private final String mode = "INSERT";
	
	public TeamInsertView() {
		
	}
	
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("Inserito.\n");
			MainDispatcher.getInstance().callView("Team", null);
		}
	}
	
	public void showOptions() {
		System.out.println("Inserisci nome team");
		nometeam = getInput();
		System.out.println("inserisci descrizione");
	}
	
	public void submit() {
		request = new Request();
		request.put("nometeam", nometeam);
		request.put("descrizione", descrizione);
		request.put("numeroutenti", numeroutenti);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Team", "doControl", request);
	}
}
