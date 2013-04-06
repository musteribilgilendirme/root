package com.tazegevrek.mubsis.test;

import junit.framework.Assert;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Kullanici;
import com.tazegevrek.mubsis.service.activiti.ConfirmationService;
import com.tazegevrek.mubsis.service.dao.KullaniciDao;
import com.tazegevrek.mubsis.service.kullanici.RegistrationConfirmation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appcontext/mubsis-test-config.xml"})
@Component
public class TestKullaniciIslemleri extends AbstractTest {

	private Logger logger = Logger.getLogger(TestKullaniciIslemleri.class);
	
	@Autowired
	private KullaniciDao kullaniciDao;
	
	@Autowired
	private ConfirmationService confirmationService;

	@Autowired
	private RegistrationConfirmation registrationConfirmation;
	
	@Autowired
	private Md5PasswordEncoder passwordEncoder;
	
	@Autowired
	private RuntimeService runtimeService;
	
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void testKullaniciSorgulama(){
		Kullanici kullanici = kullaniciDao.kullaniciSorgula("eren");		
		Assert.assertNull(kullanici);			
	}
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void passwordCreator(){
		System.out.println(passwordEncoder.encodePassword("123456", null));
	}
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void userRegistrationTest(){
		
		NewUserDTO newUser = new NewUserDTO();
		newUser.setEmail("dummy1@gmail.com");
		newUser.setGsmNo(5053367649l);
		newUser.setName("Test");
		newUser.setPassword(passwordEncoder.encodePassword("123456", null));
		newUser.setName("Unit");
		newUser.setSurname("Test");
		
		String bussinessKey = confirmationService
				.startAsycConfirmation(registrationConfirmation, newUser);
		
		ProcessInstance  processInstance = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(bussinessKey).singleResult();
		
		Assert.assertNotNull(processInstance);
		
		confirmationService.confirmAsycConfirmation(bussinessKey);
		
		Kullanici kullanici = kullaniciDao.kullaniciSorgula(newUser.getEmail());
		
		Assert.assertNotNull(kullanici);
		
	}
	

	

}
