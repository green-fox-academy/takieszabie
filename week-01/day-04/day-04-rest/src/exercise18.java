import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, give me a number!");

        double number=input.nextDouble();

        boolean evenOdd = ((number % 2) ==0);
        if(evenOdd == true) {
            System.out.println("This number is even.");}
            else{
            System.out.println("This number is odd.");
        }



        }

    }