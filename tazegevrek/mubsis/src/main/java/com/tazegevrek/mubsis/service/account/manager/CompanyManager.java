package com.tazegevrek.mubsis.service.account.manager;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Sirket;

public interface CompanyManager {

	Sirket bireyselSirketOlustur(NewUserDTO dto);

}
