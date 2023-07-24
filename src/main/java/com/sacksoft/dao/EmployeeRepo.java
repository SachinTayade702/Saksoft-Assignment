package com.sacksoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacksoft.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
