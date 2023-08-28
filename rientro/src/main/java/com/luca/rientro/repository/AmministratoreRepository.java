package com.luca.rientro.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.luca.rientro.businesscomponent.model.Amministratore;

@Repository("amministratoreRepository")
public interface AmministratoreRepository extends MongoRepository<Amministratore, Long> {

	Optional<Amministratore> findByUsername(String username);
	List<Amministratore> findByNome(String nome);
	long count();
	
	@Query("{'cognome' : ?0}")
	List<Amministratore> findAmministratoreByCognome(String cognome);
}
