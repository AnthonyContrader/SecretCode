
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
			MainDispatcher.getInstance().callView("ReadNewTeam", request);
			break;
	    case "DELETE":
	    	iduser = Integer.parseInt(request.get("iduser").toString());
	    	idteam = Integer.parseInt(request.get("idteam").toString());
	    	newTeamDTO=new NewTeamDTO(idteam,iduser, "");
	    	 boolean res= newTeamService.delete(newTeamDTO);
	    	request.put("res", res);
	    	MainDispatcher.getInstance().callView("DeleteNewTeam", request);
			break;
	    case "UPDATE":
	    	this.iduser = Integer.parseInt(request.get("iduser").toString());
       	    this.usertype = request.get("usertype").toString();
       	    this.idteam = Integer.parseInt(request.get("idteam").toString());
       	    newTeamDTO=new NewTeamDTO(idteam,iduser,usertype);
       	    this.newTeamService.update(newTeamDTO);
       	    boolean mod= newTeamService.update(newTeamDTO);
	    	request.put("mod", mod);
	    	MainDispatcher.getInstance().callView("MTeam",request);
			break;
			
        case "INSERT":
        	 this.iduser = Integer.parseInt(request.get("iduser").toString());
        	 this.usertype = request.get("usertype").toString();
        	 this.idteam = Integer.parseInt(request.get("idteam").toString());
        	 newTeamDTO=new NewTeamDTO(idteam,iduser,usertype);
        	 this.newTeamService.insert(newTeamDTO);
        	 boolean ins= newTeamService.update(newTeamDTO);
 	    	 request.put("ins", ins);
        	 MainDispatcher.getInstance().callView("InsNewTeam",request);
        	 break;
	    }

	}

}
