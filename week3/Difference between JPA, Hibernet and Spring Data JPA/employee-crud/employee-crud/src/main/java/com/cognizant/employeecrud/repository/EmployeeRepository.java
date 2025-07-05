package com.cognizant.employeecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.employeecrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}