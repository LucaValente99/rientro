package com.luca.rientro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luca.rientro.businesscomponent.model.Amministratore;
import com.luca.rientro.service.AmministratoreService;

@Controller
@RequestMapping("/admin")
public class AmministratoreController {
	
	@Autowired
	AmministratoreService amministratoreService;
	
	@GetMapping(value = {"", "/"})
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("amministratori", amministratoreService.getAll());
		mv.addObject("numeroAdmin", amministratoreService.count());
		return mv;
	}
	
	@GetMapping("/registraAmministratore")
	public ModelAndView registraAmministratore() {
		ModelAndView mv = new ModelAndView("registraAmministratore");
		mv.addObject("amministratore", new Amministratore());
		return mv;
	}
	
	@PostMapping("/registraAmministratore")
	public String registraAmministratore(Amministratore amministratore) {
		
		amministratoreService.saveAmministratore(amministratore);
				
		return "redirect:/admin/";
	}
}
