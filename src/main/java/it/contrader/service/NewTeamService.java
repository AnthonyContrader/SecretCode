package it.contrader.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.NewTeamConverter;
import it.contrader.converter.TeamConverter;
import it.contrader.converter.UserConverter;
import it.contrader.dao.NewTeamRepository;
import it.contrader.dao.TeamRepository;
import it.contrader.dao.UserRepository;
import it.contrader.dto.NewTeamDTO;
import it.contrader.dto.PairDTO;
import it.contrader.dto.TeamDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.NewTeamModel;
import it.contrader.model.Team;
import it.contrader.model.User;

@Service
public class NewTeamService {
		
	@Autowired
	private NewTeamConverter converter;
	@Autowired
	private UserConverter userConv;
	@Autowired
	private TeamConverter teamConv;
	@Autowired
	private NewTeamRepository repository;
	@Autowired
	private TeamRepository tRep;
	@Autowired
	private UserRepository uRep;
	
	
	public NewTeamDTO findById(Long id) {
		return converter.toDTO(repository.findById( id ).get());
	}
	
	public PairDTO<UserDTO, TeamDTO, String> getData(String username, String nometeam, String teamRole) {
		Team team = tRep.findByNometeam(nometeam);
		User user = uRep.findByUsername(username);
		PairDTO<UserDTO, TeamDTO, String> res = new PairDTO<UserDTO, TeamDTO, String>();
		res.setDto0(userConv.toDTO(user));
		res.setDto1(teamConv.toDTO(team));
		res.setData(teamRole);
		return res;
	}
	
	public PairDTO<UserDTO, TeamDTO, String> getData(Long idu, Long idt) {
		Team team = tRep.findById(idt).get();
		User user = uRep.findById(idu).get();
		PairDTO<UserDTO, TeamDTO, String> res = new PairDTO<UserDTO, TeamDTO, String>();
		res.setDto0(userConv.toDTO(user));
		res.setDto1(teamConv.toDTO(team));
		return res;
	}
	
	public List<PairDTO<UserDTO, TeamDTO, String>> getall(){
		Iterable<NewTeamModel> raw = repository.findAll();
		List<PairDTO<UserDTO, TeamDTO, String>> res = new ArrayList<PairDTO<UserDTO, TeamDTO, String>>();
		
		for(NewTeamModel x :  raw) {
			PairDTO<UserDTO, TeamDTO, String> nuovo = new PairDTO<UserDTO, TeamDTO, String>();
			nuovo.setDto0(userConv.toDTO(x.getUser()));
			nuovo.setDto1(teamConv.toDTO(x.getTeam()));
			nuovo.setData(x.getTeamRole());
			res.add(nuovo);
		}
		
		return res;
	}
	
	public void insert(String username, String nometeam, String teamRole){
	     User user= uRep.findByUsername(username);
	     Team team= tRep.findByNometeam(nometeam);
	     NewTeamModel res= new NewTeamModel();
	     res.setUser(user);
	     res.setTeam(team);
	     res.setTeamRole(teamRole);
	     repository.save(res);
	}
	public void delete(Long id) {
	     repository.deleteById(id);
	}
	
	public void update(Long id, String teamRole) {
		NewTeamModel res=repository.findById(id).get();
		res.setTeamRole(teamRole);
		repository.save(res);
		
	}
	
}
