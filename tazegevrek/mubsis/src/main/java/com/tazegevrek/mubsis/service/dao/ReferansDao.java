package com.tazegevrek.mubsis.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tazegevrek.common.db.GenericDao;
import com.tazegevrek.mubsis.domain.constant.ReferansEnum;
import com.tazegevrek.mubsis.domain.entity.Referans;

@Repository
public class ReferansDao extends GenericDao<Referans> {

	@Override
	public Class<Referans> getEntityClass() {
		return Referans.class;
	}
	
	public Referans referansSorgula(ReferansEnum refEnum){
		return this.referansSorgula(refEnum.getValue());
	}
	
	public List<Referans> referansGrubuSorgula(String grup){
		Criteria criteria = getSession().createCriteria(Referans.class,"r");
		criteria.add(Restrictions.eq("r.grup", grup));
		List<Referans> referansList = criteria.list();
		criteria.setCacheable(true);
		return referansList;
	}
	
	public Referans referansSorgula(String kod){
		Criteria criteria = getSession().createCriteria(Referans.class,"r");
		criteria.add(Restrictions.eq("r.key", kod));
		Referans referans = (Referans) criteria.uniqueResult();
		criteria.setCacheable(true);
		return referans;
	}

}
