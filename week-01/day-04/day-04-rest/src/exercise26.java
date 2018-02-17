import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {

        System.out.println("What is your first number?");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("What is your second number?");

        Scanner input2 = new Scanner(System.in);
        int secondNumber = input.nextInt();

        boolean bigger = secondNumber < firstNumber;

            if (bigger == true) {
                System.out.println("Second number should be bigger than first number!");
            } else {
                for (int a = firstNumber; a < secondNumber; a++) {
                    System.out.println(a); }
            }
        }
    }