import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominos {
  public static void main(String[] args) {
    List<DominoThing> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    System.out.println(dominoes);
    sortDominos2(dominoes);
    sortDominos(dominoes);
    System.out.println(dominoes);
  }

  private static void sortDominos2(List<DominoThing> dominoes) {
    Collections.sort(dominoes);
    System.out.println(dominoes);
  }

  private static List sortDominos(List<DominoThing> dominoes) {
    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = i; j < dominoes.size(); j++) {
        if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
          dominoes.add(i + 1, dominoes.get(j));
          dominoes.remove(j + 1);
        }
      }
    }
    return dominoes;
  }

  static List<DominoThing> initializeDominoes() {
    List<DominoThing> dominoes = new ArrayList<>();
    dominoes.add(new DominoThing(5, 2));
    dominoes.add(new DominoThing(4, 6));
    dominoes.add(new DominoThing(1, 5));
    dominoes.add(new DominoThing(6, 7));
    dominoes.add(new DominoThing(2, 4));
    dominoes.add(new DominoThing(7, 1));
    return dominoes;
  }
}