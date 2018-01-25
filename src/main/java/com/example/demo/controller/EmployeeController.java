//package com.example.demo.controller;
//
//import com.example.demo.serviece.EmployeeServiece;
//import com.example.demo.model.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//public class EmployeeController {
//
//    @Autowired
//    EmployeeServiece employeeServiece;
//
////    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
////    public String login() {
////        return "login";
////    }
//
//    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
//    public String register(@ModelAttribute(value = "employee") Employee employee) {
//        System.out.println("What is this ");
//        employeeServiece.saveEmployee(employee);
//        return "registrationSuccess";
//    }
//}