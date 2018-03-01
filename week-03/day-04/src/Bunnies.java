// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
  public static void main(String[] args) {
    int numberOfBunnies = 100;
    System.out.println(earcounter(numberOfBunnies));
  }

  private static int earcounter(int numberOfBunnies) {
    if (numberOfBunnies==0) {
      return 0;
    } return 2+earcounter(numberOfBunnies-1);
  }
}
