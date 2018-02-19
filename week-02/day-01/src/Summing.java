//  Create the usual class wrapper
//  and main method on your own.
// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Summing {
    public static void main(String[] args) {
        long toBeSummed = 10;
        long result = summer(toBeSummed);
        System.out.println(result);
    }

    public static long summer(long inputNumber) {
        long summing = 0;
        for (int i = 0; i <= inputNumber; i++) {
            summing += i;
        }
        return summing;
    }
}