
public class DominoThing implements Comparable<DominoThing> {
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

  @Override
  public int compareTo(DominoThing o) {
    if (this.values[0] < o.values[0]) {
      return -1;
    } else if (this.values[0] > o.values[0]) {
      return 1;
    } else {
      //you can check more fields -> new if-elseif-else; if the above is not enough f.e. numbers are equal
      return 0;
    }
  }
}