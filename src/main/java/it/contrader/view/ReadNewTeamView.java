
package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
public class ReadNewTeamView extends AbstractView {

	private String iduser;

     
	public void showResults(Request request) {
	}

	public void showOptions() {
		
		System.out.println("----- .:View users's state:. ----");
		System.out.println(" Id user:");
		this.iduser = getInput();

	
	}
	
	public void submit() {
		
		Request request = new Request();
		
		request.put("iduser", iduser);
		request.put("var", "Read");
		MainDispatcher.getInstance().callAction("NewTeam", "doControl", request);
	}

	
}
