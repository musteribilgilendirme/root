package com.tazegevrek.mubsis.service.kullanici.util;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.service.activiti.AsycConfirmation;
import com.tazegevrek.mubsis.service.kullanici.service.KullaniciService;

@Service(value="registrationConfirmation")
public class RegistrationConfirmation implements AsycConfirmation<NewUserDTO> {

	private Logger logger = Logger.getLogger(RegistrationConfirmation.class);

	@Autowired
	private KullaniciTranslator kullaniciTranslator;
	
	@Autowired
	private KullaniciService kullaniciService;
	
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
