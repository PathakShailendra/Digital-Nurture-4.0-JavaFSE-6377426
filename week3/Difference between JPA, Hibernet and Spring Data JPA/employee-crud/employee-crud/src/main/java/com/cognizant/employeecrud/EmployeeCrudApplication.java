package com.cognizant.employeecrud;

import com.cognizant.employeecrud.service.EmployeeService;
import com.cognizant.employeecrud.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@SpringBootApplication
public class EmployeeCrudApplication {

	private static EmployeeService employeeService;

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeCrudApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeCrudApplication.class, args);
		employeeService = context.getBean(EmployeeService.class);

		testAddEmployee();
		testGetAllEmployees();
	}

	private static void testAddEmployee() {
		LOGGER.info("Start - testAddEmployee");
		Employee emp = new Employee();
		emp.setName("John Doe");
		emp.setDepartment("HR");
		emp.setSalary(45000);
		employeeService.addEmployee(emp);
		LOGGER.info("End - testAddEmployee");
	}

	private static void testGetAllEmployees() {
		LOGGER.info("Start - testGetAllEmployees");
		List<Employee> list = employeeService.getAllEmployees();
		list.forEach(emp -> LOGGER.debug("Employee: {}", emp));
		LOGGER.info("End - testGetAllEmployees");
	}
}
