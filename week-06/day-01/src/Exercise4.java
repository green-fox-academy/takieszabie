//Write a Stream Expression to find which number squared value is more then 20 from the following array:

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    System.out.println("With stream: The square of the following numbers is bigger than 20:");
    numbers.stream()
            .filter(n -> n*n >20)
            .forEach(n -> System.out.println(n));

    bigSquaredValueFinder(numbers);
  }

  private static void bigSquaredValueFinder(ArrayList<Integer> numbers) {
    System.out.println("\nWith traditional method: The square of the following numbers is bigger than 20:");
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i)*numbers.get(i) > 20) {
        System.out.println(numbers.get(i));
      }
    }
  }
}
