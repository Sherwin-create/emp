package com.sherwin.empl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherwin.empl.model.EmployeeModel;
import com.sherwin.empl.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public List<EmployeeModel> getEmployee() {
		return repo.findAll();
	}

	public EmployeeModel addEmployee(EmployeeModel model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}
	
	

}
