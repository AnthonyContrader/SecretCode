package it.contrader.service;

import java.util.List;

import it.contrader.converter.TeamConverter;
import it.contrader.dao.TeamDAO;
import it.contrader.dto.TeamDTO;

<<<<<<< HEAD


//Zona

public class TeamService  {
=======
public class TeamService {
>>>>>>> 4cb375a96a02886ff2d80b58b223b929164b7000
	
	private TeamDAO teamDAO;
	private TeamConverter teamConverter;
	
<<<<<<< HEAD
	//Istanzio DAO  e Converter specifici.
	public TeamService(){
=======
	public TeamService() {
>>>>>>> 4cb375a96a02886ff2d80b58b223b929164b7000
		this.teamDAO = new TeamDAO();
		this.teamConverter = new TeamConverter();
	}
	
<<<<<<< HEAD

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
=======
	
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
	
>>>>>>> 4cb375a96a02886ff2d80b58b223b929164b7000

}
