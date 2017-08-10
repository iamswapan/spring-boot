package com.app.services;

import com.app.domain.Employee;
import jdk.internal.dynalink.linker.LinkerServices;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by swapan on 19/6/17.
 */

@Service
public class EmployeeService {

    public List<Employee> getEmployeeList(Session session){
        List<Employee> employeeList;
        employeeList=session.createCriteria(Employee.class).list();
        return employeeList;
    }

}
