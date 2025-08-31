package com.wipro.appemployee.service;
import java.util.List;

import com.wipro.appemployee.entity.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
    
	Department getDepartmentById(Long id);
    
	Department saveDepartment(Department department);
    
	void deleteDepartmentById(Long id);
}
