package com.app.controller;

import com.app.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by swapan on 19/6/17.
 */

@Controller
public class EmployeeController {
    @RequestMapping(value ="/" )
    public String test(){
        System.out.println("my controller running");
        return "employee/home";
    }

    @RequestMapping(value = "/employee/list")
    public String getEmployeeList(Model model){
        /*Session session= HibernateConfig.getSession();
        session.beginTransaction();*/

        Employee emp=new Employee();
//        emp.setEmpId(5l);
//        emp.setName("Mark");
//        emp.setDesignation("CEO");

        emp.empId = 5l;
        emp.designation = "worker";
        emp.name = "ABC";

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        System.out.println(emp);
        System.out.println(session);
        session.save(emp.getClass().toString(), emp);
        System.out.println("session=========" + session);
        session.getTransaction().commit();
        session.close();
        model.addAttribute("name", "Tom");
        return "employee/employeeList";
    }
}

