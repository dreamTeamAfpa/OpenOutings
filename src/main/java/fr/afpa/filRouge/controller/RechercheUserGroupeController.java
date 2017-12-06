package fr.afpa.filRouge.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.service.ServiceGroupe;

@Controller
@RequestMapping("/")
public class RechercheUserGroupeController {
	private ServiceGroupe serviceGroup;
	
	//affiche la page rechercheUserGroupe
	@GetMapping("rechercheUserGroupe")
	public String rechercheUserGroupe(Model model,@RequestParam(value = "iChoixLieux") String lieux,
			@RequestParam(value = "iChoixGroupe") String themGroup,
			@RequestParam(value = "pseudo") String pseudo ) {
	//	int idGroup = 0;
		
	ArrayList<Groupe> groupe = serviceGroup.getAllGroup();
		model.addAttribute("nameGroup",groupe);
		return "/rechercheUserGroupe";
	}
	

}
