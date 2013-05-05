package com.tazegevrek.mubsis.service.customer.manager;

import java.util.List;

import com.tazegevrek.mubsis.domain.dto.CustomerCriteria;
import com.tazegevrek.mubsis.domain.dto.CustomerDTO;
import com.tazegevrek.mubsis.domain.entity.Musteri;


public interface CustomerManager {
	
	Musteri add(CustomerDTO customerDto);
	
	void remove(Long customerId);
	
	List<CustomerDTO> find(CustomerCriteria criteria);
	
}
