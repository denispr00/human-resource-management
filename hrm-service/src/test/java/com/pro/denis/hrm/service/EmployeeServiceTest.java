package com.pro.denis.hrm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = {TestConfig.class})
@ContextConfiguration(locations = {"classpath:test-context.xml"})
// @ContextConfiguration(classes = {SpringRootConfig.class})
// @TestPropertySource("classpath:edgar_pra.properties")
public class EmployeeServiceTest {

	@Test
	public void test() {
		System.out.println("junit");
	}

}
