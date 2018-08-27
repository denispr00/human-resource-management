package com.pro.denis.hrm.service.repository;

import org.springframework.stereotype.Repository;

import com.pro.denis.hrm.domain.User;

@Repository
public class UserRepository extends AbstractRepository {

	@Override
	public Class getClassT() {
		// TODO Auto-generated method stub
		return User.class;
	}

}
