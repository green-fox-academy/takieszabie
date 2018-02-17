import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {

        System.out.println("What is the number you want to multiply?");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int a = 1; a < 11; a++) {
            System.out.println(a + "*" + number + "=" + a*number);

        }
    }
}
