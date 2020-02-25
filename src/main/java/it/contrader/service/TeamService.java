package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.TeamConverter;
import it.contrader.dao.TeamRepository;
import it.contrader.dto.TeamDTO;
import it.contrader.model.Team;

@Service
public class TeamService extends AbstractService<Team, TeamDTO> {
		
	@Autowired
	private TeamConverter converter;
	@Autowired
	private TeamRepository repository;
	
	public TeamDTO findByNometeamAndDescrizioneAndNumeroutenti(String nometeam, String descrizione, String numeroutenti) {
		return converter.toDTO(repository.findByNometeamAndDescrizioneAndNumeroutenti(nometeam, descrizione ,numeroutenti));
	}
}
