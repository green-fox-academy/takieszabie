//Write a Stream Expression to find the frequency of characters in a given string!

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    String inputString = "MegeSzlekTeKisPepitaSSSSzájÚadfkdsjfdlqakjfílkjwHREfsdhjcyíc";

    System.out.println("With streaming: count the number of a character in a given string");
    System.out.println(inputString.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
