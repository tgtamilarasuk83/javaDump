package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Separate Odd and Even Numbers
Description : This program separates numbers from 1 to 10 into two arrays (odd and even) and prints them.
*/

public class OddorEven {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int[] evenNumbers = new int[5];
        int[] oddNumbers = new int[5];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int number = 1; number <= 10; number++) {

            if (number % 2 == 0) { // check if number is even
                evenNumbers[evenIndex++] = number;
            } else { // number is odd
                oddNumbers[oddIndex++] = number;
            }
        }

        System.out.println("Even Numbers Array:");
        for (int index = 0; index < evenNumbers.length; index++) {
            System.out.print(evenNumbers[index] + " ");
        }

        System.out.println("\n");

        System.out.println("Odd Numbers Array:");
        for (int index = 0; index < oddNumbers.length; index++) {
            System.out.print(oddNumbers[index] + " ");
        }
    }
}