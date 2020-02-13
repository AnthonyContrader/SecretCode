package it.contrader.controller;//view-service

import it.contrader.main.MainDispatcher;
import it.contrader.service.NewTeamService;
import it.contrader.dto.NewTeamDTO;

public class NewTeamController implements Controller {
	
	private NewTeamService service;
	
	public NewTeamController() {
		this.service = new NewTeamService();
	}
	private int idteam;
	private int iduser;
	private String usertype;

	public void doControl (Request request) {
		String var=request.get("var").toString();
	    switch (var){
        case "3":
        	 this.iduser = Integer.parseInt(request.get("iduser").toString());
        	 this.usertype = request.get("usertype").toString();
        	 this.idteam = Integer.parseInt(request.get("idteam").toString());
        	 NewTeamDTO newTeamDTO=new NewTeamDTO(iduser,usertype,idteam);
        	 //MainDispatcher.getInstance().callAction("NewTeam","doControl",request);
        	 this.service.insert(newTeamDTO);
	    }

	}

}
