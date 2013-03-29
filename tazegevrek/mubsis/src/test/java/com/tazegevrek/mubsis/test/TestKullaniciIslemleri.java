package com.tazegevrek.mubsis.test;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.entity.Kullanici;
import com.tazegevrek.mubsis.service.dao.KullaniciDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appcontext/mubsis-test-config.xml"})
@Component
public class TestKullaniciIslemleri {

	private Logger logger = Logger.getLogger(TestKullaniciIslemleri.class);
	
	@Autowired
	private KullaniciDao kullaniciDao;
	
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void testKullaniciSorgulama(){
		Kullanici kullanici = kullaniciDao.kullaniciSorgula("eren");		
		Assert.assertNull(kullanici);			
	}
	

	

}
