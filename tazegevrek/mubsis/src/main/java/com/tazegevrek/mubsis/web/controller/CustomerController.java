package com.tazegevrek.mubsis.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secure/customer")
public class CustomerController {

	private Logger logger = Logger.getLogger(CustomerController.class);

	@RequestMapping(value="/list")
	public String list(Model model) {
		return "customer/listCustomer";
	}
	
}