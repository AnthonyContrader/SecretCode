package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.NewTeamDTO;
import it.contrader.service.NewTeamService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/NewTeam")
public class NewTeamController extends AbstractController<NewTeamDTO>{

	@Autowired
	private NewTeamService service;
	
}




	

