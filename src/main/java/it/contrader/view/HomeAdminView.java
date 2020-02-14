<<<<<<< HEAD
/**
 * Manage a Business Owner view
 */

package it.contrader.view;


/**
 * Per Ulteriori dettagli vedi Guida sez 9 View.
 * Per la descrizione dei metodi vedi l'interfaccia View in questo pacchetto.
 */
=======
package it.contrader.view;
>>>>>>> secretcode-console
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
<<<<<<< HEAD
        System.out.println("[U]tenti [T]team [A]Gestione utenti [P]Progetti [E]Esci");
=======
        System.out.println("[U]tenti [t]Gestioneutenti team [P]Progetti [E]Esci");
>>>>>>> secretcode-console
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
<<<<<<< HEAD
=======
        	this.request.put("mode", "USERLIST");
>>>>>>> secretcode-console
        	MainDispatcher.getInstance().callAction("User", "doControl", request);
        	break;
        case "e":
        	MainDispatcher.getInstance().callAction("Login", "doControl", null);
        	break;
        case "t":
<<<<<<< HEAD
        	MainDispatcher.getInstance().callView("Team", null);//
        	break;
        case "a":
        	MainDispatcher.getInstance().callView("AdminTeam", null);//Barbara:View che si collega ai team Randi
=======
        	MainDispatcher.getInstance().callView("AdminTeam", null);//Barbara:View che si collega al mio
>>>>>>> secretcode-console
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
<<<<<<< HEAD
}
=======
}
>>>>>>> secretcode-console
