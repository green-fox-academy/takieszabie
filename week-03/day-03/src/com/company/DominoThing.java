package com.company;
import java.util.Arrays;

public class DominoThing {
  private final int[] values;

  public DominoThing(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}