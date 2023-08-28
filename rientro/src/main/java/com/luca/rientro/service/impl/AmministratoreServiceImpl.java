package com.luca.rientro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luca.rientro.businesscomponent.model.Amministratore;
import com.luca.rientro.repository.AmministratoreRepository;
import com.luca.rientro.service.AmministratoreService;

@Service("amministratoreService")
public class AmministratoreServiceImpl implements AmministratoreService{

	@Autowired
	private AmministratoreRepository amministratoreRepository;

	@Override
	public void saveAmministratore(Amministratore amministratore) {
		amministratoreRepository.save(amministratore);
	}

	@Override
	public List<Amministratore> getAll() {
		return amministratoreRepository.findAll();
	}

	@Override
	public Optional<Amministratore> findByUsername(String username) {
		return amministratoreRepository.findByUsername(username);
	}

	@Override
	public void deleteAmministratore(Amministratore amministratore) {
		amministratoreRepository.delete(amministratore);
	}

	@Override
	public List<Amministratore> findAmministratoreByNome(String nome) {
		return amministratoreRepository.findByNome(nome);
	}

	@Override
	public List<Amministratore> findAmministratoreByCognome(String cognome) {
		return amministratoreRepository.findAmministratoreByCognome(cognome);
	}

	@Override
	public Long count() {
		return amministratoreRepository.count();
	}
	
}
