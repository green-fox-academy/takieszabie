//Create an Animal class
//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one

package com.company;

public class Animal {
  private int hunger;
  private int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat () {
    hunger--;
  }

  public void drink () {
    thirst--;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "hunger=" + hunger +
            ", thirst=" + thirst +
            '}';
  }

  public void play () {
    thirst++;
    hunger++;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

}