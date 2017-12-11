package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserProfilController {
	
	// affiche page profil user
	@GetMapping("profiluser")
	public String profilUser(Model model) {
		return "UserProfil";
	}

	// affiche page modification profil
	@GetMapping("editprofilmembre")
	public String editprofil(Model model) {
		return "UserProfil";
		
	}
}
