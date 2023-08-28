package com.luca.rientro.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luca.rientro.businesscomponent.model.Amministratore;
import com.luca.rientro.service.AmministratoreService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "")
public class AmministratoreRestController {

	@Autowired
	private AmministratoreService amministratoreService;
	
	@GetMapping("/amministratori")
	public List<Amministratore> getAmministratori(){
		return amministratoreService.getAll();
	}
	
	@PostMapping("/saveAmministratore")
	public void saveAmministratore(@RequestBody Amministratore amministratore) {
		amministratoreService.saveAmministratore(amministratore);
	}
	
}
