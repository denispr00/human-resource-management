package com.pro.denis.hrm.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pro.denis.hrm.domain.security.User;
import com.pro.denis.hrm.service.business.AbstractService;
import com.pro.denis.hrm.service.repository.AbstractRepository;
import com.pro.denis.hrm.service.repository.UserRepository;

@Service
public class UserService extends AbstractService<User> {

	@Autowired
	UserRepository userRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public AbstractRepository<User> getRepository() {
		return userRepository;
	}

	public User findByUsername(String username){
		return userRepository.findByUsername(username);
	}

	/**
	 * creates user (encrypt password(
	 * @param entity
	 * @return
	 */
	@Override
	public User add(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Long id = (Long) userRepository.add(user);
		user.setId(id);
		return user;
	}


}
