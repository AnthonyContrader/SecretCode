package it.contrader.service;

import java.util.List;

import it.contrader.converter.TeamConverter;
import it.contrader.dao.TeamDAO;
import it.contrader.dto.TeamDTO;

public class TeamService {
	
	private TeamDAO teamDAO;
	private TeamConverter teamConverter;
	
	public TeamService() {
		this.teamDAO = new TeamDAO();
		this.teamConverter = new TeamConverter();
	}
	
	
	public List<TeamDTO> getAll() {
		
		return teamConverter.toDTOList(teamDAO.getall());
	}
	
	public TeamDTO read(int id) {
		
		return teamConverter.toDTO(teamDAO.read(id));
	}
	
	public boolean insert(TeamDTO dto) {
		
		return teamDAO.insert(teamConverter.toEntity(dto));
	}
	
	public boolean update(TeamDTO dto) {
		
		return teamDAO.update(teamConverter.toEntity(dto));
	}
	
	public boolean delete(int id) {
		
		return teamDAO.delete(id);
	}
	

}
