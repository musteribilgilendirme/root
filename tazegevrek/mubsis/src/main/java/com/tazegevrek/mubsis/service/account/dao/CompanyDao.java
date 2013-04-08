package com.tazegevrek.mubsis.service.account.dao;

import org.springframework.stereotype.Repository;

import com.tazegevrek.common.db.GenericDao;
import com.tazegevrek.mubsis.domain.entity.Sirket;

@Repository
public class CompanyDao extends GenericDao<Sirket> {

	@Override
	public Class<Sirket> getEntityClass() {
		return Sirket.class;
	}

	
	
}
