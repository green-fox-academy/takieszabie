package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {


  List<BankAccount> newLionList = new ArrayList<>(Arrays.asList(
          new BankAccount("Timon", 1000, "Szurikata", false),
          new BankAccount("Pumba", 2000, "Boar", false),
          new BankAccount("Mufasa", 3000, "Lion", true),
          new BankAccount("Nala", 4000, "Lion", false),
          new BankAccount("Zordon", 5000, "Lion", true)
  ));
  @RequestMapping("/list")
  public String listAccounts(Model model) {
    model.addAttribute("accounts", newLionList);
    return "list";
  }
}
