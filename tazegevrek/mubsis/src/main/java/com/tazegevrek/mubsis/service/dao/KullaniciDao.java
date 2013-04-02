package com.tazegevrek.mubsis.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.tazegevrek.common.db.GenericDao;
import com.tazegevrek.mubsis.domain.constant.DurumEnum;
import com.tazegevrek.mubsis.domain.entity.Kullanici;

@Repository
public class KullaniciDao extends GenericDao<Kullanici> {

	@Override
	public Class<Kullanici> getEntityClass() {
		return Kullanici.class;
	}

	public Kullanici kullaniciSorgula(String kullaniciKodu) { 
		
		Criteria criteria = getSession().createCriteria(Kullanici.class,"k");
		criteria.add(Restrictions.eq("k.kullaniciKodu", kullaniciKodu));
		criteria.add(Restrictions.ne("k.durum", DurumEnum.MANTIKSAL_SILINMIS.getValue()));
		
		List<Kullanici> resultList = criteria.list();
		
		if(CollectionUtils.isEmpty(resultList)){
			return null;
		}
		
		return resultList.get(0);
	}
	
	
}
