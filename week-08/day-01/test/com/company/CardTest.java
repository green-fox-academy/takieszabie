package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
  @Test
  public void calculateNumberValue_Test() {
    Assert.assertEquals(Card.calculateNumberValue('T'), 10 );
    Assert.assertEquals(Card.calculateNumberValue('J'), 11 );
    Assert.assertEquals(Card.calculateNumberValue('Q'), 12 );
    Assert.assertEquals(Card.calculateNumberValue('K'), 13 );
    Assert.assertEquals(Card.calculateNumberValue('A'), 14 );
    Assert.assertEquals(Card.calculateNumberValue('B'), 0 );
  }
}