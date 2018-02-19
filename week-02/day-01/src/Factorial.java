
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {
    public static void main(String[] args){
        int toBeFactored = 19;
        long factoredNumber = factorio(toBeFactored);
        System.out.println(factoredNumber);
    }

    public static long factorio (long inputNumber){
        long factoring = 1;
        for (int i = 1; i <= inputNumber; i++) {
            factoring = (factoring * i);
        }
        return factoring;
    }
}