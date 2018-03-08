import java.util.List;

public class Sum {
  public Sum(List<Integer> inputIntegers) {
  }

  public int summer(List<Integer> inputIntegers) {
    int sum = 0;
    for (int i = 0; i < inputIntegers.size(); i++) {
      sum = sum + inputIntegers.get(i);
    }
    return sum;
  }

  public Sum() {
  }
}