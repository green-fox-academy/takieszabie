import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your km number!");
        double kilometer=input.nextDouble();

        double change = 1.609344;

        double miles = (double)(kilometer / change);

        System.out.println("Mérföldben ez: " + miles);

    }
}
