package com.company;

public class Card {
  private char color;
  private int numberValue;
  private char faceValue;

  public Card(int numberValue, char color) {
    this.color = color;
    this.numberValue = numberValue;
  }

  public Card(char faceValue, char color) {
    this.color = color;
    this.faceValue = faceValue;
    numberValue = calculateNumberValue(faceValue);
  }

  public static int calculateNumberValue(char faceValue) {
    switch (faceValue) {
      case 'T':
        return 10;
      case 'J':
        return 11;
      case 'Q':
        return 12;
      case 'K':
        return 13;
      case 'A':
        return 14;
      default:
        return 0;
    }
  }

  public char getColor() {
    return color;
  }

  public void setColor(char color) {
    this.color = color;
  }

  public int getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(int numberValue) {
    this.numberValue = numberValue;
  }

  public char getFaceValue() {
    return faceValue;
  }

  public void setFaceValue(char faceValue) {
    this.faceValue = faceValue;
  }

  @Override
  public String toString() {
    return "Card{" +
            "color=" + color +
            ", numberValue=" + numberValue +
            ", faceValue='" + faceValue + '\'' +
            '}';
  }
}
