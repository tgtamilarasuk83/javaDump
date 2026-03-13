package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Absolute Difference Between Odd and Even Sum
Description : This program calculates the sum of odd and even numbers between two bounds
              and prints the absolute difference between them.
*/

public class AbsoluteDiff {

    static int calculateEvenSum(int lower, int upper) {
        int evenSum = 0;

        for (int number = lower; number <= upper; number++) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }

        return evenSum;
    }

    static int calculateOddSum(int lower, int upper) {
        int oddSum = 0;

        for (int number = lower; number <= upper; number++) {
            if (number % 2 != 0) {
                oddSum += number;
            }
        }

        return oddSum;
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lower = scanf.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = scanf.nextInt();

        int evenSum = calculateEvenSum(lower, upper);
        int oddSum = calculateOddSum(lower, upper);

        int difference = Math.abs(evenSum - oddSum);

        System.out.println("Sum of Odd numbers between " + lower + " and " + upper + " : " + oddSum);
        System.out.println("Sum of Even numbers between " + lower + " and " + upper + " : " + evenSum);
        System.out.println("Absolute Difference : " + difference);
    }
}