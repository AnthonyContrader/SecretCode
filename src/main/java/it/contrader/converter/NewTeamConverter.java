package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.NewTeamDTO;
import it.contrader.model.NewTeamModel;

@Component
public class NewTeamConverter extends AbstractConverter<NewTeamModel, NewTeamDTO> {

	@Override
	public NewTeamModel toEntity(NewTeamDTO newTeamDTO) {
		NewTeamModel newTeamModel = null;
		if (newTeamDTO != null) {
			newTeamModel = new NewTeamModel(newTeamDTO.getId(),   newTeamDTO.getTeamRole(), null, null);
		}
		return newTeamModel;
	}

	@Override
	public NewTeamDTO toDTO(NewTeamModel newTeamModel) {
		NewTeamDTO newTeamDTO = null;
		if (newTeamModel != null) {
			newTeamDTO = new NewTeamDTO(newTeamModel.getId(), newTeamModel.getTeamRole(), null, null);

		}
		return newTeamDTO;
	}
}