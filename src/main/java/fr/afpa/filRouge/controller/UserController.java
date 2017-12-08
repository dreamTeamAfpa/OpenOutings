package fr.afpa.filRouge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.service.IservicePerson;

@Controller
@RequestMapping("/")
public class UserController {
	
	//@Autowired
	private IservicePerson serviceperson;
	
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
	
	@PostMapping("signIn")
	public String postSignIn(Model model,@RequestParam(value = "username") String pseudoUser
			,@RequestParam(value = "password") String passwordUser) {
		
		int idUser=1;
		Person person = serviceperson.getOne(idUser);
		System.out.println(person.toString());
		
		if (serviceperson.findByPseudoUserAndPasswordUser(pseudoUser, passwordUser) == null ) {

		return "sign_in";
		}
		
		
		return "index_logged";
		
	}

}
