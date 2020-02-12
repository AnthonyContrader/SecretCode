package it.contrader.view;

import java.io.IOException;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeView extends AbstractView {

	//private String username;
	
	//private String password;

	//public void showResults(Request request) {

	//}
	private String cx;

     public void showOptions() {
	
	     System.out.println("----- .:1 LOGIN:. ----");
	     System.out.println("-----.:2 SIGN UP:.----");
			cx= this.getInput();
		
     }

	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		
	}

	public void submit() { //salva cx
		//request = new Request();
	    switch (cx){
        case "1":
        	//this.request.put("mode", "USERLIST");
        	MainDispatcher.getInstance().callAction("Login", "doControl", null);
        	break;
        case "2":
	    	   MainDispatcher.getInstance().callView("SignUp", null);
	    	   
	    break;
	    
	    }
	    
	}
    
}