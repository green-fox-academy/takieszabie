public class Power {
  public static void main(String[] args) {
    int base = 2;
    int n = 10;
    System.out.println(power(base, n));
  }

  private static long power(int base, int n) {
    if (n==0){
      return 1;
    } return base*power(base, n-1);
  }
}