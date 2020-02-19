package it.contrader.service;

import java.util.List;

import it.contrader.converter.SecuritypatternConverter;
import it.contrader.dao.SecuritypatternDAO;
import it.contrader.dto.SecuritypatternDTO;




//zona

public class SecuritypatternService {
	
	
	private SecuritypatternDAO securitypatternDAO;
	private SecuritypatternConverter securitypatternConverter;
	
	//Istanzio DAO  e Converter specifici.
	public SecuritypatternService() {
		this.securitypatternDAO = new SecuritypatternDAO();
		this.securitypatternConverter = new SecuritypatternConverter();
	}
	

	public List<SecuritypatternDTO> getAll() {
		// Ottiene una lista di entità e le restituisce convertendole in DTO
		return securitypatternConverter.toDTOList(securitypatternDAO.getall());
	}


	public SecuritypatternDTO read(int id) {
		// Ottiene un'entità e la restituisce convertendola in DTO
		return securitypatternConverter.toDTO(securitypatternDAO.read(id));
	}


	public boolean insert(SecuritypatternDTO dto) {
		// Converte un DTO in entità e lo passa al DAO per l'inserimento
		return securitypatternDAO.insert(securitypatternConverter.toEntity(dto));
	}


	public boolean update(SecuritypatternDTO dto) {
		// Converte un userDTO in entità e lo passa allo userDAO per la modifica
		return securitypatternDAO.update(securitypatternConverter.toEntity(dto));
	}


	public boolean delete(int id) {
		// Questo mtodo chiama direttamente il DAO
		return securitypatternDAO.delete(id);
	}
}
