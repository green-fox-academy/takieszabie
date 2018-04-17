package com.greenfoxacademy.groot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Grooting grootTranslate(@RequestParam(name = "message", required = false) String message ){
    if (message == null){
      return new Grooting();
    } else {
      return new Grooting(message);
    }
  }
}
