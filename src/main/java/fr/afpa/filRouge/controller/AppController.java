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
	// affiche page profil user
		@GetMapping("profiluser")
		public String profilUser(Model model) {
			return "UserProfil";
		}

		//affiche page menu
		@GetMapping("menu")
		public String menu(Model model) {
			return "menu";
		}
}
