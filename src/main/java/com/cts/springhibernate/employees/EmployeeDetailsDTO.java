package com.cts.springhibernate.employees;


public class EmployeeDetailsDTO {
	
	private Long id;
	
	private String houseNo;
	
	private String street;

	private String city;

	private String state;
	
	private int pinCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
