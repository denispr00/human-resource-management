package com.pro.denis.hrm.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pro.denis.hrm.TestConfig;
import com.pro.denis.hrm.domain.Employee;
import com.pro.denis.hrm.service.business.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
// @ContextConfiguration(locations = {"classpath:test-context.xml"})
// @ContextConfiguration(classes = {SpringRootConfig.class})
// @TestPropertySource("classpath:edgar_pra.properties")
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void test() {
		List<Employee> employeeList = employeeService.retrieveList();
		for (Employee employee : employeeList) {
			System.out.println("name" + employee.getName());
		}

	}

}
