package it.contrader.converter;



import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.TeamDTO;
import it.contrader.model.Team;

public class TeamConverter {

	public TeamDTO toDTO(Team team) {
		TeamDTO teamDTO = new TeamDTO(team.getId(), team.getNometeam(), team.getDescrizione(), team.getNumeroutenti());
		return teamDTO;
	}
	
public Team toEntity(TeamDTO teamDTO) {
	Team team = new Team(teamDTO.getId(), teamDTO.getNometeam(), teamDTO.getDescrizione(), teamDTO.getNumeroutenti());
	return team;
}
	
	
	public List<TeamDTO> toDTOList(List<Team> teamList){
		
		List<TeamDTO> teamDTOList = new ArrayList<TeamDTO>();
		
		
		for(Team team : teamList) {
			
			teamDTOList.add(toDTO(team));
		}
		return teamDTOList;
	
	}
	
	
	
	


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
