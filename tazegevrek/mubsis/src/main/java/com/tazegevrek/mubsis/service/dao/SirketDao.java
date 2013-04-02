package com.tazegevrek.mubsis.service.dao;

import org.springframework.stereotype.Repository;

import com.tazegevrek.common.db.GenericDao;
import com.tazegevrek.mubsis.domain.entity.Sirket;

@Repository
public class SirketDao extends GenericDao<Sirket> {

	@Override
	public Class<Sirket> getEntityClass() {
		return Sirket.class;
	}

	
	
}
