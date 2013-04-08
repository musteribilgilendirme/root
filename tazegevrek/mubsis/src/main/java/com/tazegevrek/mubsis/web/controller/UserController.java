package com.tazegevrek.mubsis.web.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.dto.UserRecoveryDTO;
import com.tazegevrek.mubsis.service.account.util.RegistrationConfirmation;
import com.tazegevrek.mubsis.service.activiti.confirmation.ConfirmationService;

@Controller
@RequestMapping("/user")
public class UserController {

	private Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private ConfirmationService confirmationService;

	@Autowired
	private RegistrationConfirmation registrationConfirmation;

	@RequestMapping(value = "/login")
	public String login(Model model) {
		return "user/login";
	}

	@RequestMapping(value = "/login/fail", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "user/login";
	}

	@RequestMapping(value = "/recover", method = RequestMethod.GET)
	public String recover(Model model) {
		model.addAttribute("userRecoveryDTO", new UserRecoveryDTO());
		return "user/recover";
	}

	@RequestMapping(value = "/recover/sendemail", method = RequestMethod.POST)
	public String doRecover(@Valid UserRecoveryDTO userRecoveryDTO,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("error", "true");
			return "user/recover";
		}
		model.addAttribute("recover", "true");
		return "user/recover";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		model.addAttribute("newUserDTO", new NewUserDTO());
		return "user/registration";
	}

	@RequestMapping(value = "/registration/register", method = RequestMethod.POST)
	public String addNewUser(@Valid NewUserDTO newUser, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("error", "true");
			return "user/registration";
		}

		String registrationParemeter = confirmationService
				.startAsycConfirmation(registrationConfirmation, newUser);

		// TODO eposta gonderilcek

		System.out.println(registrationParemeter);

		model.addAttribute("success", "true");
		return "user/registration";
	}

	@RequestMapping(value = "/registration/register/{validationId}", method = RequestMethod.GET)
	public String confirmUser(@PathVariable String validationId, Model model) {

		try {
			confirmationService.confirmAsycConfirmation(validationId);
			model.addAttribute("success", "true");
		} catch (Exception e) {
			logger.warn(e);
		}

		return "user/confirmation";
	}

}