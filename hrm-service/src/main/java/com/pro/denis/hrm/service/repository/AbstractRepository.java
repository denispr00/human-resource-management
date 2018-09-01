package com.pro.denis.hrm.service.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public abstract class AbstractRepository<T> {

	@Autowired
	private SessionFactory sessionFactory;

	// public abstract SessionFactory getSessionFactory();
	
	public abstract Class<T> getClassT();

	public Session getSession() {
		// return getSessionFactory().getCurrentSession();
		return sessionFactory.getCurrentSession();
	}

	public Object add(T entity) {
		return this.getSession().save(entity);
	}
	
	public void remove(T persistentInstance) {
		this.getSession().delete(persistentInstance);
	}
	
	@SuppressWarnings("unchecked")
	public T merge(T detachedInstance) {
		return (T) this.getSession().merge(detachedInstance);
	}
	
	@SuppressWarnings("unchecked")
	public T findById(Long identifier, Class<?> persistClass) {
		return (T) this.getSession().get(persistClass, identifier);
	}
	
	public List<T> findAll() {
		return this.getSession().createQuery("from " + getClassT().getName()).list();
	}

	protected Criteria createEntityCriteria(){
		return this.getSession().createCriteria(getClassT());
	}


}
