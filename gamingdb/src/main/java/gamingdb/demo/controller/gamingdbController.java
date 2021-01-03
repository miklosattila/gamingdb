package gamingdb.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gamingdb.demo.model.User;
import gamingdb.demo.service.UserService;
import gamingdb.demo.service.gamingdbService;

@Controller
public class gamingdbController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/")
	public String games() {
		return  "homePage";

	}
	/*
	@RequestMapping("/registration")
	public String registration(Model model){
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(@ModelAttribute User user) {
		userService.registerUser(user);
        return "auth/login";
    }
	
	 @RequestMapping(path = "/activation/{code}", method = RequestMethod.GET)
	    public String activation(@PathVariable("code") String code, HttpServletResponse response) {
		String result = userService.userActivation(code);
		return "auth/login";
	 }
	 */

}


