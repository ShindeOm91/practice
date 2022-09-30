package com.practice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.model.Employee;
import com.practice.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
		
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(value= "/employee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employees) {
		employeeService.addEmployee(employees);
	}
	
	
	@RequestMapping(value = "/employee/{id}" , method = RequestMethod.PUT)
	public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id, employee);
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(String id) {
		employeeService.deleteEmployee(id);
	}

}











