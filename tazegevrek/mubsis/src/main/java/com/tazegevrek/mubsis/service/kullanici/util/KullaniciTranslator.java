package com.tazegevrek.mubsis.service.kullanici.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tazegevrek.mubsis.domain.KullaniciDetay;
import com.tazegevrek.mubsis.domain.constant.DurumEnum;
import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Kullanici;


@Service
public class KullaniciTranslator {
	
	private String EMAIL = "EMAIL";
	private String GSM = "GSM";
	private String PASSWORD = "PASSWORD";
	private String NAME = "NAME";
	private String SURNAME = "SURNAME";
	
	@Autowired
	private Md5PasswordEncoder passwordEncoder;

	public KullaniciDetay kullanici2KullaniciDetay(Kullanici kullanici){
		KullaniciDetay detay = new KullaniciDetay();
		detay.setRol(kullanici.getRol());
		detay.setSifre(kullanici.getSifre());
		detay.setKullaniciKodu(kullanici.getKullaniciKodu());
		detay.setHesabinKullanimSuresiDolduMu(true);
		detay.setHesapKilitliDegilMi(true);
		detay.setSertifikaGecerliligiDolduMu(true);
		
		boolean aktifMi = kullanici.getDurum().equals(DurumEnum.AKTIF.getValue());
		detay.setAktifMi(aktifMi);
		return detay;
	}
	
	public Map<String, Object> newUserDto2map(NewUserDTO dto) {
		Map<String, Object> vars = new HashMap<String, Object>();	
		vars.put(EMAIL, dto.getEmail());
		vars.put(GSM,dto.getGsmNo());
		String encodedPassword = passwordEncoder.encodePassword(dto.getPassword(),null);
		vars.put(PASSWORD,encodedPassword);
		vars.put(NAME,dto.getName());
		vars.put(SURNAME,dto.getSurname());
		return vars;
	}

	public NewUserDTO map2newUserDto(Map<String, Object> vars) {
		NewUserDTO dto = new NewUserDTO();
		dto.setEmail(vars.get(EMAIL).toString());
		dto.setGsmNo((Long)vars.get(GSM));
		dto.setPassword(vars.get(PASSWORD).toString());
		dto.setName(vars.get(NAME).toString());
		dto.setSurname(vars.get(SURNAME).toString());
		return dto;
	}
	
}
