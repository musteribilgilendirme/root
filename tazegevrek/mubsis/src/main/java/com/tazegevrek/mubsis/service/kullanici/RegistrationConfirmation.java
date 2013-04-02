package com.tazegevrek.mubsis.service.kullanici;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.service.activiti.AsycConfirmation;

@Service(value="registrationConfirmation")
public class RegistrationConfirmation implements AsycConfirmation<NewUserDTO> {

	private Logger logger = Logger.getLogger(RegistrationConfirmation.class);
	
	private String EMAIL = "EMAIL";
	private String GSM = "GSM";
	private String PASSWORD = "PASSWORD";
	private String NAME = "NAME";
	private String SURNAME = "SURNAME";
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
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
		Map<String, Object> vars = new HashMap<String, Object>();	
		vars.put(EMAIL, dto.getEmail());
		vars.put(GSM,dto.getGsmNo());
		String encodedPassword = passwordEncoder.encode(dto.getPassword());
		vars.put(PASSWORD,encodedPassword);
		vars.put(NAME,dto.getName());
		vars.put(SURNAME,dto.getSurname());
		return vars;
	}

	@Override
	public NewUserDTO map2dto(Map<String, Object> vars) {
		NewUserDTO dto = new NewUserDTO();
		dto.setEmail(vars.get(EMAIL).toString());
		dto.setGsmNo((Integer)vars.get(GSM));
		dto.setPassword(vars.get(PASSWORD).toString());
		dto.setName(vars.get(NAME).toString());
		dto.setSurname(vars.get(SURNAME).toString());
		return dto;
	}

	@Override
	public String getBeanName() {
		return "registrationConfirmation";
	}
	
}
