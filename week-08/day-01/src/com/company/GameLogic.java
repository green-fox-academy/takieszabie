package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {
  private static List<Card> white = new ArrayList<>();
  private static List<Card> black = new ArrayList<>();

  public static void parseHand(String hands) {
    String whiteHand = hands.substring(29, 43);
    String[] whiteCards = whiteHand.split(" ");
    white = convertToCardList(whiteCards);

    String blackHand = hands.substring(7, 21);
    String[] blackCards = blackHand.split(" ");
    black = convertToCardList(blackCards);
  }

  private static List<Card> convertToCardList(String[] hand) {
    List<Card> handList = new ArrayList<>();
    for (String s : hand) {
      if (Character.isLetter(s.charAt(0))) {
        handList.add(new Card(s.charAt(0), s.charAt(1)));
      } else {
        final int offset = 48;
        int numberValue = s.charAt(0) - offset;
        handList.add(new Card(numberValue, s.charAt(1)));
      }
    }
    return handList;
  }

  public static String decideWinner() {
    String winner = "";
    winner = compareHighestCards();
    return winner;
  }

  public static String compareHighestCards() {
    int highestWhite = 0;
    for (Card c : white) {
      if (c.getNumberValue() > highestWhite) {
        highestWhite = c.getNumberValue();
      }
    }
    int highestBlack = 0;
    for (Card c : black) {
      if (c.getNumberValue() > highestBlack) {
        highestBlack = c.getNumberValue();
      }
    }

    if (highestBlack > highestWhite) {
      return "black";
    } else if (highestBlack < highestWhite) {
      return "white";
    }
    return "draw";
  }

  public static boolean whiteHasPair() {
    for (int i = 0; i < white.size(); i++) {
      for (int j = i + 1; j < white.size(); j++) {
        if (white.get(i).getNumberValue() == white.get(j).getNumberValue()) {
          return true;
        }
      }
    }
    return false;
  }

  public static int whitePairValue() {
    int highestPairValue = 0;
    for (int i = 0; i < white.size(); i++) {
      for (int j = i + 1; j < white.size(); j++) {
        if (white.get(i).getNumberValue() == white.get(j).getNumberValue()) {
          highestPairValue = white.get(i).getNumberValue();
        }
      }
    }
    return highestPairValue;
  }
}