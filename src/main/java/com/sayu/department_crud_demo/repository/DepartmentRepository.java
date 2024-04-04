package com.sayu.department_crud_demo.repository;

import com.sayu.department_crud_demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    @Query(value = "SELECT * from Department WHERE departmentName=?1", nativeQuery = true)
    public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String name);
}
