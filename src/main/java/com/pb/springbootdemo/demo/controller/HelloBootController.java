package com.pb.springbootdemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootController {
  @GetMapping("/hello")
 public String hello(){
   return "hello,Spring Boot!";
  }

}
