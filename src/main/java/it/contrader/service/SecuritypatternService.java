package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.SecuritypatternConverter;
import it.contrader.dao.SecuritypatternRepository;
import it.contrader.dto.SecuritypatternDTO;
import it.contrader.model.Securitypattern;

@Service
public class SecuritypatternService extends AbstractService<Securitypattern, SecuritypatternDTO> {
	
	@Autowired
	private SecuritypatternConverter converter;
	@Autowired
	private SecuritypatternRepository repository;
	
	public SecuritypatternDTO findByNomeAndTipo(String nome, String tipo) {
		return converter.toDTO(repository.findByNomeAndTipo(nome, tipo));
	}
}