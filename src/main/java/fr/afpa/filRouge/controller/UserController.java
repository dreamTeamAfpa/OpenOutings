package fr.afpa.filRouge.controller;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.service.IserviceEvent;
import fr.afpa.filRouge.service.IserviceGroupe;
import fr.afpa.filRouge.service.IserviceInterest;
import fr.afpa.filRouge.service.IserviceLocation;
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
	public String inscription(HttpSession httpSession, Model model, @RequestParam(value = "username") String username,
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

	@Autowired
	private IserviceInterest serviceInterest;

	@Autowired
	private IserviceLocation serviceLocation;

	@Autowired
	private IserviceEvent serviceEvent;

	@Autowired
	private IserviceGroupe serviceGroupe;

	// affiche page profil non editable
	@GetMapping("profilmembre")
	public String listInfos(Model model) {
		ArrayList<Interest> interests = serviceInterest.getAll();
		ArrayList<Locations> locations = serviceLocation.getAll();
		ArrayList<Event> events = serviceEvent.getAllEvent();
		ArrayList<Groupe> groupes = (ArrayList<Groupe>) serviceGroupe.getGroupeByPerson(person);

		model.addAttribute("groupes", groupes);
		model.addAttribute("events", events);
		model.addAttribute("locations", locations);
		model.addAttribute("interests", interests);
		return "UserProfil";

	}

	public String updateInfo(Model model, @RequestParam(value = "pseudo") String pseudo,
			@RequestParam(value = "interet") String interest, @RequestParam(value = "dateNaissance") Date dateNaissance,
			@RequestParam(value = "nom") String nom, @RequestParam(value = "prenom") String prenom,@RequestParam(value = "id") int id,
			@RequestParam(value = "email") String email, @RequestParam(value = "telephone") int telephone,
			@RequestParam(value = "description") String description, @RequestParam(value = "ville") int villeCp) {

		Person p = serviceperson.getOne(id);

		Set<Interest> interests = new HashSet<Interest>();
		Interest i = new Interest();
		i.setNameInterest(interest);
		if (serviceInterest.getOne(interest).getNameInterest().equalsIgnoreCase(interest)) {

			i = serviceInterest.getOne(interest);
		} else {

			serviceInterest.addInterest(i);
		}

		Locations location = new Locations();
		location.setPostalCode(villeCp);
		Locations lieux2 = serviceLocation.getOne(villeCp);
		if (lieux2.equals(location)) {

			location = serviceLocation.getOne(villeCp);
		} else {
			serviceLocation.addLocation(location);
		}
		p.setPseudoUser(pseudo);
		p.setFirstNameUser(prenom);
		p.setFirstNameUser(nom);
		p.setEmailUser(email);
		p.setPhoneUser(telephone);
		p.setLocation(location);
		p.setDescriptionPerson(description);
		p.setDobUser(dateNaissance);
		interests.add(i);
		p.setInterests(interests);
		
		serviceperson.modifiedPerson(p);

		return "UserProfil";

	}
}
