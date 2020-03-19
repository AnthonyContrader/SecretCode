package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.TeamUtenti;

@Repository
@Transactional
public interface TeamUtentiRepository extends CrudRepository<TeamUtenti, Long> {

	
		TeamUtenti findByNometeam(String nometeam);
		TeamUtenti findByUsername(String username);
		TeamUtenti findByNometeamAndUsername(String nometeam, String username);
		
}

