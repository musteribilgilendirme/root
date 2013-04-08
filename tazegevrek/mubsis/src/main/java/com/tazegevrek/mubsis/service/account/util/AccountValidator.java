package com.tazegevrek.mubsis.service.account.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tazegevrek.mubsis.domain.entity.Kullanici;
import com.tazegevrek.mubsis.service.account.dao.UserDao;

@Service
public class AccountValidator {

	@Autowired
	private UserDao userDao;
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public boolean isUserExists(String username){
		Kullanici user = userDao.findUser(username);
		if(user == null){
			return false;
		}
		return true;
	}
	
	
	
}
