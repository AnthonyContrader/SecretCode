package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.PartecipanteConverter;
import it.contrader.dao.PartecipanteRepository;
import it.contrader.dto.PartecipanteDTO;
import it.contrader.model.Partecipante;

@Service
public class PartecipanteService extends AbstractService<Partecipante, PartecipanteDTO> {
	
	@Autowired
	private PartecipanteConverter converter;
	@Autowired
	private PartecipanteRepository repository;
	
	public PartecipanteDTO findByNicknameAndTeamnumero(String nickname, String teamnumero) {
		return converter.toDTO(repository.findByNicknameAndTeamnumero(nickname, teamnumero));
	}
}