
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

import it.contrader.dto.TeamDTO;
import it.contrader.service.TeamService;

@RestController 
@RequestMapping("/team")
@CrossOrigin(origins = "http://localhost:4200")
public class TeamController extends AbstractController<TeamDTO>{
		
	@Autowired
	private TeamService service;

}
