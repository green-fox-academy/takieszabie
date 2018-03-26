//Write a Stream Expression to find the uppercase characters in a string!

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Character.isUpperCase;

public class Exercise5 {
  public static void main(String[] args) {
    String inputString = "MegeSzlekTeKisPepitaSSSSzájÚ";

    System.out.println("With streaming: These characters are uppercase in the given string:");
    inputString.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char)c))
            .forEach(n -> System.out.println(n));

    findUpperCase(inputString);

  }

  private static void findUpperCase(String inputString) {
    System.out.println("With traditional method: These characters are uppercase in the given string:");
    for (int i = 0; i <inputString.length() ; i++) {
      if (isUpperCase(inputString.charAt(i))) {
        System.out.println(inputString.charAt(i));
      }
    }
  }
}
