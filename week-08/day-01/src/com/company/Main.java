package com.company;

public class Main {

    public static void main(String[] args) {
        String hands = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";
        System.out.println(hands);
        GameLogic.parseHand(hands);
    }
}
