package com.luca.rientro.service;

import java.util.List;
import java.util.Optional;

import com.luca.rientro.businesscomponent.model.Amministratore;

public interface AmministratoreService {
	void saveAmministratore(Amministratore amministratore);
	List<Amministratore> getAll();
	Optional<Amministratore> findByUsername(String username); //Optional è un wrapper per un unico elemento, il vantaggio di utilizzarlo p che non ritornerà mai nullo in quanto al massimo avrò un optional vuoto
	void deleteAmministratore(Amministratore amministratore);
	
	//Operazioni customizzate
	List<Amministratore> findAmministratoreByNome(String nome);
	List<Amministratore> findAmministratoreByCognome(String cognome);
	Long count();
}
