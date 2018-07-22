package com.pro.denis.hrm.service.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pro.denis.hrm.domain.Employee;

@Repository
@Transactional
public class EmployeeRepository extends AbstractRepository<Employee> {

	@Autowired
	private SessionFactory sessionFactory;

	// @Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public Class<Employee> getClassT() {
		return Employee.class;
	}

	/*public void save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}
	
	
	public List<Employee> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from employee");
		return query.getResultList();
	}*/

}
