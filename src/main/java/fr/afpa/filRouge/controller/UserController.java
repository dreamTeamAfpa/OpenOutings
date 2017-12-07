package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
	
	//affiche page signUp
	@GetMapping("signUp")
	public String signUp(Model model) {
		return "sign_up";
	}
	
	//affiche page signIn
	@GetMapping("signIn")
	public String signIn(Model model) {
		return "sign_in";
	}

}
