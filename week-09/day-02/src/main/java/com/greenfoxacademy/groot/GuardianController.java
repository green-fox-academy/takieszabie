package com.greenfoxacademy.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<Grooting> grootTranslate(@RequestParam(name = "message", required = false) String message ){
    if (message == null){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Grooting());
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Grooting(message));
    }
  }
}
