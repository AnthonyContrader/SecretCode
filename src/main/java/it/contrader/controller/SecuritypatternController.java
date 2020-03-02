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
public class SecuritypatternController {
	
	@Autowired
	private SecuritypatternService service;
	
	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "securitypatterns";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("ids") Long ids) {
		service.delete(ids);
		setAll(request);
		return "securitypatterns";
	}
	
	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("ids") Long ids) {
		request.getSession().setAttribute("dto", service.read(ids));
		return "updatesecuritypattern";
	}
	
	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("ids") Long ids, @RequestParam("nome") String nome, @RequestParam("tipo") String tipo) {
		
		SecuritypatternDTO dto = new SecuritypatternDTO();
		dto.setIds(ids);
		dto.setNome(nome);
		dto.setTipo(tipo);
		service.insert(dto);
		setAll(request);
		return "securitypatterns";
	}
	
	@PostMapping("insert")
	public String insert(HttpServletRequest request, @RequestParam("nome") String nome, @RequestParam("tipo") String tipo) {
		
		SecuritypatternDTO dto = new SecuritypatternDTO();
		dto.setNome(nome);
		dto.setTipo(tipo);
		service.insert(dto);
		setAll(request);
		return "securitypatterns";
	}
	
	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("ids") Long ids) {
		request.getSession().setAttribute("dto", service.read(ids));
		return "readsecuritypattern";
	}
	
	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}
