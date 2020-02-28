package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.PartecipanteDTO;
import it.contrader.service.PartecipanteService;

@Controller
@RequestMapping("/partecipanti")
public class PartecipanteController {
	
	@Autowired
	private PartecipanteService service;
	
	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "Partecipantes";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idp") Long idp) {
		service.delete(idp);
		setAll(request);
		return "partecipantes";
	}
	
	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("nickname") String nickname, @RequestParam("teamnumero") String teamnumero) {
		
		PartecipanteDTO dto = new PartecipanteDTO();
		dto.setNickname(nickname);
		dto.setTeamnumero(teamnumero);
		service.insert(dto);
		setAll(request);
		return "partecipantes";
	}
	
	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idp") Long idp, @RequestParam("nickname") String nickname, @RequestParam("/teamnumero") String teamnumero) {
		request.getSession().setAttribute("list", service.getAll());
		return "readpartecipante";
	}
	
	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list" , service.getAll());
	}
}
