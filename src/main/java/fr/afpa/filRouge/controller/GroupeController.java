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
import fr.afpa.filRouge.service.IserviceGroupe;

@Controller
@RequestMapping("/")
public class GroupeController {
@Autowired
	private IserviceGroupe serviceGroup;

	private GeographicalArea geographicalArea;
	private Interest interest;
	
	@GetMapping("rechercheUserGroupe")
	public String getFormUserGroupSearch(Model model) {
		ArrayList<Groupe> groups  = serviceGroup.getGroup();
		System.out.println(groups);
		model.addAttribute("groups", groups);
		return "rechercheUserGroupe";
	}

	@PostMapping("validFormGroup")
	public String validFormGroup(Model model, @RequestParam(value = "iChoixLieux") String lieux,
			@RequestParam(value = "iChoixGroupe") String themGroup,
			@RequestParam(value = "pseudo") String pseudo) {
		if (!themGroup.equals("GROUPES")) {
			ArrayList<Groupe> groupe = serviceGroup.getGroupByInterests(interest);
			System.out.println(groupe);
			model.addAttribute("nameGroup", groupe);
			return "rechercheUserGroupe";
		} else if (!lieux.equals("LIEUX")) {
		List<Groupe> groupe = serviceGroup.getGroupByGeographicalArea( geographicalArea);
			model.addAttribute("nameGroup", groupe);
			return "rechercheUserGroupe";
		} else if (pseudo.equals("")) {
			model.addAttribute("nameGroup", "tt les groupes");
			
			
			return "rechercheUserGroupe";
		}
		return "rechercheUserGroupe";
	}

}
