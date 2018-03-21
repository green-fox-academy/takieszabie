package com.company;

public class BattleApp {
  public static void main(String[] args) {
    Ship santaMaria = new Ship("santaMaria");
    Ship blackPearl = new Ship("blackPearl");

    santaMaria.fillShip(santaMaria);
    blackPearl.fillShip(blackPearl);
    System.out.println(santaMaria.battle(blackPearl));
    for (int i = 0; i < santaMaria.crew.size(); i++) {
      System.out.println(santaMaria.crew.get(i).toString());
    }
    for (int i = 0; i < blackPearl.crew.size(); i++) {
      System.out.println(blackPearl.crew.get(i).toString());
    }
  }
}
