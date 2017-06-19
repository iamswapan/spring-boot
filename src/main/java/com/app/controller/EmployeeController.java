package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
        return "employee/employeeList";
    }
}

