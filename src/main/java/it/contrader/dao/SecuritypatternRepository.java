package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Securitypattern;

@Repository
@Transactional
public interface SecuritypatternRepository extends CrudRepository<Securitypattern, Long> {
	
	
	Securitypattern findByNomeAndTipo(String nome, String tipo);
	
}
