package com.greenfoxacademy.foxagochi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

  @GetMapping("/")
  public String showIndex() {
    return "index";
  }

  @GetMapping("/login")
  public String renderLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String loginParam(@RequestParam(name = "username") String username, Model model) {
    model.addAttribute("name", username);

    return "login";
  }

  @GetMapping("/loggedin")
  public String loggedinParam(@RequestParam("name") String username, Model model) {
    model.addAttribute("username", username);
    return "loggedin";
  }
}
