package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.ProjectDTO;
import it.contrader.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	
	@Autowired
	private ProjectService service;
	
	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "projects";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idc") Long idc) {
		service.delete(idc);
		setAll(request);
		return "projects";
	}
	
	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("nome") String nome, @RequestParam("descrizione") String descrizione) {
		
		ProjectDTO dto = new ProjectDTO();
		dto.setNome(nome);
		dto.setDescrizione(descrizione);
		service.insert(dto);
		setAll(request);
		return "projects";
	}
	
	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idc") Long idc) {
		
		request.getSession().invalidate();
		return "readproject";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "index";
	}
	
	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}