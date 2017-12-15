package fr.afpa.filRouge.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.hibernate.annotations.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.service.ServiceGroupe;
import fr.afpa.filRouge.service.ServicePerson;

@Controller
@RequestMapping("/")
public class MessagingController {
	
	@Autowired
	private ServiceGroupe serviceGroupe;
	@Autowired
	private ServicePerson servicePerson;
	Groupe groupe;
	
	// affiche page messagerie
	@GetMapping("messagerie")
	public String messagerie(HttpSession httpSession, Model model) {
		Person person = (Person) httpSession.getAttribute("personSession");
		ArrayList<Groupe> groups = serviceGroupe.getAllGroupe(person);
		httpSession.setAttribute("listGroupeUser", groups);		
		return "messaging";
	}
	@PostMapping("choixgroupe")
	public String choixgroupe(HttpSession httpSession, Model model,@RequestParam(value = "nomgroupe") String nomgroupe) {
		Groupe groupe = new Groupe();
		groupe.setNameGroup(nomgroupe);
		ArrayList<Person> persons = (ArrayList<Person>) servicePerson.findPersonByGroupe(groupe);
		//TODO find by groupe
		httpSession.setAttribute("listUserGroupe", persons);
		return "messaging";
		
	}

}
