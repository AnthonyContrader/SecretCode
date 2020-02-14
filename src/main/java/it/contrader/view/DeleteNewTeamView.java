package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
public class DeleteNewTeamView extends AbstractView {

	private String iduser;
	private String idteam;
     
	public void showResults(Request request) {
		if (request !=null) {
		 boolean res=(boolean)(request.get("res"));
		  if (res)
			  System.out.println("user deleted");
		  else System.out.println("users not found");
			MainDispatcher.getInstance().callView("AdminTeam", null);
		}
	}

	public void showOptions() {
		
		System.out.println("----- .:DELETE USER FROM TEAM:. ----");
		System.out.println(" Id team:");
		this.idteam = getInput();
		System.out.println("select user (Id user):");
		this.iduser = getInput();
	
	}
	
	public void submit() {
		
		Request request = new Request();
		
		request.put("iduser", iduser);
		request.put("idteam", idteam);
		request.put("var", "DELETE");
		MainDispatcher.getInstance().callAction("NewTeam", "doControl", request);
	}

	
}
