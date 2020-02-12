package it.contrader.service;
import it.contrader.dao.SignUpDAO;
import it.contrader.model.User;

public class SignUpService {

	private SignUpDAO SignUpDAO;
	
	public SignUpService() {
		this.SignUpDAO = new SignUpDAO();
	}

	public boolean SignUp (String username, String password) {
		User us = new User(username, password, "");
		return this.SignUpDAO.SignUp(us);
	}
}
