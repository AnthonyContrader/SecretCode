package it.contrader.view;
import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeAdminView extends AbstractView {

    private String choice;
    
	private Request request;

	/**
	 * Se la request non è nulla mostra un messaggio di benvenuto
	 */
    public void showResults(Request request) {
    	if(request!=null) {
    	System.out.println("\n Benvenuto in SAMPLE PROJECT "+request.get("username").toString() + "\n");
    	}
    }


    /**
     * Chiede all'utente di effettuare una scelta (da console)
     */
    public void showOptions() {
        System.out.println("-------------MENU------------\n");
        System.out.println(" Seleziona cosa vuoi gestire:");
        System.out.println("[U]tenti [t]Gestioneutenti team [P]Progetti [E]Esci");
        //Il metodo che salva l'input nella stringa choice.
        //getInput() è definito in AbstractView.
        choice = this.getInput();
    }

    /**
     * Impacchetta una request (in base alla scelta sarà diversa) che invia ai controller tramite il
     * Dispatcher
     */
    public void submit() {    
    	request = new Request();
        switch (choice) {
        case "u":
        	this.request.put("mode", "USERLIST");
        	MainDispatcher.getInstance().callAction("User", "doControl", request);
        	break;
        case "e":
        	MainDispatcher.getInstance().callAction("Login", "doControl", null);
        	break;
        case "t":
        	MainDispatcher.getInstance().callView("AdminTeam", null);//Barbara:View che si collega al mio
        	break;
        case "p":
        	MainDispatcher.getInstance().callView("ProjectManage", null);//Barbara:View che si collega al projetto Salvo
        	break;
        default:
        	 request.put("choice", choice);
        	MainDispatcher.getInstance().callAction("Login", "doControl", request);
        	break;
        }
    }
}
