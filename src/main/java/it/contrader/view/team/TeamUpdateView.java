package it.contrader.view.team;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class TeamUpdateView  extends AbstractView {

		private Request request;
		
		private int id;
		private String nometeam;
		private String descrizione;
		private final String mode = "UPDATE";
		
		public TeamUpdateView() {
			
		}
		
		public void showResults(Request request) {
			if (request != null) {
				System.out.println("modifica effettuata \n");
				MainDispatcher.getInstance().callView("Team" , null);
			}
		}
		
		public void  showOptions() {
			try {
			System.out.println("inserisci nometeam:");
			nometeam = getInput();
			System.out.println("inserisci descrizione:");
			descrizione = getInput();
			} catch (Exception e) {
			
		}
			
	}

		
		public void submit() {
			request = new Request();
			request.put("id", id);
			request.put("mode", mode);
			MainDispatcher.getInstance().callAction("Team", "doControl", request);
		}
}
