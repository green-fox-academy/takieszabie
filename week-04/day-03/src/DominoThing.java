
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
    if (values[0] < o.values[0]) {
      return -1;
    } else if (values[0] > o.values[0]) {
      return 1;
    } else {
      if(values[1] < o.values[1]) {
        return -1;
      } else if (values[1] > o.values[1]) {
        return 1;
      } else return 0;
    }
  }
}