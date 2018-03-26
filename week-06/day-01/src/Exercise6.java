//Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Exercise6 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    cities.stream()
            .filter(p -> p.startsWith("A"))
            .filter(p -> p.endsWith("I"))
            .forEach(p -> System.out.println(p));

  }

}
