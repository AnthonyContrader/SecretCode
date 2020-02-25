package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.UserConverter;
import it.contrader.dao.UserRepository;
import it.contrader.dto.UserDTO;
import it.contrader.model.User;
import it.contrader.converter.NewTeamConverter;
import it.contrader.dao.NewTeamRepository;
import it.contrader.dto.NewTeamDTO;
import it.contrader.model.NewTeamModel;


@Service
public class NewTeamService extends AbstractService<NewTeamModel, NewTeamDTO> {

	@Autowired
	private NewTeamConverter converter;
	@Autowired
	private NewTeamRepository repository;

	public NewTeamDTO findByIduserAndIdteam(int iduser, int idteam) {
		return converter.toDTO(repository.findByIduserAndIdteam( iduser, idteam));
	}

}
