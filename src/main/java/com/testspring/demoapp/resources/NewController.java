package com.testspring.demoapp.resources;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testspring.demoapp.model.Employee;


@RestController
public class NewController 
{
		@RequestMapping("/test")
		public String test()
		{
			return "test";
		}
		
		@GetMapping("/test/emp")
		public ResponseEntity<Employee> getEmployee()
		{
			return new ResponseEntity<Employee>(new Employee("ID-1001", "Aman", "7698342476"), HttpStatus.OK);
		}
}