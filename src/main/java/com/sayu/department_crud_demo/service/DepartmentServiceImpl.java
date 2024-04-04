package com.sayu.department_crud_demo.service;

import com.sayu.department_crud_demo.entity.Department;
import com.sayu.department_crud_demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
       return departmentRepository.save(department);
    }
    @Override
    public List<Department> findAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + id));

    }
    @Override
    public Department updateDepartment(Long id, Department updatedDepartment) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + id));
        department.setDepartmentName(department.getDepartmentName());
        department.setDepartmentLocation(department.getDepartmentLocation());
        return departmentRepository.save(department);
    }

    @Override
    public String deleteById(Long id) {
        departmentRepository.deleteById(id);
        return "department deleted successfully!";
    }

    @Override
    public Department findDepartmentByName(String name) {
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }
}
