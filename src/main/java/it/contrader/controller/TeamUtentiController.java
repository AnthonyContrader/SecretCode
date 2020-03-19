
package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.TeamUtentiDTO;
import it.contrader.service.TeamUtentiService;

@RestController 
@RequestMapping("/teamutenti")
@CrossOrigin(origins = "http://localhost:4200")
public class TeamUtentiController extends AbstractController<TeamUtentiDTO>{
		
	@Autowired
	private TeamUtentiService service;

}
