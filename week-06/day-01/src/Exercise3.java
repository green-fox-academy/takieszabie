//Write a Stream Expression to get the squared value of the positive numbers from the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream()
            .filter(n -> n>0)
            .mapToInt(n -> n*n)
            .forEach(n -> System.out.println(n));

    squareOfPositives(numbers);
  }

  private static void squareOfPositives(ArrayList<Integer> numbers) {
    List<Integer> squaredPositives = new ArrayList<>();
    for (int i = 0; i < numbers.size() ; i++) {
      if (numbers.get(i) > 0) {
        squaredPositives.add(numbers.get(i)*numbers.get(i));
      }
    }
    System.out.println(squaredPositives.toString());
  }
}
