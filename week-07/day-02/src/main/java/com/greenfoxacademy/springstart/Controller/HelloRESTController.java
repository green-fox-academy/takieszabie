package com.greenfoxacademy.springstart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong count = new AtomicLong(1);

  @RequestMapping("/greeting")
  @ResponseBody
  public String greeting(   @RequestParam("fname") String firstName) {
    Greeting newGreet = new Greeting(count.getAndIncrement(),firstName);
    return "Id: " + newGreet.getId() + " content: Hello, " + newGreet.getContent();
  }

}
