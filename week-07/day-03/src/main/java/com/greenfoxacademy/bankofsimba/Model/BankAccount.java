//We are creating a Lion King based BankAccount Application today
//For this create a BankAccount class in your model package
//Add the fields name, balance, animalType in it
//In your controller create the first endpoint called /show
//Instantiate a new BankAccount("Simba", "2000", "lion")
//Add this BankAccount to the model
//Create a thymeleaf template where you show the fields of the BankAccount

package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
