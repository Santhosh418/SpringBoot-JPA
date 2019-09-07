package com.cts.springhibernate.employees;

import java.util.Optional;

public interface EmployeeService {

	void insertEmployee(EmployeeDTO employee);
	
	EmployeeDTO getEmployeeDetails(Long id);
	
}
