package com.greenfoxacademy.springstart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong count = new AtomicLong(1);


  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("fname") String firstName) {
        model.addAttribute("name", firstName);
        model.addAttribute("numberOfLoadings", count.getAndIncrement());
    return "greeting";
  }
}
