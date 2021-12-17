package com.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @RequestMapping("/welcome")
   public String sayHello() {
      // checking build
      return "Hello Spring Boot!!";
   }
}
