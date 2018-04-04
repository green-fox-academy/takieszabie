package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;

import java.util.Arrays;
import java.util.List;

public class AccountService {
  public static List<BankAccount> listAll() {
    List<BankAccount> lionKingCharacters = Arrays.asList(
            new BankAccount("Timon", 1000, "Szurikata", false),
            new BankAccount("Pumba", 2000, "Boar", false),
            new BankAccount("Mufasa", 3000, "Lion", true),
            new BankAccount("Nala", 4000, "Lion", false),
            new BankAccount("Zordon", 5000, "Lion", true)
    );
    return lionKingCharacters;
  }
}
