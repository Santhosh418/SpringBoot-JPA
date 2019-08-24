package com.cts.springhibernate.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	@Override
	public void insertEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setId(employeeDTO.getEmployeeDetailsDTO().getId());
		employeeDetails.setCity(employeeDTO.getEmployeeDetailsDTO().getCity());
		employeeDetails.setState(employeeDTO.getEmployeeDetailsDTO().getState());
		employeeDetails.setHouseNo(employeeDTO.getEmployeeDetailsDTO().getHouseNo());
		employeeDetails.setStreet(employeeDTO.getEmployeeDetailsDTO().getStreet());
		employeeDetails.setPinCode(employeeDTO.getEmployeeDetailsDTO().getPinCode());
		
		
		employee.setEmployeeId(employeeDTO.getEmployeeId());
		employee.setEmployeeName(employeeDTO.getEmployeeName());
		employee.setDateOfBirth(employeeDTO.getDateOfBirth());
		employee.setContact(employeeDTO.getContact());
		employee.setEmployeeDetails(employeeDetails);
		System.out.println("Employee ---------->"+employee);
		employeeRepository.save(employee);	
	}
	
	
	

}
