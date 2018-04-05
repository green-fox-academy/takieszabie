package com.greenfoxacademy.dependencypractice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilController {

  @RequestMapping("/useful")
  public String showDetails(Model model) {
    model.addAttribute("name", "usefulUtilities");
    return "usefulUtil";
  }
  @RequestMapping("/useful/colored")
  public String coloredBackgroud(Model model) {
    model.addAttribute("colorful", "coloredBackground");
    return "colorful";
  }

}
