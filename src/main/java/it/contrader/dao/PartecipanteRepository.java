package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Partecipante;

@Repository
@Transactional
public interface PartecipanteRepository extends CrudRepository<Partecipante, Long> {
	
	
	
	Partecipante findByNicknameAndTeamnumero(String nickname, String teamnumero);
}
