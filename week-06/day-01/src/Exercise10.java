//Create a Fox class with 3 properties(name, type, color)
// Fill a list with at least 5 foxes, it's up to you how you name/create them!
// Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color and pallida type!

import java.util.Arrays;
import java.util.List;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxCollection = Arrays.asList(
            new Fox("Sanyi", "green", 1),
            new Fox("Gizi", "green", 11),
            new Fox("Lacci", "white", 21),
            new Fox("Zoli", "pink", 13),
            new Fox("Szabi", "purple", 41),
            new Fox("Pallida", "green", 19));

    System.out.println("Fox names with green color:");

    foxCollection.stream()
            .filter(f -> f.getColor().equals("green"))
            .forEach(f -> System.out.println(f.getName()));

    System.out.println("\nFox names with green color and pallida type/name:");

    foxCollection.stream()
            .filter(f -> f.getColor().equals("green"))
            .filter(f -> f.getName().equals("Pallida"))
            .forEach(f -> System.out.println(f.getName()));
  }
}
