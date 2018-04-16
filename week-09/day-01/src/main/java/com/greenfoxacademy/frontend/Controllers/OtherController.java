package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.Appended;
import com.greenfoxacademy.frontend.Models.DouledResponse;
import com.greenfoxacademy.frontend.Models.Greeting;
import com.greenfoxacademy.frontend.Models.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OtherController {

  @Autowired
  OperationService operationService;

  @GetMapping("/doubling")
  public DouledResponse doubler(@RequestParam(name = "input", required = false) Integer input){
    if (input == null){
      return new DouledResponse();
    } else {
      return new DouledResponse(input);
    }
  }

  @GetMapping("/greeter")
  public Greeting greeting(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title){
    if (name == null || title == null){
      return new Greeting();
    } else {
      return new Greeting(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Appended appended(@PathVariable(name = "appendable") String appendable){
    return new Appended(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Operation operation(@PathVariable String what, @RequestBody(required = false) Operation operate ){
    if (operate == null){
      return new Operation();
    } else if(what.equals("sum")) {
      return OperationService.sum(operate.getUntil());
    } else {
      return OperationService.factor(operate.getUntil());
    }
  }
}
