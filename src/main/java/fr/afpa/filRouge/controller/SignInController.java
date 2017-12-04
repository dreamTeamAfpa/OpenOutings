package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignInController {
	
	//affiche page signIn
	@GetMapping("sign_in")
	public String signIn(Model model) {
		return "sign_in";
	}

}