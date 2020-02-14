package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
public class InsNewTeamView extends AbstractView {

	private String iduser;
	private String idteam;
	private String usertype;
     
	public void showResults(Request request) {
		if (request !=null) {
			 boolean ins=(boolean)(request.get("ins"));
			  if (ins)
				  System.out.println("user inserted");
			  else System.out.println("users not found");
				MainDispatcher.getInstance().callView("AdminTeam", null);
		}
	}
	

	public void showOptions() {
		
		System.out.println("----- .:Inserisci:. ----");
		System.out.println(" Id team:");
		this.idteam = getInput();
		System.out.println("Id user:");
		this.iduser = getInput();
		System.out.println("User Type:");
		this.usertype = getInput();
		
		
		
	}
	
	public void submit() {
		
		Request request = new Request();
		
		request.put("idteam", idteam);
		request.put("usertype", usertype);
		request.put("iduser", iduser);
		request.put("var", "INSERT");
		MainDispatcher.getInstance().callAction("NewTeam", "doControl", request);
	
	}

	
}

