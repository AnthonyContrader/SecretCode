package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.NewTeamConverter;

import it.contrader.dao.NewTeamRepository;

import it.contrader.dto.NewTeamDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.NewTeamModel;
import it.contrader.model.User;

@Service 
public class NewTeamService  extends AbstractService<NewTeamModel, NewTeamDTO>  {
		
	@Autowired
	private NewTeamConverter converter;

	@Autowired
	private NewTeamRepository repository;
	
	
	public NewTeamDTO findById(Long id) {
		return converter.toDTO(repository.findById( id ).get());
	}
	
	
	
}
