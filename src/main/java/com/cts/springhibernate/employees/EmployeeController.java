package com.cts.springhibernate.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/test")
	public String testService() {
		return "Success";

	}

	@PostMapping("/insert_employee_details")
	public String saveEmployeeDetails(@RequestBody EmployeeDTO employee) {
		String status = null;
		System.out.println("State =  = = " + employee.getEmployeeDetailsDTO().getState());
		try {
			employeeService.insertEmployee(employee);
		} catch (Exception ex) {
			status = "Failed to insert employee details";
		}
		status = "Successfully inserted details";
		return status;

	}

	@GetMapping("/employee/{id}")
	public EmployeeDTO fetchEmployeeDetails(@PathVariable(value = "id") Long id) {
		EmployeeDTO employee = null;
		System.out.println("fetchEmployeeDetails ");
		employee = employeeService.getEmployeeDetails(id);
		if (employee == null) {
			throw new EmployeeNotFoundException(id);
		}
		System.out.println("employee =" + employee);

		return employee;

	}

}
