// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {

    Scanner numberScanner = new Scanner(System.in);
    System.out.println("What should be 10's divider?");

    int inputNumber2 = numberScanner.nextInt();
    divider2(inputNumber2);
  }

  private static void divider2(int inputNumber2) {
    try {
      int result = 10/inputNumber2;
      System.out.println(result);
    }
    catch (ArithmeticException a) {
      System.out.println("Fail");
    }
  }

  private static void divider(double inputNumber) {
    if (inputNumber != 0) {
      double result = 10/inputNumber;
      System.out.println("The result is: " + result);
    } else {
      System.out.println("Fail");
    }
  }
}