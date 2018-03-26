//Write a Stream Expression to get the even numbers from the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream()
            .filter(n -> n%2==0)
            .forEach(n -> System.out.println(n));

    evenPrinter(numbers);

  }

  private static void evenPrinter(ArrayList<Integer> numbers) {
    List<Integer> evenNumbers = new ArrayList<>();
    for (int i = 0; i <numbers.size() ; i++) {
      if (numbers.get(i)%2 ==0) {
        evenNumbers.add(numbers.get(i));
      }
    }
    System.out.println(evenNumbers.toString());
  }
}
