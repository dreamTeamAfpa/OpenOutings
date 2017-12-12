package fr.afpa.filRouge.controller;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.service.IservicePerson;

@Scope("session")
@Controller
@RequestMapping("/")
public class UserController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Person person;
	private String message;
	@Autowired
	private IservicePerson serviceperson;

	// affiche page signUp
	@GetMapping("signUp")
	public String signUp(Model models) {
		return "sign_up";
	}

	// validation inscription
	@PostMapping("inscription")
	public String inscription(HttpSession httpSession, Model model,@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password,
			@RequestParam(value = "passwordVerif") String passwordVerif, @RequestParam(value = "email") String email) {
		if ((password.equals(passwordVerif) != true)) {
			message = "les mots de passes ne sont pas identiques";
			model.addAttribute("message", message);
			return "sign_up";
		} else if (serviceperson.findByPseudoUser(username) != null) {
			message = "ce nom d'utilisateur est déjà utilisé";
			model.addAttribute("message", message);
			return "sign_up";
		} else if (serviceperson.findByEmailUser(email) != null) {
			message = "cet email existe déjà dans nos contacts";
			model.addAttribute("message", message);
			return "sign_up";
		} else {
			person = new Person(username, password, email);
			serviceperson.addPerson(person);
			message = "Bienvenue chez les Outers !";
			model.addAttribute("message", message);
			model.addAttribute("person", person);
			httpSession.setAttribute("personSession", person);
			System.out.println(httpSession.getId()); 
			return "index_logged";
		}
	}

	// affiche page signIn
	@GetMapping("signIn")
	public String signIn(Model model) {
		return "sign_in";
	}

	@PostMapping("connexion")
	public String postSignIn(HttpSession httpSession, Model model, @RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		if (serviceperson.findByPseudoUserAndPasswordUser(username, password) == null) {
			person = serviceperson.findByPseudoUserAndPasswordUser(username, password);
			message = "Erreur de connexion !";
			model.addAttribute("message", message);
			return "sign_in";
		}
		person = serviceperson.findByPseudoUserAndPasswordUser(username, password);
		model.addAttribute(person);
		httpSession.setAttribute("personSession", person);
		
		return "index_logged";
	}

}
