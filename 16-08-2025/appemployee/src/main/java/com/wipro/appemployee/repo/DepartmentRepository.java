package com.wipro.appemployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.appemployee.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}