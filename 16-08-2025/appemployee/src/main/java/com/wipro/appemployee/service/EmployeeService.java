package com.wipro.appemployee.service;
import java.util.List;

import com.wipro.appemployee.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
    
	Employee getEmployeeById(Long id);
    
	//List<Employee> getEmployeeByName(String name);
    
	Employee updateEmployee(Long id, Employee employee);
	
	List<Employee> getAllEmployees();
    
	void deleteEmployee(Long id);
}
