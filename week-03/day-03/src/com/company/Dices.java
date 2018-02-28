package com.company;

public class Dices {
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reroll();
    myDice.getCurrent();
    myDice.reroll(4);
    myDice.getCurrent();

    checkDice(myDice);
    System.out.println(myDice.toString());
  }

  private static void checkDice(Dice myDice) {
    for (int i = 0; i < myDice.getCurrent().length; i++) {
      if (myDice.getCurrent(i) != 6) {
        reRoller(myDice, i);
      }
    }
  }

  private static void reRoller(Dice myDice, int i) {
    boolean isSix = false;
    while (isSix == false) {
      myDice.reroll(i);
      if (myDice.getCurrent(i) == 6) {
        isSix = true;
      }
    }
  }
}