package it.contrader.service;

import java.util.List;

import it.contrader.converter.ProjectConverter;
import it.contrader.dao.ProjectDAO;
import it.contrader.dto.ProjectDTO;
//Salvo Furnari
public class ProjectService {
	
	//props
	private ProjectDAO 		 projectDAO;
	private ProjectConverter projectConverter;
	//Contructor
	public ProjectService() {
		this.projectDAO 	  = new ProjectDAO();
		this.projectConverter = new ProjectConverter();
	}
	//All
	public List<ProjectDTO> getAll() {
		return projectConverter.toDTOList(projectDAO.getAll());
	}
	//Create
	public boolean create(ProjectDTO projectDTO) {
		return (this.projectDAO
				.create(this.projectConverter
				.toEntity(projectDTO)));
	}
	//Read
	public ProjectDTO read(int id) {
		return this.projectConverter.toDTO(this.projectDAO.read(id));
	}
	//Update
	public boolean update(ProjectDTO projectDTO) {
		return this.projectDAO
				.update(this.projectConverter
				.toEntity(projectDTO));
	}
	//Delete
	public boolean delete(int id) {
		return this.projectDAO.delete(id);
	}
	
}
