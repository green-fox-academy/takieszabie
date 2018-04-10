package com.company;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {

  @Test
  public void compareHighestCards_Test() {
    String hands = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";
    GameLogic.parseHand(hands);

    String expectedWinner = GameLogic.compareHighestCards();

    Assert.assertEquals(expectedWinner, "white");
    
  }

  @Test
  public void whiteHasPair_test() {
    String hands = "Black: 2H 4S 4C 2D 4H White: 2H 4S 4C 2D 4H";
    GameLogic.parseHand(hands);
    Assert.assertTrue(GameLogic.whiteHasPair());
  }

  @Test
  public void pairValue_Test() {
    String hands = "Black: 2H 4S 4C 2D 4H White: 2H 3S 5C 2D 4H";
    GameLogic.parseHand(hands);
    Assert.assertEquals(GameLogic.whitePairValue(), 2);
  }

}