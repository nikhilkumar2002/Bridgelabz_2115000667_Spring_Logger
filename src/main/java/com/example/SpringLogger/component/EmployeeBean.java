package com.example.SpringLogger.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Nikhil Kumar";

    @Autowired  // Dependency Injection for DepartmentBean
    private DepartmentBean department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentBean getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentBean department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
