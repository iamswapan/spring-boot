package com.app;

import com.app.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by swapan on 13/6/17.
 */

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("**************My Spring Boot Application is up and running*************");
        SpringApplication.run(MainApplication.class, args);
        System.out.println("**************My Spring Boot Application is finished sucessfully*************");
        /*SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Employee emp=new Employee();
        //emp.setId(5);
        emp.setName("Mark");
        emp.setDesignation("CEO");
        session.save(emp);
        session.getTransaction().commit();
        session.close();*/
    }
}
