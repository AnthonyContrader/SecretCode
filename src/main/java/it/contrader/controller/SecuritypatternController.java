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

import it.contrader.dto.SecuritypatternDTO;
import it.contrader.service.SecuritypatternService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/securitypattern")
public class SecuritypatternController extends AbstractController<SecuritypatternDTO> {
	
	@Autowired
	private SecuritypatternService service;
	
	
}
