package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

  @Value("${coach.name}")
  private String coachName;

  @Value("${team.name}")
  private String teamName;

  // expose "/" that return "Hello World"
  // localhost:8080
  @GetMapping("/")
  public String sayHello() {
    return "Hello World" + " by " + coachName + " from: " + teamName;
  }
}
