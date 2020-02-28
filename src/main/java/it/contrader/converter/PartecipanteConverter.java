package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.PartecipanteDTO;
import it.contrader.model.Partecipante;

@Component
public class PartecipanteConverter extends AbstractConverter<Partecipante, PartecipanteDTO>{
	
	@Override
	public Partecipante toEntity(PartecipanteDTO partecipanteDTO) {
		Partecipante partecipante = null;
		if(partecipanteDTO != null) {
			partecipante = new Partecipante(partecipanteDTO.getIdp(), partecipanteDTO.getNickname(), partecipanteDTO.getTeamnumero());
		}
		return partecipante;
	}
	
	@Override
	public PartecipanteDTO toDTO(Partecipante partecipante) {
		PartecipanteDTO partecipanteDTO = null;
		if (partecipante != null) {
			partecipanteDTO = new PartecipanteDTO(partecipante.getIdp(), partecipante.getNickname(), partecipante.getTeamnumero());
		}
		return partecipanteDTO;
	}
}