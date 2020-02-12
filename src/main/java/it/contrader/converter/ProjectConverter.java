package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.ProjectDTO;
import it.contrader.model.Project;
//Salvo Furnari
public class ProjectConverter {
	//Conversion toDTO
	public ProjectDTO toDTO(Project project) {
		ProjectDTO projectDTO = new ProjectDTO(
				project.getId(), 
				project.getName(), 
				project.getUrl(), 
				project.getDescription()
		);
		return projectDTO;
	}
	//Conversion toEntity
	public Project toEntity(ProjectDTO projectDTO) {
		Project project = new Project(
				projectDTO.getId(), 
				projectDTO.getName(), 
				projectDTO.getUrl(), 
				projectDTO.getDescription()
		);
		return project;
	}
	//Conversion toDTOList
	public List<ProjectDTO> toDTOList(List<Project> projectList) {
		
		List<ProjectDTO> projectDTOList = new ArrayList<ProjectDTO>();
		
		for(Project project : projectList) {
			projectDTOList.add(toDTO(project));
		}
		
		return projectDTOList;
	}
	//Conversion toEntityList
	public List<Project> toEntityList(List<ProjectDTO> projectDTOList) {
		
		List<Project> projectList = new ArrayList<Project>();
		
		for(ProjectDTO projectDTO : projectDTOList) {
			projectList.add(toEntity(projectDTO));
		}
		
		return projectList;
	}
}