package it.contrader.controller;

import javax.persistence.OneToOne;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.ProjectDTO;
import it.contrader.service.ProjectService;


@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController extends AbstractController<ProjectDTO>{
	
	
	@Autowired
	private ProjectService service;
	
	
}
