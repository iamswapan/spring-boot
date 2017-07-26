package com.app.controller;

import com.app.config.HibernateConfig;
import com.app.domain.Employee;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by swapan on 19/6/17.
 */

@Controller
public class EmployeeController {
    @RequestMapping(value = "/")
    public String test() {
        System.out.println("my controller running");
        return "employee/home";
    }

    @RequestMapping(value = "/employee/list")
    public String getEmployeeList(Model model) {
        Session session = HibernateConfig.getSession();
        try {
            session.beginTransaction();

            Employee emp = new Employee();
            emp.setEmpId(5l);
            emp.setName("Mark");
            emp.setDesignation("CEO");
            session.beginTransaction();
            System.out.println(emp);
            System.out.println(session);
            session.save(emp.getClass().toString(), emp);
            System.out.println("session=========" + session);
            session.getTransaction().commit();
            session.close();
        } catch (RuntimeException ex) {
            System.out.println("Exception Occurred :: "+ex.getMessage());
        } finally {
            session.close();
        }
        model.addAttribute("name", "Tom");
        return "employee/employeeList";
    }
}

