package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.NewTeamDTO;

import it.contrader.model.NewTeamModel;

@Component
public class NewTeamConverter extends AbstractConverter<NewTeamModel, NewTeamDTO> {

	@Override
	public NewTeamModel toEntity(NewTeamDTO newTeamDTO) {
		NewTeamModel newTeamModel= null;
		if (newTeamDTO != null) {
			newTeamModel = new NewTeamModel(newTeamModel.getId(), newTeamDTO.getIduser(), newTeamDTO.getIdteam(), newTeamDTO.getUsertype(), null);
		}
		return newTeamModel;
	}

	@Override
	public NewTeamDTO toDTO(NewTeamModel newTeamModel) {
		NewTeamDTO newTeamDTO = null;
		if (newTeamModel != null) {
			newTeamDTO = new NewTeamDTO(newTeamModel.getId(), newTeamModel.getIduser(),newTeamModel.getIdteam() , newTeamModel.getUsertype());

		}
		return newTeamDTO;
	}
}

//  genera id relazione devo reinserirlo? in entrambi i new