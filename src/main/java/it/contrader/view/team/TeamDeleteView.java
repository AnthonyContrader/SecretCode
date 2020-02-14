package it.contrader.view.team;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class TeamDeleteView extends AbstractView {
	
	private Request request;
	
	
	private int id;
	private final String mode = "DELETE";
	
	
	public TeamDeleteView() {
		
	}
	@Override
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("cancellazione team effettuato con successo \n");
			MainDispatcher.getInstance().callView("Team", null);
		}
	}
		
		@Override
		public void showOptions() {
			System.out.println("Inserisci id team:");
			id = Integer.parseInt(getInput());
		}
		
		
		@Override
		public void submit() {
			request = new Request();
			request.put("id", id);
			request.put("mode", mode);
			MainDispatcher.getInstance().callAction("Team", "doControl", request);
		}
	
	

}