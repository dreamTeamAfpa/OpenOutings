package fr.afpa.filRouge.controller;

import java.util.ArrayList;
import java.util.List;

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
	//	model.addAttribute("groups", groups);
	//model.addAttribute("nameGroup", groups);
		model.addAttribute("interests", interests);
		return "rechercheUserGroupe";
	}

	@PostMapping("validFormGroup")
	public String validFormGroup(Model model, @RequestParam(value = "iChoixLieux") String lieux,
			@RequestParam(value = "iChoixGroupe") String themGroup,
			@RequestParam(value = "pseudo") String pseudo) {
		System.out.println(themGroup);
		System.out.println(lieux);
		System.out.println(pseudo);
		if (!themGroup.equals("noTheme")) {
			interest= new Interest();
			interest.setNameInterest(themGroup);
			System.out.println("test interest" + interest.getNameInterest());
			ArrayList<Groupe> groupe = serviceGroup.getGroupByInterests(interest);
			model.addAttribute("nameGroup", groupe);
			for(int i =0; i <groupe.size();i++) {
				ArrayList<Person> persons = (ArrayList<Person>) servicePerson.findPersonbyNameGroup(groupe.get(i));
				System.out.println(persons);
				model.addAttribute("persons", persons);
			}
			getFormUserGroupSearch(model);
			return "rechercheUserGroupe";
		} else if (!lieux.equals("noLieux")) {
			geographicalArea = new GeographicalArea();
			geographicalArea.setNameArea(lieux);
		List<Groupe> groupe = serviceGroup.getGroupByGeographicalArea( geographicalArea);
		System.out.println("geo test "+ groupe + geographicalArea);
			
			for(int i =0; i <groupe.size();i++) {
				ArrayList<Person> persons = (ArrayList<Person>) servicePerson.findPersonbyNameGroup(groupe.get(i));
				System.out.println(groupe.get(i));
				System.out.println(persons);
				model.addAttribute("persons", persons);
				model.addAttribute("nameGroup", groupe);
			}
			getFormUserGroupSearch(model);
			return "rechercheUserGroupe";
		} else if (!pseudo.equals("")) {
			Groupe groups  = serviceGroup.findGroupeByName(pseudo);
			if (groups ==null) {
				ArrayList<Groupe> groupe = serviceGroup.getAllGroup();
			
				model.addAttribute("nameGroup", groupe);
			}else {
			model.addAttribute("nameOneGroup", groups.getNameGroup());
			getFormUserGroupSearch(model);
			
			return "rechercheUserGroupe";
		}
		}
		getFormUserGroupSearch(model);
		return "rechercheUserGroupe";
	
	}
		

	@GetMapping("CreationGroupe")
	public String creationGroupe(Model model) {
		
		
		
		return "CreationGroupe";
		
	}
}

