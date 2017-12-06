package fr.afpa.filRouge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.afpa.filRouge.model.User;
import fr.afpa.filRouge.service.SecurityService;
import fr.afpa.filRouge.service.ServiceUser;
import fr.afpa.filRouge.validator.UserValidator;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private ServiceUser serviceUser;
	@Bean
	public ServiceUser serviceUser() {
		return this.serviceUser();
	}
	
	@Autowired
	private SecurityService securityService;

	
	
	@Autowired
	private UserValidator userValidator;

	//affiche pas de création user
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "signIn";
    }

	//post form création user
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "signUp";
        }
        serviceUser.addUser(userForm);
        securityService.autologin(userForm.getPseudoUser(), userForm.getPasswordUser());

        return "redirect:/index_logged";
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "index_logged";
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "index";
    }
    
	// affiche page profil user
	@GetMapping("profiluser")
	public String profilUser(Model model) {
		return "UserProfil";
	}
}



// PREVIOUS VERSION
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import fr.afpa.filRouge.model.User;
//import fr.afpa.filRouge.service.ServiceUser;
//
//@Controller
//@RequestMapping("/")
//public class SignInController {
//	public ServiceUser serviceUser;
//
//	// affiche page signIn
//	@GetMapping("sign_in")
//	public String signIn(Model model) {
//		return "sign_in";
//	}
//
//	// Traitement du sign in
//	@PostMapping("sign_in/")
//	public String validateSignIn(Model model, @RequestParam(value = "username") String username,
//			@RequestParam(value = "password") String password) {
//
//		User user = serviceUser.findOneByUsername(username);
//		if (!user.equals(null)) {
//			if (user.getPasswordUser() == password) {
//				return "index";
//				// return page accueil connecté
//			} else {
//				String message = "Votre mot de passe n'est pas correct";
//				model.addAttribute("messageReturn", message);
//
//				return "sign_in";
//				// return message mot de pass incorrect.
//			}
//		} else {
//			String message = "Ce compte n'a pas ete trouvé";
//			model.addAttribute("messageReturn", message);
//			return "sign_in";
//			// return compte non trouvé
//		}
//	}

