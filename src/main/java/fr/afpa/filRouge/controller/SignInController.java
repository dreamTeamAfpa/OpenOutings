package fr.afpa.filRouge.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.User;
import fr.afpa.filRouge.service.ServiceUser;

@Controller
@RequestMapping("/")
public class SignInController {
	public ServiceUser serviceUser;

	// affiche page signIn
	@GetMapping("sign_in")
	public String signIn(Model model) {
		return "sign_in";
	}


	// Balthazar's option
	// Traitement du sign in 
//	@GetMapping("validateSignIn/")
//	public String validateSignIn(HttpServletRequest request, HttpServletResponse response) {
//
//		String password = request.getParameter("password");
//		String username = request.getParameter("username");
//
//		User user = serviceUser.findOneByUsername(username);
//		if (!user.equals(null)) {
//			if (user.getPasswordUser() == password) {
//				return "index";
//				// return page accueil connecté
//			} else {
//				request.setAttribute("message", "Vottre mot de passe n'est pas correct");
//				return "sign_in";
//				// return message mot de pass incorrect.
//			}
//		} else {
//			request.setAttribute("message", "Ce compte n'a pas ete trouvé");
//			return "sign_in";
//			// return compte non trouvé
//		}
//
//		return validateSignIn;
//	}
	
	// Raynald's option
	// Traitement du sign in
	@PostMapping("sign_in/")
	public String validateSignIn(Model model,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		User user = serviceUser.findOneByUsername(username);
		if (!user.equals(null)) {
			if (user.getPasswordUser() == password) {
				return "index";
				// return page accueil connecté
			} else {
				String message = "Votre mot de passe n'est pas correct";
				model.addAttribute("messageReturn", message);
				
				return "sign_in";
				// return message mot de pass incorrect.
			}
		} else {
			String message = "Ce compte n'a pas ete trouvé";
			model.addAttribute("messageReturn", message);
			return "sign_in";
			// return compte non trouvé
		}
		
	}
}
