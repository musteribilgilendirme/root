package com.tazegevrek.mubsis.service.kullanici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.constant.SirketTuruEnum;
import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Sirket;
import com.tazegevrek.mubsis.service.dao.SirketDao;

@Service(value="sirketService")
public class SirketServiceImpl implements SirketService{
 
	@Autowired
	private SirketDao sirketDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public Sirket bireyselSirketOlustur(NewUserDTO dto) {
		Sirket sirket = new Sirket();
		sirket.setAvans(0l);
		sirket.setEmail(dto.getEmail());
		
		if(dto.getGsmNo() != null){
			sirket.setGsmNo(dto.getGsmNo().toString());
		}
		
		sirket.setSirketTuru(SirketTuruEnum.BIREYSEL.getValue());
		sirket.setUnvani(dto.getEmail());
		sirketDao.save(sirket, dto.getEmail());
		return sirket;
		
	}

	

}
