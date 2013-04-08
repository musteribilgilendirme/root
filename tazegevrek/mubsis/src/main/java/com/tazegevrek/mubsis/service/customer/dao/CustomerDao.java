package com.tazegevrek.mubsis.service.customer.dao;

import org.springframework.stereotype.Repository;

import com.tazegevrek.common.db.GenericDao;
import com.tazegevrek.mubsis.domain.entity.Musteri;

@Repository
public class CustomerDao extends GenericDao<Musteri> {

	@Override
	public Class<Musteri> getEntityClass() {
		return Musteri.class;
	}
	
	
}
