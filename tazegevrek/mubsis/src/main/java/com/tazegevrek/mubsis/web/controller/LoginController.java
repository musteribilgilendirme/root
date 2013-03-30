package com.tazegevrek.mubsis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String init(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value="/recoveruser", method = RequestMethod.GET)
	public String recover(ModelMap model) {
		model.addAttribute("recover", "true");
		return "login";
	}
 
	
	


}