package com.tazegevrek.mubsis.service.account.service;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Sirket;

public interface CompanyService {

	Sirket bireyselSirketOlustur(NewUserDTO dto);

}
