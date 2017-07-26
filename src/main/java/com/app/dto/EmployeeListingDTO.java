package com.app.dto;

/**
 * Created by swapan on 20/6/17.
 */
public class EmployeeListingDTO {
    public Long empId;
    public String name;
    public String designation;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
