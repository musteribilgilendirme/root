package com.tazegevrek.common.db;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericDao<T extends PersistentObject> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void save(T entity, String username){
		logAuidit(entity, username);
		getSession().save(entity);
	}
	
	public void update(T entity, String username){
		logAuidit(entity, username);
		getSession().update(entity);
	}
	
	public void delete(T entity, String username){
		getSession().delete(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findById(Long id){
		Criteria criteria = getSession().createCriteria(getEntityClass());
		criteria.add(Restrictions.eq("id", id));
		List<T> resultList = (List<T>) criteria.list();
		return resultList;
	}
	
	private void logAuidit(T entity, String username){
		if(entity.getId() == null){
			entity.setInsertTime(new Date());
			entity.setInsertUser(username);
		}
		else{
			entity.setUpdateTime(new Date());
			entity.setUpdateUser(username);
		}
	}

	public abstract Class<T> getEntityClass();

}
