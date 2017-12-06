package fr.afpa.filRouge.controller;

import fr.afpa.filRouge.model.User;
import fr.afpa.filRouge.service.SecurityService;
import fr.afpa.filRouge.service.ServiceUser;
import fr.afpa.filRouge.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
	public class SignInController {
    @Autowired
    private ServiceUser serviceUser;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        serviceUser.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
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
//}

