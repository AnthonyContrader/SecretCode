package it.contrader.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ProjectConverter;
import it.contrader.converter.TeamConverter;
import it.contrader.dao.ProjectRepository;
import it.contrader.dao.TeamRepository;
import it.contrader.dto.PairDTO;
import it.contrader.dto.ProjectDTO;
import it.contrader.dto.TeamDTO;
import it.contrader.model.Project;
import it.contrader.model.Team;

@Service
public class ProjectService extends AbstractService<Project, ProjectDTO> {
	
	@Autowired
	private ProjectConverter converter;
	@Autowired
	private ProjectRepository repository;
	
	@Autowired
	private TeamConverter tcon;
	@Autowired
	private TeamRepository tRep;
	
	
	
	public ProjectDTO findByNomeAndDescrizione(String nome, String descrizione) {
		return converter.toDTO(repository.findByNomeAndDescrizione(nome, descrizione));
	}

	public PairDTO<ProjectDTO, TeamDTO, String> getData(Long idc, Long idt) {
		Team team = tRep.findById(idt).get();
		Project project = repository.findById(idc).get();
		PairDTO<ProjectDTO, TeamDTO, String> res = new PairDTO<ProjectDTO, TeamDTO, String>();
		res.setDto0(converter.toDTO(project));
		res.setDto1(tcon.toDTO(team));
		return res;
	}
	public PairDTO<ProjectDTO, TeamDTO, String> getData(String nome, String nometeam, String descrizione) {
		Team team = tRep.findByNometeam(nometeam);
		Project project = repository.findByNome(nome);
		PairDTO<ProjectDTO, TeamDTO, String> res = new PairDTO<ProjectDTO, TeamDTO, String>();
		res.setDto0(converter.toDTO(project));
		res.setDto1(tcon.toDTO(team));
		res.setData(descrizione);
		return res;
	}
	public List<PairDTO<ProjectDTO, TeamDTO, String>> getall(){
		Iterable<Project> raw = repository.findAll();
		List<PairDTO<ProjectDTO, TeamDTO, String>> res = new ArrayList<PairDTO<ProjectDTO, TeamDTO, String>>();
		
		for(Project x :  raw) {
			PairDTO<ProjectDTO, TeamDTO, String> nuovo = new PairDTO<ProjectDTO, TeamDTO, String>();
			nuovo.setDto0(converter.toDTO(x));
			nuovo.setDto1(tcon.toDTO(x.getTeams()));
			nuovo.setData(x.getDescrizione());
			res.add(nuovo);
		}
		
		return res;
	}
	
	public void insert(String nome, String nometeam, String descrizione){
	     Project project= repository.findByNome(nome);
	     Team team= tRep.findByNometeam(nometeam);
	     Project res= new Project();
	     res.setNome(nome);
	     res.setTeams(team);
	     res.setDescrizione(descrizione);
	     repository.save(res);
	}
	public void delete(Long id) {
	     repository.deleteById(id);
	}
	
	
	
}

	

