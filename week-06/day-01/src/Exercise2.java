//Write a Stream Expression to get the average value of the odd numbers from the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToDouble(n -> n)
            .average());

    oddAveragePrinter(numbers);
  }

  private static void oddAveragePrinter(ArrayList<Integer> numbers) {
    List<Integer> oddNumbers = new ArrayList<>();
    double sumOddNumbers = 0;
    for (int i = 0; i <numbers.size() ; i++) {
      if (numbers.get(i)%2 != 0) {
        oddNumbers.add(numbers.get(i));
      }
    }
    for (int i = 0; i < oddNumbers.size(); i++) {
      sumOddNumbers = sumOddNumbers + oddNumbers.get(i);
    }
    System.out.println(sumOddNumbers/oddNumbers.size());
  }
}
