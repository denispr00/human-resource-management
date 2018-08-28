package com.pro.denis.hrm.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pro.denis.hrm.TestConfig;
import com.pro.denis.hrm.domain.security.User;
import com.pro.denis.hrm.service.security.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void testUser() {
		List<User> userList = userService.retrieveList();
		userList.forEach(user -> System.out.println("username" + user.getUsername()));
	}

}
