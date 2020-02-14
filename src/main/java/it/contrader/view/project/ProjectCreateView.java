package it.contrader.view.project;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;
//Salvo Furnari
public class ProjectCreateView extends AbstractView{
	//Props
	private Request request;

	private String name;
	private String url;
	private String description;
	private final String mode = "INSERT";
	//Constructor
	public ProjectCreateView() { }
	//Show res
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			
			System.out.println("Inserito.\n");
			MainDispatcher.getInstance().callView("ProjectManage", null);
		}
	}
	//Show
	@Override
	public void showOptions() {
		System.out.println("Inserisci nome progetto:");
		name = getInput();
		System.out.println("Inserisci url progetto:");
		url = getInput();
		System.out.println("Inserisci descrizione progetto:");
		description = getInput();
	}
	//Submit
	@Override
	public void submit() {
		request = new Request();
		request.put("name", name);
		request.put("url", url);
		request.put("description", description);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Project", "doControl", request);
	}
}