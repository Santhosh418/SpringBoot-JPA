package com.cts.springhibernate.employees;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long>{

}
