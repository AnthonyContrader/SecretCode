package it.contrader.view.project;

import it.contrader.controller.Request;
import it.contrader.dto.ProjectDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;
//Salvo Furnari
public class ProjectReadView extends AbstractView {
	//Props
	private int id;
	private Request request;
	private final String mode = "READ";
	//Constructor
	public ProjectReadView() {}
	//Show res
	@Override
	public void showResults(Request request) {
		if (request != null) {
			ProjectDTO user = (ProjectDTO) request.get("project");
			System.out.println(user);
			MainDispatcher.getInstance().callView("ProjectManage", null);
		}
	}
	//SHow opt
	@Override
	public void showOptions() {
		System.out.println("Inserisci l'Id progetto:");
		id = Integer.parseInt(getInput());
	}
	//Req send
	@Override
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Project", "doControl", request);
	}
}
