package fr.afpa.filRouge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignUpController {

	//affiche page signUp
	@GetMapping("sign_up")
	public String signUp(Model model) {
		return "sign_up";
	}
}
