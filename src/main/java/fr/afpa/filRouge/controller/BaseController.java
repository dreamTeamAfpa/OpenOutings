package fr.afpa.filRouge.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

	// affiche page index
	@GetMapping({ "", "index" })
	public String index(HttpSession httpSession, Model model) {
		if (httpSession.getAttribute("personSession") != null) {
			return "index_logged";
		}
		return "index";
	}

	// affiche page menu
	@GetMapping("menu")
	public String menu(HttpSession httpSession, Model model) {
		return "menu";
	}


}
