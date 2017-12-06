package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GroupeController {
	
	//affiche la page rechercheUserGroupe
	@GetMapping("rechercheUserGroupe")
	public String rechercheUserGroupe(Model model) {
		return "rechercheUserGroupe";
	}

}
