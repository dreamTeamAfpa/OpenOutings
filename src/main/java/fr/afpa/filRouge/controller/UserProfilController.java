package fr.afpa.filRouge.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.service.IserviceInterest;

@Controller
@RequestMapping("/")
public class UserProfilController {

	@Autowired
	private IserviceInterest serviceInterest;

	// affiche page profil user
	@GetMapping("profiluser")
	public String profilUser(Model model) {
		return "UserProfil";
	}

	// affiche page modification profil
	@GetMapping("editprofilmembre")
	public String listInterest(Model model) {
		ArrayList<Interest> interests = serviceInterest.getAll();
		model.addAttribute("interests", interests);

		return "UserProfil";

	}
}
