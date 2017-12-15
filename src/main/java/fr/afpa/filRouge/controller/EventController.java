package fr.afpa.filRouge.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author L. CASTAGNEDOLI
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.model.Theme;
import fr.afpa.filRouge.service.IserviceEvent;
import fr.afpa.filRouge.service.IserviceGeographicalArea;
import fr.afpa.filRouge.service.IserviceTheme;

@Controller
@RequestMapping("/")
public class EventController {
	@Autowired
	private IserviceEvent serviceEvent;
	@Autowired
	private IserviceGeographicalArea serviceGeo;
	@Autowired
	private IserviceTheme serviceTheme;
	//affiche page CreateEvent
	@GetMapping("createEvent")
	public String createEvent(Model model) {
		ArrayList<GeographicalArea> geoAreas = (ArrayList<GeographicalArea>) serviceGeo.getAll();
		ArrayList<Theme> themes = (ArrayList<Theme>) serviceTheme.getAll();
		model.addAttribute("geo", geoAreas);
		model.addAttribute("themes", themes);
		return "createEvent";
	}
	//affiche page rechercheEvent
	@GetMapping("findEvent")
	public String listEvent(Model model) {
			ArrayList<Event> events = serviceEvent.getAllEvent();
			if (!events.isEmpty() ) {
				System.out.println(events);
				model.addAttribute("events", events);
			}
			ArrayList<GeographicalArea> geoAreas = (ArrayList<GeographicalArea>) serviceGeo.getAll();
			ArrayList<Theme> themes = (ArrayList<Theme>) serviceTheme.getAll();
			model.addAttribute("geo", geoAreas);
			model.addAttribute("themes", themes);
			return "findEvent";
	}
	
	@PostMapping("displayEvent")
	public String displayEvent(Model model, @RequestParam(value = "idEvent") int idevent) {
		Event event = serviceEvent.getOneEvent(idevent);
		model.addAttribute(event);
		return "createEvent";
	}
}
