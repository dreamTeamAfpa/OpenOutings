package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

	// affiche page index
	@GetMapping({"","index"})
	public String index(Model model) {
		return "index";
	}
	
	
	// affiche page menu
	@GetMapping("menu")
	public String menu(Model model) {
		return "menu";
	}

}

