<<<<<<< Updated upstream
package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.NewTeamDTO;
import it.contrader.model.NewTeamModel;

public class NewTeamConverter   {
	
	public NewTeamDTO toDTO(NewTeamModel newTeamModel ) {
		NewTeamDTO newTeamDTO = new NewTeamDTO(newTeamModel.getIduser(),  newTeamModel.getUsertype(), newTeamModel.getIdteam());
		return newTeamDTO;
	}


	public NewTeamModel toEntity(NewTeamDTO newTeamDTO) {
		NewTeamModel newTeamModel = new NewTeamModel(newTeamDTO.getIduser(), newTeamDTO.getUsertype(), newTeamDTO.getIdteam());
		return newTeamModel;
	}
	
	public List<NewTeamDTO> toDTOList(List<NewTeamModel> newTeamList) {
		List<NewTeamDTO> newTeamDTOList = new ArrayList<NewTeamDTO>();
		
		for(NewTeamModel newTeamModel : newTeamList) {
			newTeamDTOList.add(toDTO(newTeamModel));
		}
		return newTeamDTOList;
	}

	
	
}
=======
package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.NewTeamDTO;
import it.contrader.model.NewTeamModel;

public class NewTeamConverter   {
	
	public NewTeamDTO toDTO(NewTeamModel newTeamModel ) {
		NewTeamDTO newTeamDTO = new NewTeamDTO(newTeamModel.getIdteam(), newTeamModel.getIduser() , newTeamModel.getUsertype());
		return newTeamDTO;
	}


	public NewTeamModel toEntity(NewTeamDTO newTeamDTO) {
		NewTeamModel newTeamModel = new NewTeamModel(newTeamDTO.getIduser(), newTeamDTO.getIdteam(), newTeamDTO.getUsertype());
		return newTeamModel;
	}
	
	public List<NewTeamDTO> toDTOList(List<NewTeamModel> newTeamList) {
		List<NewTeamDTO> newTeamDTOList = new ArrayList<NewTeamDTO>();
		
		for(NewTeamModel newTeamModel : newTeamList) {
			newTeamDTOList.add(toDTO(newTeamModel));
		}
		return newTeamDTOList;
	}

	
	
}
>>>>>>> Stashed changes
