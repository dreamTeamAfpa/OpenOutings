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
public class CreateEventController {
	
	//affiche pas CreateEvent
	@GetMapping("createEvent")
	public String createEvent(Model model) {
		return "CreateEvent";
	}

}
