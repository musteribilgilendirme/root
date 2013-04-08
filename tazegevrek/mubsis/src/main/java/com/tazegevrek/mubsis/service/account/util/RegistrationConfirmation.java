package com.tazegevrek.mubsis.service.account.util;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.service.account.service.UserService;
import com.tazegevrek.mubsis.service.activiti.AsycConfirmation;

@Service(value="registrationConfirmation")
public class RegistrationConfirmation implements AsycConfirmation<NewUserDTO> {

	private Logger logger = Logger.getLogger(RegistrationConfirmation.class);

	@Autowired
	private AccountTranslator kullaniciTranslator;
	
	@Autowired
	private UserService kullaniciService;
	
	@Override
	public void timeout(NewUserDTO dto) {
		logger.warn("Impelement this service");
	}

	@Override
	public void confirm(NewUserDTO dto) {
		kullaniciService.kullaniciOlustur(dto);
	}

	@Override
	public Map<String, Object> dto2map(NewUserDTO dto) {
		Map<String, Object> vars = kullaniciTranslator.newUserDto2map(dto);
		return vars;
	}

	@Override
	public NewUserDTO map2dto(Map<String, Object> vars) {
		NewUserDTO dto = kullaniciTranslator.map2newUserDto(vars);
		return dto;
	}

	@Override
	public String getBeanName() {
		return "registrationConfirmation";
	}
	
}
