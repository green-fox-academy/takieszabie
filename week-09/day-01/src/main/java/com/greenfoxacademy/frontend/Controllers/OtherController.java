package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.DouledResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

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
}
