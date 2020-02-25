package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.UserDTO;
import it.contrader.model.User.Usertype;
import it.contrader.service.UserService;
import it.contrader.service.NewTeamService;
import it.contrader.dto.NewTeamDTO;

@Controller
@RequestMapping("/NewTeam")
public class NewTeamController {

	@Autowired
	private NewTeamService service;

		

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "utentiteam";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("iduser") Long iduser) {
		service.delete(iduser);
		setAll(request);
		return "homeadmin";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("iduser") Long iduser) {
		request.getSession().setAttribute("dto", service.read(iduser));
		return "updateuser";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("iduser") int iduser, @RequestParam("idteam") int idteam,
			 @RequestParam("usertype") String usertype) {

		NewTeamDTO dto = new NewTeamDTO();
		dto.setIduser(iduser);
		dto.setIdteam(idteam);
		dto.setUsertype(usertype);
		service.update(dto);
		setAll(request);
		return "homeadmin";

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("idteam") int idteam, @RequestParam("iduser") int iduser,
			 @RequestParam("usertype") String usertype) {
		NewTeamDTO dto = new NewTeamDTO();
		dto.setIduser(iduser);
		dto.setIdteam(idteam);
		dto.setUsertype(usertype);
		dto = service.insert(dto);
		setAll(request);
		
		return "homeadmin";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("iduser") Long iduser) {
		request.getSession().setAttribute("dto", service.read(iduser));
		return "readuser";
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
