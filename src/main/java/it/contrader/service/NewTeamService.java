package it.contrader.service;



import it.contrader.converter.NewTeamConverter;
import it.contrader.dao.NewTeamDAO;
import it.contrader.dto.NewTeamDTO;

public class NewTeamService {
	
	private NewTeamDAO newTeamDAO;
	private NewTeamConverter newTeamConverter;
	
	
	public NewTeamService(){
		this.newTeamDAO = new NewTeamDAO();
		this.newTeamConverter = new NewTeamConverter();
	}
	
	public NewTeamDTO read(int iduser) {
		return newTeamConverter.toDTO(newTeamDAO.read(iduser));
	}


	public boolean insert(NewTeamDTO dto) {
		return newTeamDAO.insert(newTeamConverter.toEntity(dto));
	}


	public boolean update(NewTeamDTO dto) {
		return newTeamDAO.update(newTeamConverter.toEntity(dto));
	}


	public boolean delete(NewTeamDTO dto) {
		return newTeamDAO.delete(newTeamConverter.toEntity(dto));
	}
	

}
		
		