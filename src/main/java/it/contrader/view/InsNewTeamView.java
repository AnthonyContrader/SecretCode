<<<<<<< Updated upstream:src/main/java/it/contrader/view/NewTeamView.java
<<<<<<< Updated upstream
package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class NewTeamView extends AbstractView {

	private String iduser;
	private String idteam;
	private String usertype;
     
	public void showResults(Request request) {
	}

	public void showOptions() {
		
		System.out.println("----- .:Inserisci:. ----");
		
		System.out.println(" Id utente:");
		this.iduser = getInput();
		
		System.out.println(" User Type:");
		this.usertype = getInput();
		System.out.println(" Id team:");
		this.idteam = getInput();
	}
	
	public void submit() {
		
		Request request = new Request();
		
		request.put("iduser", iduser);
		request.put("usertype", usertype);
		request.put("idteam", idteam);
		request.put("var", 3);
		MainDispatcher.getInstance().callAction("NewTeam", "doControl", request);
	
	}

	
}
=======
package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class NewTeamView extends AbstractView {

	private String iduser;
	private String idteam;
	private String usertype;
     
	public void showResults(Request request) {
	}

	public void showOptions() {
		
		System.out.println("----- .:Inserisci:. ----");
		
		System.out.println(" Id utente:");
		this.iduser = getInput();
		
		System.out.println(" User Type:");
		this.usertype = getInput();
		System.out.println(" Id team:");
		this.idteam = getInput();
	}
	
	public void submit() {
		
		Request request = new Request();
		
		request.put("iduser", iduser);
		request.put("usertype", usertype);
		request.put("idteam", idteam);
		request.put("var", 3);
		MainDispatcher.getInstance().callAction("NewTeam", "doControl", request);
	
	}

	
}
>>>>>>> Stashed changes
=======
package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
public class InsNewTeamView extends AbstractView {

	private String iduser;
	private String idteam;
	private String usertype;
     
	public void showResults(Request request) {
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
>>>>>>> Stashed changes:src/main/java/it/contrader/view/InsNewTeamView.java
