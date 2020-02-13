package it.contrader.view.project;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;
//Salvo Furnari
public class ProjectUpdateView extends AbstractView {
	//Props
	private Request request;

	private int id;
	private String name;
	private String url;
	private String description;
	private final String mode = "UPDATE";

	public ProjectUpdateView() { }
	//Show res
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Modifica andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Project", null);
		}
	}
	//Show opt
	@Override
	public void showOptions() {
		try {
			System.out.println("Inserisci id progetto:");
			id = Integer.parseInt(getInput());
			System.out.println("inserisci nome:");
			name = getInput();
			System.out.println("Inserisci url:");
			url = getInput();
			System.out.println("Inserisci descrizione:");
			description = getInput();
		} catch (Exception e) {

		}
	}
	//Request Send
	@Override
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("name", name);
		request.put("url", url);
		request.put("description", description);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Project", "doControl", request);
	}
}