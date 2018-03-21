package com.company;

public class BattleApp {
  public static void main(String[] args) {
    Ship santaMaria = new Ship("santaMaria");
    Ship blackPearl = new Ship("blackPearl");

    santaMaria.fillShip(santaMaria);
    blackPearl.fillShip(blackPearl);
    System.out.println(santaMaria.battle(blackPearl));
  }
}
