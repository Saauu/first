package com.sayu.department_crud_demo.service;

import com.sayu.department_crud_demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
   public List<Department> findAllDepartment();

    public Department findDepartmentById(Long id);

    Department updateDepartment(Long id, Department updatedDepartment);

    public String deleteById(Long id);

    Department findDepartmentByName(String name);
}
