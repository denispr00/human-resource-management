package com.pro.denis.hrm.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml"})
// @ContextConfiguration(classes = {SpringRootConfig.class})
public class EmployeeControllerTest {

	// @Test
	public void testTest() {
		System.out.println("controller test");
	}

}
