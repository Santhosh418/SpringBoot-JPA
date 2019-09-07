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
		System.out.println("Employee ---------->" + employee);
		employeeRepository.save(employee);
	}

	@Override
	public EmployeeDTO getEmployeeDetails(Long id) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		EmployeeDetailsDTO employeeDetailsDTO = new EmployeeDetailsDTO();

		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
		employeeDTO.setEmployeeId(employee.getEmployeeId());
		employeeDTO.setDateOfBirth(employee.getDateOfBirth());
		employeeDTO.setContact(employee.getContact());
		employeeDTO.setEmployeeName(employee.getEmployeeName());

		employeeDetailsDTO.setCity(employee.getEmployeeDetails().getCity());
		employeeDetailsDTO.setHouseNo(employee.getEmployeeDetails().getHouseNo());
		employeeDetailsDTO.setId(employee.getEmployeeDetails().getId());
		employeeDetailsDTO.setPinCode(employee.getEmployeeDetails().getPinCode());
		employeeDetailsDTO.setState(employee.getEmployeeDetails().getState());
		employeeDetailsDTO.setStreet(employee.getEmployeeDetails().getStreet());

		employeeDTO.setEmployeeDetailsDTO(employeeDetailsDTO);
		return employeeDTO;
	}

}
