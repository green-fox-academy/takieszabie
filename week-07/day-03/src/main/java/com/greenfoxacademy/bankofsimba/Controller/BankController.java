package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

  @RequestMapping("/show")
  public String showDetails() {
    BankAccount namedSimba = new BankAccount("Simba", 2000, "lion");
    return namedSimba.getName()+namedSimba.getBalance()+namedSimba.getAnimalType();
  }
}
