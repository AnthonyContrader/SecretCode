package it.contrader.view;


import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeUserView extends AbstractView{

	 private String choice;

	@Override
	public void showResults(Request request) {
		System.out.println("\n-----Purtroppo in questo sample l'utente non puà fare nulla per i team.-----");

	}
// ho modificato le opzioni dell'utente, prima poteva solo tornare al menu login (uscire) ora può aggiornare il suo profilo
	@Override
	public void showOptions() {
		System.out.println("-------------MENU------------\n");
		System.out.println("------.:Devi ricevere una richiesta per entrare nel team:.------");
		System.out.println("-----:.e Esci:.------");
		choice = this.getInput();

	}

	@Override
	public void submit() {

		switch (choice) {

		case "e":
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
			break;
		default :
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
			break;
		
		}
	}

}
