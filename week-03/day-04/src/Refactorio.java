public class Refactorio {
  public static void main(String[] args) {
    int n = 10;
    System.out.println(refactorio(n));
  }

  private static int refactorio(int n) {
    if (n==1){
      return 1;
    } return n*refactorio(n-1);
  }
}