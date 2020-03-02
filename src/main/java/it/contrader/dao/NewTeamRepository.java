package it.contrader.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.NewTeamModel;

@Repository
@Transactional
public interface NewTeamRepository extends CrudRepository<NewTeamModel, Long> {

	Optional<NewTeamModel> findById(Long id);


}
