package it.contrader.controller;

import it.contrader.main.MainDispatcher;
import it.contrader.service.SignUpService;

public class SignUpController implements Controller {
	
	private SignUpService service;
	
	public SignUpController() {
		this.service = new SignUpService();
	}
	
	private String password;
	private String username;

	public void doControl (Request request) {
		String cx=request.get("cx").toString();
	    switch (cx){
        case "1":
        	//this.request.put("mode", "USERLIST");
        	MainDispatcher.getInstance().callView("Login", null);
        	break;
        case "2":
	    	   MainDispatcher.getInstance().callView("SignUp", null);
	    break;
        case "3":
        	 this.password = request.get("password").toString();
        	 this.username = request.get("username").toString();
        	 if (this.service.SignUp(username, password))
        		 MainDispatcher.getInstance().callAction("Login","doControl",request);
	    }

	}

}
