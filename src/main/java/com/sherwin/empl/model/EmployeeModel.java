package com.sherwin.empl.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employee_table")
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name")
	private String empFirstName;
	
	@Column(name = "last_name")
	private String empLastName;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date date;

	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}
	
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	
	public String getEmpLastName() {
		return empLastName;
	}
	
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	
}
