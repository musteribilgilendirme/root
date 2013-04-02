package com.tazegevrek.mubsis.service.kullanici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.KullaniciDetay;
import com.tazegevrek.mubsis.domain.constant.DurumEnum;
import com.tazegevrek.mubsis.domain.constant.RolEnum;
import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Kullanici;
import com.tazegevrek.mubsis.domain.entity.Sirket;
import com.tazegevrek.mubsis.service.dao.KullaniciDao;

@Service(value="kullaniciService")
public class KullaniciServiceImpl implements KullaniciService, UserDetailsService{

	@Autowired
	private KullaniciDao kullaniciDao;
	
	@Autowired
	private SirketService sirketService;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public UserDetails loadUserByUsername(String kullaniciKodu)
			throws UsernameNotFoundException {
		
		Kullanici kullanici = kullaniciDao.kullaniciSorgula(kullaniciKodu);
		
		if(kullanici == null){
			throw new UsernameNotFoundException(kullaniciKodu);
		}
		
		KullaniciDetay kullaniciDetay = KullaniciServiceTranslator.kullanici2KullaniciDetay(kullanici);
		
		return kullaniciDetay;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void kullaniciOlustur(NewUserDTO dto) {
		
		Sirket bireyselSirket = sirketService.bireyselSirketOlustur(dto);
		
		Kullanici kullanici = new Kullanici();
		kullanici.setKullaniciKodu(dto.getEmail());
		kullanici.setDurum(DurumEnum.AKTIF.getValue());
		kullanici.setEmail(dto.getEmail());
		
		if(dto.getGsmNo() != null){
			kullanici.setGsmNo(dto.getGsmNo().toString());
		}
		
		kullanici.setRol(RolEnum.USER.getValue());
		kullanici.setSifre(dto.getPassword());
		kullanici.setAd(dto.getName());
		kullanici.setSoyad(dto.getSurname());
		kullanici.setSirket(bireyselSirket);
		
		kullaniciDao.save(kullanici, kullanici.getKullaniciKodu());
	}

}
