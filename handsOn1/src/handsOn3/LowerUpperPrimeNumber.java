package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Prime Numbers Between Two Limits
Description : This program finds and displays all prime numbers between a given
              lower and upper bound.
*/

public class LowerUpperPrimeNumber {

    static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    static void displayPrimeNumbers(int start, int end) {

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = scanf.nextInt();

        System.out.print("Enter end number: ");
        int end = scanf.nextInt();

        if (end >= start) {
            displayPrimeNumbers(start, end);
        } else {
            System.out.println("Please provide valid input");
        }
    }
}