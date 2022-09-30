package com.practice.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.demo.model.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> employee = new ArrayList<>( Arrays.asList(
			new Employee("1", "om", "satara"),
			new Employee("2", "ak", "pune"),
			new Employee("3", "akki", "mumbai"),
			new Employee("4", "rj", "kolhapur")
			));
	public List<Employee> getAllEmployee(){
		return employee;
	}
	
	
	public Employee getEmployee(String id) {
		return employee.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
	public void addEmployee(Employee employees) {
		employee.add(employees);
	}
	
	public void updateEmployee(String id, Employee employees) {
		for(int i = 0; i < employee.size(); i++) {
			Employee e = employee.get(i);
			if(e.getId().equals(id)) {
				employee.set(i, employees);
				return;
			}
		}
	}
	
	public void deleteEmployee(String id) {
		employee.removeIf(t -> t.getId().equals(id));
	}
}
















