package com.sacksoft.service;

import java.util.List;

import com.sacksoft.entity.Employee;

public interface EmployeeService {

	List<Employee> getAll();

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void DeleteData(int id);

}
