//Write a Stream Expression to convert a char array to a string!

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    Character[] chars = {new Character('a'),new Character('b'),new Character('c'),new Character('c'),new Character('c'),new Character('c'),new Character('c'),new Character('c')};

    String arrayAsString = Arrays.stream(chars)
            .map(Object::toString)
            .collect( Collectors.joining() );

    System.out.println(arrayAsString);
  }
}
