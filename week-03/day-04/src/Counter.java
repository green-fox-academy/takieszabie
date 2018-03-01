// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
  public static void main(String[] args) {
    int n = 134;
    System.out.println(counter(n));
  }

  private static int counter(int n) {
    if (n == 0) {
      return 0;
    }
    System.out.println(n);
    return counter(n-1);
  }
}
