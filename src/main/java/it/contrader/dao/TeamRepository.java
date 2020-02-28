package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Team;

@Repository
@Transactional
public interface TeamRepository extends CrudRepository<Team, Long> {

	
		Team findByNometeamAndDescrizioneAndNumeroutentiAndNumeroteam(String nometeam, String descrizione, String numeroutenti, String numeroteam);
}
