package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankHTMLController {

  @RequestMapping("/show2")
  public String showDetails(Model model) {
    BankAccount namedSimba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("balanceis", namedSimba.getBalance());
    return "bankofsimba";
  }
}
