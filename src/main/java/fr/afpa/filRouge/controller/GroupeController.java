package fr.afpa.filRouge.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.service.IserviceGeographicalArea;
import fr.afpa.filRouge.service.IserviceGroupe;
import fr.afpa.filRouge.service.IserviceInterest;
import fr.afpa.filRouge.service.IservicePerson;

@Controller
@RequestMapping("/")
public class GroupeController {
	@Autowired
	private IserviceGroupe serviceGroup;
	@Autowired
	private IserviceGeographicalArea serviceGeo;
	@Autowired
	private IserviceInterest serviceInterest;
	@Autowired
	private IservicePerson servicePerson;

	private GeographicalArea geographicalArea;
	private Interest interest;

	@GetMapping("rechercheUserGroupe")
	public String getFormUserGroupSearch(Model model) {
		ArrayList<GeographicalArea> geoAreas = (ArrayList<GeographicalArea>) serviceGeo.getAll();
		ArrayList<Interest> interests = (ArrayList<Interest>) serviceInterest.getAll();
		model.addAttribute("geo", geoAreas);
		model.addAttribute("interests", interests);
		return "rechercheUserGroupe";
	}

	@PostMapping("validFormGroup")
	public String validFormGroup(Model model, @RequestParam(value = "iChoixLieux") String lieux,
			@RequestParam(value = "iChoixGroupe") String themGroup, @RequestParam(value = "pseudo") String pseudo) {
		System.out.println(themGroup);
		System.out.println(lieux);
		System.out.println(pseudo);
		if (!themGroup.equals("noTheme")) {
			interest = new Interest();
			interest.setNameInterest(themGroup);
			System.out.println("test interest" + interest.getNameInterest());
			ArrayList<Groupe> groupe = serviceGroup.getGroupByInterests(interest);
			model.addAttribute("nameGroup", groupe);
			
			for (int i = 0; i < groupe.size(); i++) {
				List<Person> persons = servicePerson.findPersonbyNameGroup(groupe.get(i));
				if (persons.size() == 0) {
					Person p = new Person();
					p.setPseudoUser("noOne");
					ArrayList<Person> al = new ArrayList<Person>();
					al.add(p);
					
					model.addAttribute("nameGroup", groupe);
				} else {
					groupe.get(i).setUsers(persons);
					getFormUserGroupSearch(model);
					model.addAttribute("nameGroup", groupe);
					return "rechercheUserGroupe";
				}
			}
		} else if (!lieux.equals("noLieux")) {
			geographicalArea = new GeographicalArea();
			geographicalArea.setNameArea(lieux);
			List<Groupe> groupe = serviceGroup.getGroupByGeographicalArea(geographicalArea);

			for (int i = 0; i < groupe.size(); i++) {
				List<Person> persons = servicePerson.findPersonbyNameGroup(groupe.get(i));
				if (persons.size() == 0) {
					Person p = new Person();
					p.setPseudoUser("noOne");
					List<Person> al = new ArrayList<Person>();
					al.add(p);
					
				groupe.get(i).setUsers(al);
				} else {
					groupe.get(i).setUsers(persons);
				}
			}

			model.addAttribute("nameGroup", groupe);

			getFormUserGroupSearch(model);
			return "rechercheUserGroupe";
		} else if (!pseudo.equals("")) {
			System.out.println("test Pseudo");
			Groupe group = serviceGroup.findGroupeByName(pseudo);
			Person person = servicePerson.findByPseudoUser(pseudo);
			if (group == null && person != null) {
				model.addAttribute("nameOnePerson", person.getPseudoUser());
				model.addAttribute("idOnePerson", person.getIdUser());
			} else if (person == null && group != null) {
				model.addAttribute("nameOneGroup", group.getNameGroup());
				model.addAttribute("idOneGroup", group.getIdGroup());
			} else {
				model.addAttribute("nameOneGroup", "pas de resultat");

			}
		}
		getFormUserGroupSearch(model);
		return "rechercheUserGroupe";

	}

	@GetMapping("CreationGroupe")
	public String creationGroupe(Model model, @RequestParam(value = "idGroup") int idGroup) {
		if (idGroup != 0) {
			Groupe groupe = serviceGroup.getOneGroup(idGroup);
			for (int i = 0; i < groupe.getInterests().size(); i++) {
				String list = Arrays.toString(groupe.getInterests().toArray()).replace("[", "").replace("]", "");
				model.addAttribute("interest", list);
			}
			Set<Interest> interstss = groupe.getInterests();
			String list = Arrays.toString(interstss.toArray()).replace("[", "").replace("]", "");
			Set<Interest> interstsss = new HashSet<Interest>();
			Interest i = new Interest();
			i.setNameInterest(list);
			interstsss.add(i);
			groupe.setInterests(interstsss);
			List<Person> persons = servicePerson.findPersonbyNameGroup(groupe);
			model.addAttribute("persons", persons);
			model.addAttribute("groupe", groupe);
		}

		return "CreationGroupe";

	}

	@GetMapping("modifGroupe")
	public String updateGroup(Model model, @RequestParam(value = "txtCiblNomGroup") String nomGroup,
			@RequestParam(value = "ciblIdGroup") int idGroup, @RequestParam(value = "ciblInterest") String interest,
			@RequestParam(value = "ciblLieux") String lieux, @RequestParam(value = "ciblDescr") String description) {
		Groupe g = serviceGroup.getOneGroup(idGroup);
		Set<Interest> interests = new HashSet<Interest>();
		Interest i = new Interest();
		i.setNameInterest(interest);
		Interest i2 = serviceInterest.getOnebyName(interest);
		if (i2 != null) {
			if (i2.getNameInterest().equalsIgnoreCase(interest)) {
				System.out.println(i + "test egalité interet");
				i = serviceInterest.getOnebyName(interest);
			}
		} else {

			serviceInterest.addInterest(i);
		}

		GeographicalArea geographicalArea = new GeographicalArea();
		geographicalArea.setNameArea(lieux);
		GeographicalArea lieux2 = serviceGeo.getOne(lieux);
		if (lieux2 != null) {
			if (lieux2.getNameArea().equalsIgnoreCase(geographicalArea.getNameArea())) {
				System.out.println(geographicalArea + "test egalité geo");
				geographicalArea = serviceGeo.getOne(lieux);
			}
		} else {
			serviceGeo.addGeographicalArea(geographicalArea);

		}

		g.setGeographicalArea(geographicalArea);
		g.setDescriptionGroup(description);
		g.setNameGroup(nomGroup);
		interests.add(i);
		g.setInterests(interests);
		serviceGroup.addGroup(g);
		getFormUserGroupSearch(model);
		return "rechercheUserGroupe";
	}

	@GetMapping("deleteGroup")
	public String deletegroup(Model model, @RequestParam(value = "ciblIdGroup")int idGroup) {
		Groupe group = serviceGroup.getOneGroup(idGroup);
//		group.setUsersGroupe(null);
//		System.out.println(group);
//		Set<Interest> interests = group.getInterests();
//		for (int i =0;i<interests.size();i++) {
//			Interest interest = interests.iterator().next();
//			serviceInterest.delInterest(interest);
//		}
			List<Person> persons = servicePerson.findPersonbyNameGroup(group);
		//group.setUsersGroupe(persons);
		serviceGroup.deleteGroup(group);
		
		getFormUserGroupSearch(model);
		return "rechercheUserGroupe";
	}
}
