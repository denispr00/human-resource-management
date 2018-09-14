package com.pro.denis.hrm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pro.denis.hrm.domain.Employee;
import com.pro.denis.hrm.service.business.AbstractService;
import com.pro.denis.hrm.service.business.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends AbstractController<Employee> {

	@Autowired
	EmployeeService employeeService;

	@Override
	public AbstractService<Employee> getService() {
		return employeeService;
	}

	@Override
	public Class<Employee> getClassT() {
		return Employee.class;
	}

	@RequestMapping(path = "/createA", method = RequestMethod.GET)
	protected Employee createA() {
		Employee employee = new Employee();
		// employee.setId("001");
		employee.setName("denis");
		employee.setAddress("address");
		return employeeService.add(employee);
		// return employee;
	}
	@RequestMapping(path = "/list", method=RequestMethod.GET)
	public List<Employee> retrieveList(){
		System.out.println("retrieveList");
		return employeeService.retrieveList();
		
	}

	/*@RequestMapping(path ="/readAll", method=RequestMethod.GET)
	public Page<Employee> retrieveByDepartment(@RequestParam(name = "department") String department,
			@RequestParam(name = "page", required = false) Integer page,
			@RequestParam(name = "size", required = false) Integer size,
			@RequestParam(name = "sort", required = false) String sort) {
		PageRequest pageRequest = applySortAndPage(page, size, sort);
		return employeeService.findByDepartment(department, pageRequest);
	}*/

	// new PageRequest(1, 10, Sort.Direction.ASC, "title", "description");
}
