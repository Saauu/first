package com.sayu.department_crud_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Getter
    private  long departmentId;
    //@Getter
    //@Setter
    @NotNull//(message = "please Enter Valid department Input)
    //@Size(max=5,min=1)
    private String departmentName;
    private  String departmentCode;
    private  String departmentLocation;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentLocation='" + departmentLocation + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
