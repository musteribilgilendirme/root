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
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.dto.NewUserDTO;
import com.tazegevrek.mubsis.domain.entity.Kullanici;
import com.tazegevrek.mubsis.service.account.dao.UserDao;
import com.tazegevrek.mubsis.service.account.service.UserService;
import com.tazegevrek.mubsis.service.account.util.RegistrationConfirmation;
import com.tazegevrek.mubsis.service.activiti.confirmation.ConfirmationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appcontext/mubsis-test-config.xml"})
@Component
public class TestAccountModule extends AbstractTest {

	private Logger logger = Logger.getLogger(TestAccountModule.class);
	
	@Autowired
	private UserDao kullaniciDao;
	
	@Autowired
	private ConfirmationService confirmationService;

	@Autowired
	private RegistrationConfirmation registrationConfirmation;
	
	@Autowired
	private Md5PasswordEncoder passwordEncoder;
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private UserService kullaniciService;
	
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void testKullaniciSorgulama(){
		Kullanici kullanici = kullaniciDao.findUser("eren");		
		Assert.assertNull(kullanici);			
	}
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	public void passwordCreator(){
		System.out.println(passwordEncoder.encodePassword("123456", null));
	}
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	@Rollback(value=true)
	public void createUserTest(){
		NewUserDTO newUser = new NewUserDTO();
		newUser.setEmail("createUserTest@gmail.com");
		newUser.setGsmNo("3123367649");
		newUser.setName("Create User Test");
		newUser.setPassword(passwordEncoder.encodePassword("123456", null));
		newUser.setName("Create User");
		newUser.setSurname("Test");
		
		kullaniciService.kullaniciOlustur(newUser);
		
		Kullanici kullanici = kullaniciDao.findUser(newUser.getEmail());
		
		Assert.assertNotNull(kullanici);
	}
	
	@Test
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=false)
	@Rollback(value=true)
	public void userRegistrationTest(){
		
		NewUserDTO newUser = new NewUserDTO();
		newUser.setEmail("dummy1@gmail.com");
		newUser.setGsmNo("3123367649");
		newUser.setName("Test");
		newUser.setPassword(passwordEncoder.encodePassword("123456", null));
		newUser.setName("Unit");
		newUser.setSurname("Test");
		
		String bussinessKey = confirmationService
				.startAsycConfirmation(registrationConfirmation, newUser);
		
		ProcessInstance  processInstance = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(bussinessKey).singleResult();
		
		Assert.assertNotNull(processInstance);
		
		confirmationService.confirmAsycConfirmation(bussinessKey);
		
		Kullanici kullanici = kullaniciDao.findUser(newUser.getEmail());
		
		Assert.assertNotNull(kullanici);
		
	}
	
	
	

	

}
