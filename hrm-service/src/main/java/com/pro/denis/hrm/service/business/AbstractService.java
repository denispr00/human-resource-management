package com.pro.denis.hrm.service.business;

import java.util.List;

import com.pro.denis.hrm.domain.AbstractDomain;
import com.pro.denis.hrm.service.repository.AbstractRepository;

public abstract class AbstractService<T extends AbstractDomain> {

	public abstract AbstractRepository<T> getRepository();

	/**
	 * create entity (persist into db)
	 * 
	 * @param entity
	 *            to be saved
	 * @return entity (with id)
	 */
	public T add(T entity) {
		Long id = (Long) getRepository().add(entity);
		entity.setId(id);
		return entity;
	}

	/**
	 * retrive a particular entity using id
	 * @param Long id
	 * @param Class (Entity.class)
	 * @return entity 
	 */
	public T retrieveById(Long id, Class<T> classT) {
		return getRepository().findById(id, classT);
	}



	/**
	 * retrieve list of entity
	 * 
	 * @return List<T>
	 */
	public List<T> retrieveList() {
		return getRepository().findAll();
	}

}
