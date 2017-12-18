package fr.afpa.filRouge.controller;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	// affiche page index
	@GetMapping({"","index"})
	public String index(HttpSession httpSession,Model model) {
		if (httpSession.getAttribute("personSession") != null) {
			return "index_logged";
		}
		return "index";
	}
	
	
	// affiche page menu
	@GetMapping("menu")
	public String menu(HttpSession httpSession,Model model) {
		return "menu";
	}
	


}

