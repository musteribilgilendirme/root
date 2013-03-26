package com.tazegevrek.mubsis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewProductController {
	

	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String prepare(Model model) {
		return "newProduct";
	}
	
}