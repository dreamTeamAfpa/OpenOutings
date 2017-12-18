package fr.afpa.filRouge.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Message;
import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.service.IserviceGeographicalArea;
import fr.afpa.filRouge.service.IserviceGroupe;
import fr.afpa.filRouge.service.IserviceInterest;
import fr.afpa.filRouge.service.IserviceMessage;
import fr.afpa.filRouge.service.IservicePerson;

/*
 * @Author RTI
 */
@Controller
@RequestMapping("/")
public class MessagingController {
	@Autowired
	private IserviceGroupe serviceGroupe;
	@Autowired
	private IserviceGeographicalArea serviceGeo;
	@Autowired
	private IserviceInterest serviceInterest;
	@Autowired
	private IservicePerson servicePerson;
	@Autowired
	private IserviceMessage serviceMessage;

	/**
	 * messagerie
	 * 
	 * @param httpSession
	 * @param model
	 * @return
	 */
	@GetMapping("messagerie")
	public String messagerie(HttpSession httpSession, Model model) {
		if (httpSession.getAttribute("personSession") == null) {
			return "sign_in";
		}
		Person person = (Person) httpSession.getAttribute("personSession");
		ArrayList<Groupe> groups = (ArrayList<Groupe>) serviceGroupe.getGroupeByPerson(person);
		int nbgroupe = groups.size();
		httpSession.setAttribute("nbgroupe", nbgroupe);
		httpSession.setAttribute("listGroupeUser", groups);
		return "messaging";
	}

	/**
	 * groupe chose
	 * 
	 * @param httpSession
	 * @param model
	 * @param nomgroupe
	 * @return
	 */
	@PostMapping("choixgroupe")
	public String choixgroupe(HttpSession httpSession, Model model,
			@RequestParam(value = "nomgroupe") String nomgroupe) {
		if (httpSession.getAttribute("personSession") == null) {
			return "sign_in";
		}
		Groupe groupe = serviceGroupe.getGroupeByName(nomgroupe);
		httpSession.setAttribute("defaultgroupe", groupe);
		List<Person> persons = servicePerson.findPersonByGroupe(groupe);
		int nbperson = persons.size();
		httpSession.setAttribute("listUserGroupe", persons);
		model.addAttribute("nbperson", nbperson);
		ArrayList<Message> messages = (ArrayList<Message>) serviceMessage.getMessagegByGroupe(groupe.getIdGroup());
		httpSession.setAttribute("messagehistory", messages);
		return "messaging";
	}
	/**
	 * Send message
	 * 
	 * @param httpSession
	 * @param model
	 * @param textmessage
	 * @return
	 */
	@PostMapping("sendmessage")
	public String sendmessage(HttpSession httpSession, Model model,
			@RequestParam(value = "zonetextmessage") String textmessage) {
		if ((textmessage != null) && (!textmessage.isEmpty())) {
			Person person = (Person) httpSession.getAttribute("personSession");
			String username = person.getPseudoUser();
			textmessage = username + " - " + textmessage;
			Message message = new Message();
			message.setMessagetxt(textmessage);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			String time = dtf.format(now);
			message.setLocaldatetime(time);
			Groupe groupe = (Groupe) httpSession.getAttribute("defaultgroupe");
			message.setIdGroupe(groupe.getIdGroup());
			serviceMessage.addMessage(message);
			ArrayList<Message> messages = (ArrayList<Message>) serviceMessage.getMessagegByGroupe(groupe.getIdGroup());

			model.addAttribute("messagehistory", messages);
			model.addAttribute("time", time);
			return "messaging";
		}

		return null;
	}
}
