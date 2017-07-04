package com.app.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by swapan on 21/6/17.
 */

@Entity
@Table(name = "employee")
public class Employee implements Serializable {


    private static final long serialVersionUID = 208L;

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Long empId;
    public String name;
    public String designation;


    public Employee() {
    }

    /*public Long getEmpId() {
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
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
