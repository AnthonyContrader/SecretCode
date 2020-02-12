package it.contrader.controller;

import it.contrader.main.MainDispatcher;

public class SignUpController implements Controller {
	public SignUpController() {
	}

	public void doControl (Request request) {
	
		MainDispatcher.getInstance().callView("Sign Up", request);
	}

}
