package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RechcercheEventController {
	
	//affiche page rechercheEvent
	@GetMapping("")
	public String rechercheEvent(Model model) {
		return "";
	}
}
