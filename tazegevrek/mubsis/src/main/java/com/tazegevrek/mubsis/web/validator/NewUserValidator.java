package com.tazegevrek.mubsis.web.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.service.account.util.AccountValidator;

@Service
public class NewUserValidator implements Validator{

	@Autowired
	private AccountValidator accountValidator;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return NewUserDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors err) {
		
		NewUserDTO newUserDTO = (NewUserDTO) obj;
		
		boolean isRePassMatch = StringUtils.equals(newUserDTO.getPassword(), newUserDTO.getRepassword());
		if(!isRePassMatch){
			err.rejectValue("password", "NewUserValidator.repassword.not.match", "password does not match");
		}
		
		if(err.hasErrors()){
			return;
		}
		
		
		boolean isUserExists = accountValidator.isUserExists(newUserDTO.getEmail());
		if(isUserExists){
			err.rejectValue("email", "NewUserValidator.user.already.exists", "user in use!");
		}
		

		
	}

}
