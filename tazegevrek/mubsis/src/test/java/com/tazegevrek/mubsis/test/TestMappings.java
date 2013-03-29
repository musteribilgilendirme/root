package com.tazegevrek.mubsis.test;

import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.constant.CinsiyetEnum;
import com.tazegevrek.mubsis.domain.entity.Musteri;
import com.tazegevrek.mubsis.domain.entity.Referans;
import com.tazegevrek.mubsis.service.dao.MusteriDao;
import com.tazegevrek.mubsis.service.dao.ReferansDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appcontext/mubsis-test-config.xml"})
@Component
public class TestMappings {

	private Logger logger = Logger.getLogger(TestMappings.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired 
	private ReferansDao referansDao;
	
	@Autowired
	private MusteriDao musteriDao;
	
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void connectionTest(){
		long result = 0l;
		try{
			Query query = sessionFactory.getCurrentSession().createSQLQuery("select 1 as result from dual").addScalar("result",Hibernate.LONG);
			result = (Long)query.uniqueResult();
		}catch(Exception e){
			logger.error(e,e);
		}
		Assert.assertEquals(1l,result);			
	}
	
	@Test
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void referanceEntityTest(){
		
		List<Referans> cinsiyetListesi = referansDao.referansGrubuSorgula(CinsiyetEnum.GRUP);
		
		for(Referans cinsiyet : cinsiyetListesi){
			logger.info(cinsiyet.getKey());
		}
		
		
		Referans cinsiyetErkek = referansDao.referansSorgula(CinsiyetEnum.ERKEK);
		logger.info(cinsiyetErkek.getKey());
		
		Referans cinsiyetErkekx = referansDao.referansSorgula(CinsiyetEnum.ERKEK);
		logger.info(cinsiyetErkekx.getKey());
		
		System.out.println(sessionFactory.getStatistics().getSecondLevelCacheHitCount());
	}
	

}
