package com.cts.springhibernate.employees;

public class EmployeeDTO {
	private Long employeeId;
	
	private String employeeName;
	
	private String contact;

	private String dateOfBirth;

	private EmployeeDetailsDTO employeeDetailsDTO;
	
	
	
	
	public EmployeeDetailsDTO getEmployeeDetailsDTO() {
		return employeeDetailsDTO;
	}

	public void setEmployeeDetailsDTO(EmployeeDetailsDTO employeeDetailsDTO) {
		this.employeeDetailsDTO = employeeDetailsDTO;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", contact=" + contact
				+ ", dateOfBirth=" + dateOfBirth + ", employeeDetailsDTO=" + employeeDetailsDTO + "]";
	}

	
	
	

}
