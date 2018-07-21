package com.pro.denis.hrm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pro.denis.hrm.domain.Employee;
import com.pro.denis.hrm.service.business.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends AbstractController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(path = "/create", method = RequestMethod.GET)
	public Employee create() {
		Employee employee = new Employee();
		// employee.setId("001");
		employee.setName("denis");
		employee.setAddress("address");
		employeeService.save(employee);
		return null;
		// return employee;
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
