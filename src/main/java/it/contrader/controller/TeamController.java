package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.TeamDTO;
import it.contrader.service.TeamService;

@Controller 
@RequestMapping("/team")
public class TeamController {
		
	@Autowired
	private TeamService service;
	
	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "teams";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("id") Long id ) {
		service.delete(id);
		setAll(request);
		return "teams";
	}
	
	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "updateteam";
	}
	
	@GetMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("nometeam") String nometeam,
		@RequestParam("descrizione") String descrizione , @RequestParam("numeroutenti") String numeroutenti	) {
		
		
		TeamDTO dto = new TeamDTO();
		dto.setNometeam(nometeam);
		dto.setDescrizione(descrizione);
		dto.setNumeroutenti(numeroutenti);
		service.update(dto);
		setAll(request);
		return "team";
	}
	
	@GetMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("nometeam") String nometeam,
		@RequestParam("descrizione") String descrizione, @RequestParam("numeroutenti") String numeroutenti) {
		
		TeamDTO dto = new TeamDTO();
		dto.setNometeam(nometeam);
		dto.setDescrizione(descrizione);
		dto.setNumeroutenti(numeroutenti);
		service.insert(dto);
		setAll(request);
		return "teams";
		
	}
	
	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "readteam";
	}
	
	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}
