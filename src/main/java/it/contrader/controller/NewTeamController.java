<<<<<<< Updated upstream
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
=======
package it.contrader.controller;//view-service

import it.contrader.main.MainDispatcher;
import it.contrader.service.NewTeamService;
import it.contrader.dto.NewTeamDTO;

public class NewTeamController implements Controller {
	private static String sub_package = "newTeam."; 
	private NewTeamService newTeamService;
	
	public NewTeamController() {
		this.newTeamService = new NewTeamService();
	}
	private int idteam;
	private int iduser;
	private String usertype;

	public void doControl (Request request) {
		
		String var=request.get("var").toString();
		switch (var.toUpperCase()){
		
	    case "READ":
			iduser = Integer.parseInt(request.get("iduser").toString());
			NewTeamDTO newTeamDTO = newTeamService.read(iduser);
			request.put("utentiteam", newTeamDTO);
		//	MainDispatcher.getInstance().callView(sub_package + "NewTeamRead", request);
			break;
	    case "DELETE":
	    	System.out.println("asad");
	    	iduser = Integer.parseInt(request.get("iduser").toString());
	    	idteam = Integer.parseInt(request.get("idteam").toString());
	    	newTeamDTO=new NewTeamDTO(idteam,iduser, "");
	    	newTeamService.delete(newTeamDTO);
	    	
			MainDispatcher.getInstance().callView(sub_package + "NewTeamDelete", request);
			break;
	    case "UPDATE":
	    	this.iduser = Integer.parseInt(request.get("iduser").toString());
       	    this.usertype = request.get("usertype").toString();
       	    this.idteam = Integer.parseInt(request.get("idteam").toString());
       	    newTeamDTO=new NewTeamDTO(idteam,iduser,usertype);
       	    
       	 //MainDispatcher.getInstance().callAction("NewTeam","doControl",request);
       	    this.newTeamService.update(newTeamDTO);
			break;
			
        case "INSERT":
        	 this.iduser = Integer.parseInt(request.get("iduser").toString());
        	 this.usertype = request.get("usertype").toString();
        	 this.idteam = Integer.parseInt(request.get("idteam").toString());
        	 newTeamDTO=new NewTeamDTO(idteam,iduser,usertype);
        	 //MainDispatcher.getInstance().callAction("NewTeam","doControl",request);
        	 this.newTeamService.insert(newTeamDTO);
        	 break;
	    }

	}

}
>>>>>>> Stashed changes
