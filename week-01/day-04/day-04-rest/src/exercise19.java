import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {

        System.out.println("Please, type any number you like!");

        Scanner input = new Scanner(System.in);

        double number=input.nextDouble();



        if (number <= 0) {
            System.out.println("Not enough");}
            else if (number >0 && number <1){
            System.out.println("Please choose another number!");}
            else if (number ==1){
            System.out.println("One");}
            else if (number >= 1 && number < 2){
            System.out.println("Please choose another number!");}
            else if (number == 2) {
            System.out.println("Two");}
            else{
            System.out.println("A lot");}

        }


    }
