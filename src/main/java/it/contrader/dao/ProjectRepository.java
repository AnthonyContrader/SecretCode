package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Project;

@Repository
@Transactional
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	Project findByNomeAndDescrizione(String nome, String descrizione);
	Project findByNome(String nome);
}
