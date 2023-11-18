package com.employee.task1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.task1.dto.Employee;
import com.employee.task1.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	//create method
	@PostMapping("/create-empinformation")
public String createEmpInfo(@RequestBody Employee emp) {
		service.saveEmpInfo(emp);
	return "Employee info created successfully";	
  }
	//get data
	@GetMapping("/get-empinformation")
	public List<Employee> getEmployee(){
		return service.getEmployee();
	}
	//updating data
	@PutMapping("/update-empinformation")
	public String updateEmpoyee(@RequestBody Employee emp) {
		service.updateEmployee(emp);
		return "Employee info updated successfully";	
	}
	//deleting data
	@DeleteMapping("/delete-empinformation")
	public String deleteEmployee(int id) {
		service.deleteEmployee(id);
		return "Employee information deleted";
		
}
}