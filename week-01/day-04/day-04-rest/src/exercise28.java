import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {

        System.out.println("What is your number?");

        Scanner input = new Scanner(System.in);
        int Magassag = input.nextInt();

        String csillag = "*";

        for (int sor = 0; sor < Magassag; sor++) {
            for (int oszlop = 0; oszlop<sor; oszlop++) {
                System.out.print(csillag);
            }
            System.out.println("");
        }
    }
}