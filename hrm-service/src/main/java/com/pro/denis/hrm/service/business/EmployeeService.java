package com.pro.denis.hrm.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.denis.hrm.domain.Employee;
import com.pro.denis.hrm.service.repository.EmployeeRepository;

@Service
public class EmployeeService {

	/*@Autowired
	EmployeeRepositoryELASTIC employeeRepository;
	
	public String createEmployee() {
		return "service";
	}
	
	public Employee save(Employee Employee) {
		return employeeRepository.save(Employee);
	}
	
	public void delete(Employee Employee) {
		employeeRepository.delete(Employee);
	}
	
	public Employee findOne(String id) {
		return employeeRepository.findOne(id);
	}
	
	public Iterable<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	public Page<Employee> findByDepartment(String department, PageRequest pageRequest) {
		return employeeRepository.findByDepartment(department, pageRequest);
	}
	
	public List<Employee> findByName(String name) {
		return employeeRepository.findByName(name);
	}*/

	@Autowired
	EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> list() {
		return employeeRepository.list();
	}

}
