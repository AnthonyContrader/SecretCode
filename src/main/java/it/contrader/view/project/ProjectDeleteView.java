package it.contrader.view.project;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;
//Salvo Furnari
public class ProjectDeleteView extends AbstractView {
	//Props
	private Request request;

	private int id;
	private final String mode = "DELETE";

	public ProjectDeleteView() { }
	
	//Show res
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Cancellazione andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Project", null);
		}
	}
	//Show opt
	@Override
	public void showOptions() {
			System.out.println("Inserisci id progetto:");
			id = Integer.parseInt(getInput());

	}
	//Submit
	@Override
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Project", "doControl", request);
	}
}