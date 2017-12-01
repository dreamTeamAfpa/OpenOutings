package fr.afpa.filRouge.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.service.ServiceGroupe;

@Controller
@RequestMapping("/")
public class RechercheUserGroupeController {
	private ServiceGroupe serviceGroup;
	
	//affiche la page rechercheUserGroupe
	@GetMapping("rechercheUserGroupe")
	public String rechercheUserGroupe(Model model) {
	//	int idGroup = 0;
	//	Groupe groupe = serviceGroup.getOneGroup(idGroup);
		model.addAttribute("nameGroup","nomdugroupe");
		return "/rechercheUserGroupe";
	}
	

}
