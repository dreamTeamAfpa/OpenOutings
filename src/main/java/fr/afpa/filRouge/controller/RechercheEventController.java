package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RechercheEventController {
	
	//affiche page rechercheEvent
	@GetMapping("rechercheEvent")
	public String rechercheEvent(Model model) {
		return "rechercheEvent";
	}
}
