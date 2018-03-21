package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  private String name;
  Captain captain;
  List<Pirate> crew;

  public Ship(String name) {
    this.name = name;
    this.captain = new Captain(name + "captain");
    this.crew = new ArrayList<>();
  }

  public void fillShip(Ship ship1) {
    Random rand = new Random();
    int crewSize = rand.nextInt(9) + 1;

    crew.add(captain);
    for (int i = 0; i < crewSize; i++) {
      crew.add(new Pirate(ship1.name + "pirate" + i));
    }
    System.out.println(ship1.name + " created");
    System.out.println(ship1.name + " captain is: " + ship1.captain.getName());
    System.out.println(ship1.captain.getName() + " is alive: " +ship1.captain.isAlive());
    System.out.println(ship1.captain.getName() + " is passed out: " +ship1.captain.isPassedOut());
    System.out.println(ship1.captain.getName() + " had " + ship1.captain.getHadRums() + " rums.");
    System.out.println("Number of alive crew members is: " + crew.size());
  }

  public boolean battle(Ship otherShip) {
    List<Pirate> attackedAlivePirates = new ArrayList<>();
    List<Pirate> attackerAlivePirates = new ArrayList<>();
    for (int i = 0; i <otherShip.crew.size() ; i++) {
      if (!(otherShip.crew.get(i) instanceof Captain) && otherShip.crew.get(i).isAlive() == true) {
        attackedAlivePirates.add(otherShip.crew.get(i));
      }
    }
    for (int i = 0; i < this.crew.size() ; i++) {
      if (!(this.crew.get(i) instanceof Captain) && this.crew.get(i).isAlive() == true) {
        attackerAlivePirates.add(this.crew.get(i));
      }
    }
    int attackerScore = attackerAlivePirates.size() + this.captain.getHadRums();
    int attackedScore = attackedAlivePirates.size() + otherShip.captain.getHadRums();

    Random randDeaths = new Random();

    if (attackedScore >= attackerScore) {
      for (int i = 0; i <randDeaths.nextInt(this.crew.size()+1) ; i++) {
        this.crew.get(i).die();
      }
      this.captain.drinkSomeRum(captain);
      return true;
    } else {
      for (int i = 0; i <randDeaths.nextInt(otherShip.crew.size()+1) ; i++) {
      otherShip.crew.get(i).die();
    }
      otherShip.captain.drinkSomeRum(captain);
      return false;
    }
  }
}