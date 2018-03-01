
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(numberadder(n));
  }

  private static int numberadder(int n) {
    if (n == 0) {
      return 0;
    }
    return n + numberadder(n - 1);
  }
}