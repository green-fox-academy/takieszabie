package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankHTMLController {
  BankAccount namedSimba = new BankAccount("Simba", 2000, "lion", true);
  String htmlCode = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

  @RequestMapping("/show2")
  public String showDetails(Model model) {
    model.addAttribute("balanceis", namedSimba.getBalance());
    return "bankofsimba";
  }

  @RequestMapping("/show3")
  public String showString(Model model) {
    model.addAttribute("balanceis", namedSimba.getBalance());
    model.addAttribute("htmlCodeGiven", htmlCode);
    return "bankofsimba";
  }
}
