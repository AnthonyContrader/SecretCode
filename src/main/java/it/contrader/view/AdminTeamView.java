package it.contrader.view;
import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

//Barbara: sta visualizzando il menu per gestire le opzioni team
public class AdminTeamView extends  AbstractView {

    private String choice;
    
	private Request request;
	
	 public void showOptions() {
	        System.out.println("-------------MENU------------\n");
	        System.out.println(" Seleziona cosa vuoi fare con i Team:");
	        System.out.println("[N]Insert new member [M]Upload new member [C]Delete member [V]Show member rule  [B]Back [E]Exit");
	       // Barbara: n va in New team
	        //Barbara:m va in MTeam modifica solo il ruolo
	        //Barbara:elimina utente solo dal team non in generale
	        choice = this.getInput();
	 }
	        public void submit() {    
	        	request = new Request();
	        switch (choice) {
	           case "n":
	        	   this.request.put("mode", "teamList"); //Barbara
	        	   MainDispatcher.getInstance().callView("InsNewTeam", null);// andrà collegata alla query di insert
	        	   break;
	           case "m":
	        	   this.request.put("mode", "teamList"); 
	        	   MainDispatcher.getInstance().callView("MTeam", null);// andrà collegata alla query di upload
	        	   break;
	           case "c":
	        	   this.request.put("mode", "teamList"); 
	        	   MainDispatcher.getInstance().callView("DeleteNewTeam",null);// andrà collegata alla query di delete
	        	   break;
	           case "v":
	        	   this.request.put("mode", "teamList");
	        	   MainDispatcher.getInstance().callView("ReadNewTeam", null);
	        	   break;
	           case "e":
	        	   MainDispatcher.getInstance().callView("Home", null);//Barbara:torna alla scelta del menu admin
	        	   break;
	           case "b":
	        	   MainDispatcher.getInstance().callView("HomeAdmin", null);//Barbara:torna alla scelta del menu admin
	        	   break;
	        	   default:
	        	   MainDispatcher.getInstance().callView("Home", null);//Barbara: vedi precedente
	        	   break;
	        	   }
	 }
			@Override
			public void showResults(Request request) {
				// TODO Auto-generated method stub
				
			}

}