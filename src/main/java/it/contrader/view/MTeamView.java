package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
//modifica serve a cambiare solo il ruolo dell'utente
public class MTeamView extends AbstractView {

	private String iduser;
	private String idteam;
	private String usertype;
     
	public void showResults(Request request) {
		if (request !=null) {
			 boolean mod=(boolean)(request.get("mod"));
			  if (mod)
				  System.out.println("user uploaded");
			  else System.out.println("users not found");
		MainDispatcher.getInstance().callView("AdminTeam", null);
		}
	}

	public void showOptions() {
		
		System.out.println("----- .:Modifica:. ----");
		System.out.println(" Id team:");
		this.idteam = getInput();
		System.out.println("select user (Id user):");
		this.iduser = getInput();
		System.out.println("New User Type:");
		this.usertype = getInput();
		
		
		
	}
	
	public void submit() {
		
		Request request = new Request();
		
		request.put("idteam", idteam);
		request.put("usertype", usertype);
		request.put("iduser", iduser);
		request.put("var", "Update");
		MainDispatcher.getInstance().callAction("NewTeam", "doControl", request);
	
	}

	
}
