<<<<<<< Updated upstream
<<<<<<< Updated upstream
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
	        System.out.println("[N]Crea nuovo Team [M]Modifica Team(nome e inserisci) [C]Cancella Team [V]Visualizza [E]Esci");
	       
	        choice = this.getInput();
	 }
	        public void submit() {    
	        	request = new Request();
	        switch (choice) {
	           case "n":
	        	   this.request.put("mode", "teamList"); //Barbara:questo manda la richiesta al converter di Randi
	        	   MainDispatcher.getInstance().callView("NewTeam", null);// andr� collegata alla query di insert
	        	   break;
	           case "m":
	        	   this.request.put("mode", "teamList"); //Barbara:questo manda la richiesta al converter di Randi
	        	   MainDispatcher.getInstance().callAction("Team","doConvert", request);// andr� collegata alla query di upload
	        	   break;
	           case "c":
	        	   this.request.put("mode", "teamList"); //Barbara:questo manda la richiesta al converter di Randi
	        	   MainDispatcher.getInstance().callAction("Team","doConvert", request);// andr� collegata alla query di delete
	        	   break;
	           case "v":
	        	   MainDispatcher.getInstance().callView("Team", null);//Barbara:visualizzazione team Randi
	        	   break;
	           case "e":
	        	   MainDispatcher.getInstance().callView("Home", null);//Barbara:torna alla scelta del menu admin
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
=======
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
	        System.out.println("[N]Crea nuovo Team [M]Modifica Team(nome e inserisci) [C]Cancella Team [V]Visualizza [E]Esci");
	       
	        choice = this.getInput();
	 }
	        public void submit() {    
	        	request = new Request();
	        switch (choice) {
	           case "n":
	        	   this.request.put("mode", "teamList"); //Barbara:questo manda la richiesta al converter di Randi
	        	   MainDispatcher.getInstance().callView("NewTeam", null);// andr� collegata alla query di insert
	        	   break;
	           case "m":
	        	   this.request.put("mode", "teamList"); //Barbara:questo manda la richiesta al converter di Randi
	        	   MainDispatcher.getInstance().callAction("Team","doConvert", request);// andr� collegata alla query di upload
	        	   break;
	           case "c":
	        	   this.request.put("mode", "teamList"); //Barbara:questo manda la richiesta al converter di Randi
	        	   MainDispatcher.getInstance().callAction("Team","doConvert", request);// andr� collegata alla query di delete
	        	   break;
	           case "v":
	        	   MainDispatcher.getInstance().callView("Team", null);//Barbara:visualizzazione team Randi
	        	   break;
	           case "e":
	        	   MainDispatcher.getInstance().callView("Home", null);//Barbara:torna alla scelta del menu admin
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
>>>>>>> Stashed changes
=======
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
	        System.out.println("[N]Inserisci utente nel team [M]Modifica utente del team [C]Cancella utente dal team [V]Visualizza utenti del team [E]Esci");
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
	        	   MainDispatcher.getInstance().callView("InsNewTeam", null);// andr� collegata alla query di insert
	        	   break;
	           case "m":
	        	   this.request.put("mode", "teamList"); 
	        	   MainDispatcher.getInstance().callView("MTeam", null);// andr� collegata alla query di upload
	        	   break;
	           case "c":
	        	   this.request.put("mode", "teamList"); 
	        	   MainDispatcher.getInstance().callView("DeleteNewTeam",null);// andr� collegata alla query di delete
	        	   break;
	           case "v":
	        	   this.request.put("mode", "teamList");
	        	   MainDispatcher.getInstance().callView("ReadNewTeam", null);
	        	   break;
	           case "e":
	        	   MainDispatcher.getInstance().callView("Home", null);//Barbara:torna alla scelta del menu admin
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
>>>>>>> Stashed changes
}