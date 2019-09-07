package com.cts.springhibernate.employees;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public final ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(Exception ex, WebRequest request){
		System.out.println("CustomExceptionHandler");
		ErrorResponse er = new ErrorResponse();
		er.setTimestamp(LocalDateTime.now());
		er.setError(ex.getMessage());
		er.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ErrorResponse>(er,HttpStatus.NOT_FOUND);
	}

}
