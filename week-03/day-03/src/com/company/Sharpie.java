package com.company;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }

  @Override
  public String toString() {
    return "Sharpie{" +
            "color='" + color + '\'' +
            ", width=" + width +
            ", inkAmount=" + inkAmount +
            '}';
  }
}