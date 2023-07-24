package com.sacksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacksoft.dao.EmployeeRepo;
import com.sacksoft.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	@Override
	public List<Employee> getAll() {
		return employeeRepo.findAll();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}
	@Override
	public void DeleteData(int id) {
		
		employeeRepo.deleteById(id);
	}

}
