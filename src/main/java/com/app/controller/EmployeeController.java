package com.app.controller;

import com.app.config.HibernateConfig;
import com.app.domain.Employee;
import com.app.services.EmployeeService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by swapan on 19/6/17.
 */

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @RequestMapping(value = "/")
    public String test() {
        System.out.println("my controller running");
        return "employee/home";
    }

    @RequestMapping(value = "/employee/list")
    public String getEmployeeList(Model model) {
        Session session = HibernateConfig.getSession();
        session.beginTransaction();
        List<Employee> employeeList = null;
        try {
            /*Employee emp = new Employee();
            emp.setEmpId(7l);
            emp.setName("Sundar");
            emp.setDesignation("CEO");
            System.out.println(emp);
            System.out.println(session);
            session.save(emp.getClass().toString(), emp);
            System.out.println("session=========" + session);
            session.getTransaction().commit();*/

            //TODO: Read data from DB
            employeeList=employeeService.getEmployeeList(session);
            System.out.println(employeeList);
        } catch (RuntimeException ex) {
            System.out.println("Exception Occurred :: "+ex.getMessage());
            ex.printStackTrace();
        } finally {
            session.close();
        }
        model.addAttribute("name", "Tom");
        model.addAttribute("employeeList", employeeList);
        return "employee/employeeList";
    }

    @RequestMapping(value = "/employee/add")
    public String addEmployee(Model model){
        Session session = HibernateConfig.getSession();
        session.beginTransaction();
        try {
            Employee emp = new Employee();
            emp.setEmpId(8l);
            emp.setName("Mark");
            emp.setDesignation("CEO");
            System.out.println(emp);
            System.out.println(session);
            session.save(emp.getClass().toString(), emp);
            System.out.println("session=========" + session);
            session.getTransaction().commit();
        } catch (RuntimeException ex) {
            System.out.println("Exception Occurred :: "+ex.getMessage());
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return "employee/home";
    }
}

