package com.pro.denis.hrm.service.security;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.denis.hrm.domain.security.User;
import com.pro.denis.hrm.service.business.AbstractService;
import com.pro.denis.hrm.service.repository.AbstractRepository;
import com.pro.denis.hrm.service.repository.UserRepository;

@Service
public class UserService extends AbstractService<User> {

	@Autowired
	UserRepository userRepository;

	@Override
	public AbstractRepository<User> getRepository() {
		// TODO Auto-generated method stub
		return userRepository;
	}

	public User findByUsername(String username){
		return userRepository.findByUsername(username);
	}

}
