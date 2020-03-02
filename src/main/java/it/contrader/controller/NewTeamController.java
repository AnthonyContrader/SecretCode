package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.NewTeamDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.User.Usertype;
import it.contrader.service.NewTeamService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/NewTeam")
public class NewTeamController {

	@Autowired
	private NewTeamService service;


	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getall());
		return "NewTeam";
	}
	
	@GetMapping("/getpair")
	public String getPair(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("nometeam") String nometeam,  @RequestParam("teamRole") String teamRole) {
		request.getSession().setAttribute("dto", service.getData(username, nometeam, teamRole));
		return "NewTeam";
	}
	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("nometeam") String nometeam,  @RequestParam("teamRole") String teamRole) {
    service.insert(username, nometeam, teamRole);
	getAll(request);
	return "NewTeam";
	}
	
	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.findById(id));
		return "MNewTeam";
	}
	@PutMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("id") Long id,@RequestParam("teamRole") String teamRole) {
		service.update(id,teamRole);
		getAll(request);
        return "NewTeam";
	}
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("id") Long id) {
		service.delete(id);
		getAll(request);
		return "NewTeam";
	}
	
}
