package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.TeamDTO;
import it.contrader.model.Team;

@Component
public class TeamConverter extends AbstractConverter<Team, TeamDTO> {

	@Override
	public Team toEntity(TeamDTO teamDTO) {
		Team team = null;
		if (teamDTO != null) {
			team = new Team(teamDTO.getIdt(), teamDTO.getNometeam(),teamDTO.getDescrizione(), teamDTO.getNumeroutenti(), teamDTO.getNumeroteam());
		}
		return team;
	}
	
	
	@Override
	public TeamDTO toDTO(Team team) {
		TeamDTO teamDTO = null;
		if ( team != null) {
			teamDTO = new TeamDTO(team.getIdt(), team.getNometeam(), team.getDescrizione(), team.getNumeroutenti(), team.getNumeroteam());
		}
		return teamDTO;
	}
}
