import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 50;
    System.out.println(fibonacci(n));
  }

  private static int fibonacci(int n) {
    if (n==1){
      return 1;
    }else if (n==0){
      return 0;
    } return fibonacci(n-1)+fibonacci(n-2);
  }
}