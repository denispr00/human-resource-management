package com.pro.denis.hrm.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.denis.hrm.domain.Employee;
import com.pro.denis.hrm.service.repository.AbstractRepository;
import com.pro.denis.hrm.service.repository.EmployeeRepository;

@Service
public class EmployeeService extends AbstractService<Employee> {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public AbstractRepository<Employee> getRepository() {
		return employeeRepository;
	}

}
