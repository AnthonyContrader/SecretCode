package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.TeamUtentiConverter;
import it.contrader.dao.TeamUtentiRepository;
import it.contrader.dto.TeamUtentiDTO;
import it.contrader.model.TeamUtenti;

@Service
public class TeamUtentiService extends AbstractService<TeamUtenti, TeamUtentiDTO> {
		
	@Autowired
	private TeamUtentiConverter converter;
	@Autowired
	private TeamUtentiRepository repository;
	
	public TeamUtentiDTO findByNometeamAndUsername(String nometeam, String username) {
		return converter.toDTO(repository.findByNometeamAndUsername(nometeam, username));
	}
}
