package com.tazegevrek.mubsis.service.customer.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tazegevrek.mubsis.domain.dto.CustomerCriteria;
import com.tazegevrek.mubsis.domain.dto.CustomerDTO;
import com.tazegevrek.mubsis.domain.entity.Musteri;
import com.tazegevrek.mubsis.service.customer.dao.CustomerDao;
import com.tazegevrek.mubsis.service.customer.util.CustomerTranslator;

@Service(value="customerManager")
public class CustomerManagerImpl implements CustomerManager{

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CustomerTranslator customerTranslator;
	
	@Override
	public Musteri add(CustomerDTO customerDto) {
		
		Musteri customer = customerTranslator.customerDto2customer(customerDto); 
		
		//TODO save customer
		
		return customer;

	}

	@Override
	public void remove(Long customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> find(CustomerCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}
 
	

	

}
