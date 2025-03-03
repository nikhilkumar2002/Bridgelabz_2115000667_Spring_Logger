package com.example.SpringLogger.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "IT";

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "DepartmentBean{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
