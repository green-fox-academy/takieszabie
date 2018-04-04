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

  @RequestMapping("/list")
  public String listAccounts(Model model) {
    model.addAttribute("accounts", AccountService.listAll());
    return "list";
  }
}
