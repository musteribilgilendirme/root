package com.tazegevrek.mubsis.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tazegevrek.mubsis.domain.dto.UserRecoveryDTO;

@Controller
@RequestMapping("/user")
public class UserController {
	

	@RequestMapping(value="/login")
	public String login(Model model) {
		return "user/login";
	}
	
	@RequestMapping(value="/login/fail", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "user/login";
	}
	
	@RequestMapping(value="/recover", method = RequestMethod.GET)
	public String recover(Model model) {
		model.addAttribute("userRecoveryDTO", new UserRecoveryDTO());
		return "user/recover";
	}
	
	@RequestMapping(value="/recover/sendemail", method = RequestMethod.POST)
	public String doRecover(@Valid UserRecoveryDTO userRecoveryDTO,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("error", "true");
			return "user/recover";
		}
		model.addAttribute("recover", "true");
		return "user/recover";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		return "user/registration";
	}
	

 
	
	


}