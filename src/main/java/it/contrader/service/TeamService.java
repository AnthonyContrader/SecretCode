package it.contrader.service;

import java.util.List;

import it.contrader.converter.TeamConverter;
import it.contrader.dao.TeamDAO;
import it.contrader.dto.TeamDTO;



//Zona

public class TeamService  {
	
	private TeamDAO teamDAO;
	private TeamConverter teamConverter;
	
	//Istanzio DAO  e Converter specifici.
	public TeamService(){
		this.teamDAO = new TeamDAO();
		this.teamConverter = new TeamConverter();
	}
	

	public List<TeamDTO> getAll() {
		// Ottiene una lista di entità e le restituisce convertendole in DTO
		return teamConverter.toDTOList(teamDAO.getall());
	}


	public TeamDTO read(int id) {
		// Ottiene un'entità e la restituisce convertendola in DTO
		return teamConverter.toDTO(teamDAO.read(id));
	}


	public boolean insert(TeamDTO dto) {
		// Converte un DTO in entità e lo passa al DAO per l'inserimento
		return teamDAO.insert(teamConverter.toEntity(dto));
	}


	public boolean update(TeamDTO dto) {
		// Converte un userDTO in entità e lo passa allo userDAO per la modifica
		return teamDAO.update(teamConverter.toEntity(dto));
	}


	public boolean delete(int id) {
		// Questo mtodo chiama direttamente il DAO
		return teamDAO.delete(id);
	}

}
