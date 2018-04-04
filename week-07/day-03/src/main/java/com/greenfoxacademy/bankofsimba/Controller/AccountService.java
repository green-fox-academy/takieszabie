package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;

import java.util.Arrays;
import java.util.List;

public class AccountService {
  public static List<BankAccount> listAll() {
    List<BankAccount> lionKingCharacters = Arrays.asList(
            new BankAccount("Timon", 1000, "Szurikata"),
            new BankAccount("Pumba", 2000, "Boar"),
            new BankAccount("Mufasa", 3000, "Lion"),
            new BankAccount("Nala", 4000, "Lion"),
            new BankAccount("Zordon", 5000, "Lion")
    );
    return lionKingCharacters;
  }
}
