package com.sherwin.empl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sherwin.empl.model.EmployeeModel;
import com.sherwin.empl.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/api/employees")
	public ResponseEntity<?> getEmployee() {
		return ResponseEntity.ok(service.getEmployee());
	}
	
	@PostMapping("/api/addEmployees")
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeModel model) {
		return ResponseEntity.ok(service.addEmployee(model));
	}
	
}
