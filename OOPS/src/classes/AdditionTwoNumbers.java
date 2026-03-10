

/*
Author: Tamilarasu
Program Title: Addition of Two Numbers
Description: This program reads two numbers from the user and prints their sum.
*/

import java.util.Scanner;

public class AdditionTwoNumbers {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int sum;

        System.out.print("Enter first number: ");
        firstNumber = scanf.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = scanf.nextInt();

        sum = firstNumber + secondNumber;

        System.out.println("Sum of two numbers = " + sum);

        scanf.close();
    }
}