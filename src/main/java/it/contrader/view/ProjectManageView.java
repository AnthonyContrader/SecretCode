package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;
import it.contrader.dto.ProjectDTO;
import it.contrader.dto.UserDTO;
//Salvo Furnari
public class ProjectManageView extends AbstractView{
	//Props
	private Request    request;
	private ProjectDTO projectDTO;
	private String 	   choise;
	//Constructor
	public ProjectManageView() { }
	//Overrides
	@Override
	public void showResults(Request request) {
		if(request!=null) {
			System.out.println("\n------------------- Gestione Progetti ----------------\n");
			System.out.println("ID\tUsername\tPassword\tTipo Utente");
			System.out.println("------------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<ProjectDTO> projects = (List<ProjectDTO>) request.get("projects");
			for (ProjectDTO p: projects)
				System.out.println(p);
			System.out.println();
		}
	}

	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		this.choise = getInput();
	}

	@Override
	public void submit() {
		request = new Request();
		request.put("choise", this.choise);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Project", "doControl", this.request);
	}
}