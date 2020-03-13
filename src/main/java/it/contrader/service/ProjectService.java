package it.contrader.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ProjectConverter;
import it.contrader.dao.ProjectRepository;
import it.contrader.dto.ProjectDTO;
import it.contrader.model.Project;

@Service
public class ProjectService extends AbstractService<Project, ProjectDTO> {
	
	@Autowired
	private ProjectConverter converter;
	@Autowired
	private ProjectRepository repository;	
	
	public ProjectDTO findByNomeAndDescrizione(String nome, String descrizione) {
		return converter.toDTO(repository.findByNomeAndDescrizione(nome, descrizione));
	}


	
	
	
}

	

