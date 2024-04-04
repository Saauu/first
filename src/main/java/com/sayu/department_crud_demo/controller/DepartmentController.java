package com.sayu.department_crud_demo.controller;

import com.sayu.department_crud_demo.entity.Department;
import com.sayu.department_crud_demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService ;

    //private final Logger LOGGER = LoggerFactory.getLogger(Department.class);

    @PostMapping
    public Department createDepartment(@Validated @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.findAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return departmentService.findDepartmentById(id);
        }
    @GetMapping("/{name}")
    Department findDepartmentByName(@PathVariable String name){
        return departmentService.findDepartmentByName(name);
    }
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department updatedDepartment) {
        return departmentService.updateDepartment(id, updatedDepartment);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        return departmentService.deleteById(id);
    }
}
