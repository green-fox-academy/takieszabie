package com.company;

import java.util.Random;

public class Pirate {
  private String name;
  private int hadRums;
  private boolean isAlive;
  private boolean isPassedOut;

  public Pirate(String name) {
    this.name = name;
    this.hadRums = 0;
    this.isAlive = true;
    this.isPassedOut = false;
  }

  public int getHadRums() {
    return hadRums;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public boolean isPassedOut() {
    return isPassedOut;
  }

  public String getName() {
    return name;
  }

  public void setPassedOut(boolean passedOut) {
    isPassedOut = passedOut;
  }

  public void drinkSomeRum(Pirate pirate1) {
    pirate1.hadRums++;
    System.out.println(pirate1.name + "had rum");
  }

  public void die() {
    isAlive = false;
  }

  public void howsItGoingMate(Pirate pirate1) {
    if (!isAlive) {
      System.out.println(pirate1.name + " is dead!");
    } else {
      if (hadRums > 0) {
        for (int i = 0; i < 3; i++) {
          System.out.println(pirate1.name+ ": Pour me anudder!");
        }
      } else {
          System.out.println(pirate1.name + ": Arghh, I'ma Pirate. How d'ya d'ink its goin?");
          pirate1.setPassedOut(true);
        }
      }
  }

  public void brawl(Pirate pirate2) {
    Random rand = new Random();
    int brawlDecider = rand.nextInt(3) + 1;
    if (brawlDecider == 1) {
      die();
    } else if (brawlDecider == 2) {
      pirate2.die();
    } else {
      die();
      pirate2.die();
    }
  }

  @Override
  public String toString() {
    return "Pirate{" +
            "name='" + name + '\'' +
            ", hadRums=" + hadRums +
            ", isAlive=" + isAlive +
            ", isPassedOut=" + isPassedOut +
            '}';
  }
}
