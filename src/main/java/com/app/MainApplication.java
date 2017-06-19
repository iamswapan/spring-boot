package com.app;

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
    }
}
