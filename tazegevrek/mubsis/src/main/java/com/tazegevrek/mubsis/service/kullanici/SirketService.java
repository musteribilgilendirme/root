package com.tazegevrek.mubsis.service.kullanici;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Sirket;

public interface SirketService {

	Sirket bireyselSirketOlustur(NewUserDTO dto);

}
