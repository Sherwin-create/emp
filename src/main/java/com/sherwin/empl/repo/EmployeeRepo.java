package com.sherwin.empl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherwin.empl.model.EmployeeModel;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long>{
	
}
