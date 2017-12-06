package fr.afpa.filRouge.controller;
/**
 * @author L. CASTAGNEDOLI
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EventController {
	
	//affiche pas CreateEvent
	@GetMapping("createEvent")
	public String createEvent(Model model) {
		return "CreateEvent";
	}
	//affiche page rechercheEvent
	@GetMapping("rechercheEvent")
	public String rechercheEvent(Model model) {
		return "rechercheEvent";
	}
}