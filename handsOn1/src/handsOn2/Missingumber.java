package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Missing Number in Array
Description : This program finds the missing number from 1 to 100 when 99 numbers are provided.
*/

public class Missingumber {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int[] numbers = new int[99];
        int sum = 0;

        System.out.println("Enter 99 numbers from 1 to 100 (one number missing):");

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanf.nextInt();
            sum += numbers[index];
        }

        int totalSum = (100 * 101) / 2;

        int missingNumber = totalSum - sum;

        System.out.println("The missing number is : " + missingNumber);
    }
}
