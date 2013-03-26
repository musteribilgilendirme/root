package com.tazegevrek.mubsis.service.dao;

import org.springframework.stereotype.Repository;

import com.tazegevrek.common.db.GenericDao;
import com.tazegevrek.mubsis.domain.entity.Musteri;

@Repository
public class MusteriDao extends GenericDao<Musteri> {

	@Override
	public Class<Musteri> getEntityClass() {
		return Musteri.class;
	}
	
	
}
