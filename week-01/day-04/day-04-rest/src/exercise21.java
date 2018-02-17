import java.util.Scanner;

public class exercise21 {

    public static void main(String[] args){

        System.out.println("How many girls are coming to the party?");

        Scanner input = new Scanner(System.in);
        int girls = input.nextInt();

        System.out.println("How many boys are coming to the party?");

        Scanner input2 = new Scanner(System.in);
        int boys = input.nextInt();

        int sum = girls + boys;
        boolean ratio = (boys == girls);

        if (girls <= 0){
            System.out.println("Sausage party");}
            else if (sum < 20){
            System.out.println("Average party");}
            else if (sum > 20 && ratio == true){
            System.out.println("Excellent party!");}
            else {
            System.out.println("Quite cool party!");
        }
    }
}
