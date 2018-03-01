// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {
  public static void main(String[] args) {
    int numberOfBunnies2 = 5;
    System.out.println(oddEarCounter(numberOfBunnies2));
  }

  private static int oddEarCounter(int numberOfBunnies2) {
    if (numberOfBunnies2==0){
      return 0;
    }
    else if (numberOfBunnies2 % 2 != 0) {
      return 2 +(oddEarCounter(numberOfBunnies2-1));
    } return 3 + (oddEarCounter(numberOfBunnies2 -1));
  }
}