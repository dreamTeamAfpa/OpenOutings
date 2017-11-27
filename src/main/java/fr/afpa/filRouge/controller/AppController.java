package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {

	// affiche page index
	@GetMapping("")
	public String index(Model model) {
		return "index";
	}
	@GetMapping("UserProfil")
	public String UserProfil(Model model) {
		return "UserProfil";
	}
	@GetMapping("VisitorProfil")
	public String VisitorProfil(Model model) {
		return "VisitorProfil";
	}
}
