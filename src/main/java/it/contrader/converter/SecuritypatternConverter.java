package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.SecuritypatternDTO;
import it.contrader.model.Securitypattern;

@Component
public class SecuritypatternConverter extends AbstractConverter<Securitypattern, SecuritypatternDTO> {
	
	
	@Override 
	public Securitypattern toEntity(SecuritypatternDTO securitypatternDTO) {
		Securitypattern securitypattern = null;
		if (securitypatternDTO != null) {
			securitypattern = new Securitypattern(securitypatternDTO.getIds(), securitypatternDTO.getNome(), securitypatternDTO.getTipo());
		}
		return securitypattern;
	}
	
	@Override 
	public SecuritypatternDTO toDTO(Securitypattern securitypattern) {
		SecuritypatternDTO securitypatternDTO = null;
		if (securitypattern != null) {
			securitypatternDTO = new SecuritypatternDTO(securitypattern.getIds(), securitypattern.getNome(), securitypattern.getTipo());
		}
		return securitypatternDTO;
	}
}