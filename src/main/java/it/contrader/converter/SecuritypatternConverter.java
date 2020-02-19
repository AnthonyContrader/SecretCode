package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.SecuritypatternDTO;
import it.contrader.dto.TeamDTO;
import it.contrader.model.Securitypattern;
import it.contrader.model.Team;

public class SecuritypatternConverter {

	public SecuritypatternDTO toDTO(Securitypattern securitypattern) {
		SecuritypatternDTO securitypatternDTO = new SecuritypatternDTO(securitypattern.getId(), securitypattern.getNome(), securitypattern.getTipo());
		return securitypatternDTO;
	}
	
public Securitypattern toEntity(SecuritypatternDTO securitypatternDTO) {
	Securitypattern securitypattern = new Securitypattern(securitypatternDTO.getId(), securitypatternDTO.getNome(), securitypatternDTO.getTipo());
	return securitypattern;
}
	
	
	public List<SecuritypatternDTO> toDTOList(List<Securitypattern> securitypatternList){
		
		List<SecuritypatternDTO> securitypatternDTOList = new ArrayList<SecuritypatternDTO>();
		
		
		for(Securitypattern securitypattern : securitypatternList) {
			
			securitypatternDTOList.add(toDTO(securitypattern));
		}
		return securitypatternDTOList;
	
	}
	
}
