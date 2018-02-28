package com.company;

public class Animals {
  public static void main(String[] args) {
    Animal dog = new Animal();
    for (int i = 0; i < 5; i++) {
      dog.play();
    }
    System.out.println(dog.toString());
  }
}
