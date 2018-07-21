package com.pro.denis.hrm.service.repository;

public abstract class AbstractRepository<T> {

	/*public abstract SessionFactory getSessionFactory();
	
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
	
	public Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	*/
}
