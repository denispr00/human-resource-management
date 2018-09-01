package com.pro.denis.hrm.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pro.denis.hrm.TestConfig;
import com.pro.denis.hrm.domain.security.User;
import com.pro.denis.hrm.service.security.UserService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void testUser() {
		List<User> userList = userService.retrieveList();
		System.out.println("size"+userList.size());
		userList.forEach(user -> System.out.println("username" + user.getUsername()));
	}

	@Test
	public void testFindByUsername(){
		List<User> userList = userService.retrieveList();
		if(userList.size() > 0 ){

			User user = userService.findByUsername(userList.get(0).getUsername());
			assertEquals(user.getUsername(),userList.get(0).getUsername());
		}
	}

	@Test
	public void testAuthority(){
		User user = userService.findByUsername("admin");
		user.getAuthorities().forEach( authority -> System.out.println("aut="+authority.getAuthority()));


	}

}
