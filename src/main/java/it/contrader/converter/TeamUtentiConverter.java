
package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.TeamUtentiDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.TeamUtenti;

@Component
public class TeamUtentiConverter extends AbstractConverter<TeamUtenti, TeamUtentiDTO> {

	@Override
	public TeamUtenti toEntity(TeamUtentiDTO teamUtentiDTO) {
		TeamUtenti teamUtenti = null;
		if (teamUtentiDTO != null) {
			teamUtenti = new TeamUtenti( null, teamUtentiDTO.getNometeam(),teamUtentiDTO.getUsername(), null);
		}
		return teamUtenti;
	}
	
	
	@Override
	public TeamUtentiDTO toDTO(TeamUtenti teamUtenti) {
		TeamUtentiDTO teamUtentiDTO = null;
		if ( teamUtenti != null) {
			teamUtentiDTO = new TeamUtentiDTO( teamUtentiDTO.getId(), teamUtentiDTO.getNometeam(),teamUtentiDTO.getUsername());
		}
		return teamUtentiDTO;
	}
}

