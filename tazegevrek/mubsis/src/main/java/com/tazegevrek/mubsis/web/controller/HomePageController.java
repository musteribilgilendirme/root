package com.tazegevrek.mubsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {
	

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}


}