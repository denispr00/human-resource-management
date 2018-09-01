package com.pro.denis.hrm.service.repository;

import com.pro.denis.hrm.domain.Employee;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.pro.denis.hrm.domain.security.User;

import java.util.List;


@Repository
public class UserRepository extends AbstractRepository<User> {

	@Override
	public Class<User> getClassT() {
		return User.class;
	}

	public User findByUsername(String username){

		// Create an HQL statement, query the object.
		// HQL with parameters.
		// Equivalent to the SQL statement:
		// Select e.* from EMPLOYEE e cross join DEPARTMENT d
		// where e.DEPT_ID = d.DEPT_ID and d.DEPT_NO = :deptNo;
		String sql = "Select u from " + User.class.getName() + " u "
				+ " where u.username=:username ";
		//return this.getSession().get(User.class,username);

		// Create query object.
		Query<User> query = this.getSession().createQuery(sql);

		query.setParameter("username", username);

		List<User> userList = query.getResultList();


		return userList.size() >0 ? userList.get(0) : null;
	}

}
