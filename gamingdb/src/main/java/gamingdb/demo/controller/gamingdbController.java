package gamingdb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class gamingdbController {
	
	@RequestMapping("/")
	public String games(Model model) {
		model.addAttribute("page","alma a fa alatt!");
		return  "games";
//
	}

}
