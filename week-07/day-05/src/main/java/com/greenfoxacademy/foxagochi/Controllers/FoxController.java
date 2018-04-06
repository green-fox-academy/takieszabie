package com.greenfoxacademy.foxagochi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    @RequestMapping("/index")
    public String greeting(Model model) {
      model.addAttribute("name", "");
      return "index";
    }
  }
